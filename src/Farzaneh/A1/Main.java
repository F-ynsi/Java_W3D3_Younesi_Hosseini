package Farzaneh.A1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //1
        HashMap< String, String > myHashMap = new HashMap < String, String > ();
        //2
        myHashMap.put("Color01", "Orange");
        myHashMap.put("Color02", "Black");
        myHashMap.put("Color03", "Gray");
        myHashMap.put("Color04", "Blue");
        //3
        System.out.println(myHashMap.containsKey("Color03"));
        //4
        System.out.println(myHashMap.size());
        //5
        System.out.println(myHashMap);

        //6
        for(String i : myHashMap.keySet()) {
            System.out.println("Key: " + i + "   Value: " + myHashMap.get(i));
        }
        //7
        System.out.println(myHashMap.remove("Color04"));
        System.out.println(myHashMap);
        //8
        myHashMap.replace("Color03", "Brown");
        System.out.println(myHashMap);
        //9




    }
}
