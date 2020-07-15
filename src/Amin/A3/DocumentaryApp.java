package Amin.A3;

import java.util.HashMap;

public class DocumentaryApp {

    public static void main(String[] args) {
        HashMap<String, HashMap<String , String >> words = new HashMap<>()
        {{
            put("Arrive", new HashMap<String , String >(){{
                put("Meaning", "to reach a destination");
                put("Description", "intransitive verb");
            }});
            put("Bored", new HashMap<String , String >(){{
                put("Meaning", "filled with or characterized by boredom");
                put("Description", "adjective");
            }});
            put("Java", new HashMap<String , String >(){{
                put("Meaning", "a coffee bean from Java in Indonesia");
                put("Description", "noun");
            }});
            put("Zebra", new HashMap<String , String >(){{
                put("Meaning", "an animal with black and white stripes");
                put("Description", "noun - plural zebras");
            }});
        }};

        for (String k1 : words.keySet()) {
            System.out.printf("%n%s: %n", k1);
            for (String k2 : words.get(k1).keySet()) // loop through hashMap of Meaning & Description
                System.out.printf("\t %s: %s%n", k2, words.get(k1).get(k2));
        }
    }
}
