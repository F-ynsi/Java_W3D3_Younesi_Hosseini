package Farzaneh.A3;

import java.util.HashMap;
import java.util.List;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String[] > dictionary = new HashMap<>();

        String[] goArray = {"move from one place to another", "Verb and Noun"};
        dictionary.put("Go", goArray);

        String[] redArray = {"Is a color", "Adjective and Noun"};
        dictionary.put("Red", redArray);

        String[] bedArray = {"a piece of furniture for sleep or rest", "Noun"};
        dictionary.put("Bed", bedArray);

        System.out.println(dictionary.containsKey("Food"));
        dictionary.remove("Red");
        System.out.println(dictionary);

        for (String element: dictionary.keySet()){
            System.out.println("Word is: " + element + ". Meaning is: " +
                    dictionary.get(element)[0] + ".  Description is: " +
                    dictionary.get(element)[1]);

        }

    }

}
