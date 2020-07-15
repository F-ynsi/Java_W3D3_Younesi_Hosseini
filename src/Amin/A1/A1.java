package Amin.A1;

import java.util.HashMap;

public class A1 {

    public static void main(String[] args) {
        HashMap<String , String > hashHashMap = new HashMap<>()
        {{
            put("CarOne", "911GT");
            put("CarTwo", "GLS");
            put("CarThree", "McLP1");

        }};
        System.out.println("\nDoes my hashMap have key 'CarOne' ? " + hashHashMap.containsKey("CarOne"));;
        System.out.println("The size of my hashMap is: " + hashHashMap.size());


        System.out.println("\n====================== printing all key-value pairs ========================");
        for (String key : hashHashMap.keySet()) {
            System.out.printf("%n%s is %s.%n", key, hashHashMap.get(key));
        }



        System.out.println("\n====================== print after removing CarOne =======================");
        hashHashMap.remove("CarOne");
        for (String key : hashHashMap.keySet()) {
            System.out.printf("%n%s is %s.%n", key, hashHashMap.get(key));
        }


        System.out.println("\n=================== print after replacing CarTwo value ====================");
        hashHashMap.replace("CarTwo", "Maybach");
        for (String key : hashHashMap.keySet()) {
            System.out.printf("%n%s is %s.%n", key, hashHashMap.get(key));
        }

        hashHashMap.replace("CarFour", "X7");
        System.out.println(hashHashMap);
    }

}
