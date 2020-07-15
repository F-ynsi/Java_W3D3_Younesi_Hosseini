package Amin.A3;

import java.util.HashMap;

public class DocumentarySecondVersion {
    public static void main(String[] args) {
        HashMap<String, String[]> words = new HashMap<>();
        words.put("ARRIVE", new String[]
                {
                        "intransitive verb",
                        "to reach a destination"
                });
        
        words.put("JAVA", new String[]
                {
                        "noun",
                        "a coffee bean from Java in Indonesia"
                });

        words.put("BORED", new String[]
                {
                        "adjective",
                        "filled with or characterized by boredom"
                });

        words.put("ZEBRA", new String[]
                {
                        "noun - plural zebras",
                        "an animal with black and white stripes"
                });
        
        
        for (String key : words.keySet()) {
            System.out.printf("%n%s: \033[3m %s \033[0m" +
                    "%n\033[3m \t%s. \033[0m %n", key, words.get(key)[0], words.get(key)[1]);
        }


    }



}
