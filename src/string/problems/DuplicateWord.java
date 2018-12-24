package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        duplicateWord(st);

    }
public static void duplicateWord (String str){
        String[] word= str.split(" ");
    int wrc=1;
    String duplicate;
    for(int i=0;i<word.length;i++)		//Outer loop for Comparison
    {
        for(int j=i+1;j<word.length;j++)	//Inner loop for Comparison
        {

            if(word[i].equals(word[j]))	//Checking for both strings are equal
            {
                wrc=wrc+1;	//if equal increment the count
                duplicate=word[i];
                System.out.print(duplicate+" ");
                word[j]="0";			//Replace repeated words by zero
            }
        }
        if(word[i]!="0")
            System.out.println(word[i]+"   "+wrc);	//Printing the word along with count
        wrc=1;

    }
}
}
