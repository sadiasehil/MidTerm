package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "NJ");
        map.put(4, "BO");
        map.put(5, "CA");
        map.put(6, "VA");
        System.out.println(" the values present in  the map using a loop ");

        for(Map.Entry<Integer, String> m: map.entrySet())

                System.out.println(m.getKey() + "---> " + m.getValue());


    }

}
