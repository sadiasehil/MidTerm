package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */
    public static void main(String[] args) throws Exception {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=79d60c2bbb5a44b888c22e2ac67c9eb4";
        NewsDataModel news = null;
        List<NewsDataModel> list1 = new ArrayList<>();
        URL url1 = new URL(sURL);
        URLConnection request = url1.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonObject rootObj = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray =  root.getAsJsonArray();
        }

        //if root is an Json object
        if(jsonArray==null)
            jsonArray= rootObj.getAsJsonArray("articles");

        //initialize field to construct HeadlineNews ogject
        String  source = null;
        String  author = null;
        String title = null;
        String description = null;
        String url = null ;
        String urlToImage = null ;
        String publishedAt = null ;
        String  content = null;


        for (int i = 0; i < jsonArray.size()-1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();

                source= jsonobject.get("source").toString();
                author= jsonobject.get("author").toString();
                title = jsonobject.get("title").toString();
                description = jsonobject.get("description").toString();
                url= jsonobject.get("url").toString();
                urlToImage= jsonobject.get("urlToImage").toString();
                publishedAt = jsonobject.get("publishedAt").toString();
                content = jsonobject.get("content").toString();

                //Object of HeadlineNews
                news = new NewsDataModel(source,author,title,description,url,urlToImage,publishedAt,content);
                list1.add(news);


            }catch(Exception ex){

            }
        }
        //Storing to Database

    }
}
