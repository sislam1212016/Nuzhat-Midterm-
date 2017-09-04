package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Nuzhat goes to Pace University. Nuzhat attends PeopleNTech. Nuzhat likes to daces.";

        String[] splitWords = st.split(" ");

        Map<String,Integer> wordMap = new HashMap<>();

        for ( String word : splitWords ) {
            Integer count = wordMap.get(word);
            if (count == null) {
                count = 0;
            }
            wordMap.put(word, count + 1);
        }

        for(Map.Entry<String, Integer> s : wordMap.entrySet()){
            System.out.println("'"+ s.getKey() + "'" + ": " + s.getValue() + " time(s)");
        }

    }

}