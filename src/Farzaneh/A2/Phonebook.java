package Farzaneh.A2;

import java.util.HashMap;

public class Phonebook {
    public static void main(String[] args) {

        HashMap< String, Integer > phoneBook = new HashMap <> ();

        phoneBook.put("Eva", 7846527);
        phoneBook.put("Riv", 2648890);
        phoneBook.put("Elsa", 8740836);
        phoneBook.put("F", 0634527);

        System.out.println(phoneBook);

        System.out.println(phoneBook.containsKey("Farzaneh"));
        System.out.println(phoneBook.containsKey("Eva"));

        phoneBook.remove("Elsa");
        System.out.println(phoneBook);


        for(String element: phoneBook.keySet()){
            System.out.println(element + ": " + phoneBook.get(element));

        }
    }
}
