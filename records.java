package org.example;

import java.util.HashMap;
import java.util.Map;

public class records {
    static Map<String, Integer> mp = new HashMap<>();
    public static void totalRecord(){
        mp.put("R",0);
        mp.put("P",0);
        mp.put("S",0);
    }

    public static void showRecords(){
        for(String i : mp.keySet()){
            System.out.println(i + " : " + mp.get(i));
        }
    }

    public static void updateRecords(String input, int answer){
        mp.put(input,answer);
    }


}
