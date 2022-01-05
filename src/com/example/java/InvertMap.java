package com.example.java;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Anna");
        hmap.put(2, "Alex");
        hmap.put(3, "Betty");
        hmap.put(4, "John");
        hmap.put(5,"John");

        System.out.println("Initial map:" + hmap);

        HashMap<Integer, ArrayList<String>> reversedmap = new HashMap<>();

        Set entrySet = hmap.entrySet();
        Iterator it = entrySet.iterator();

        while (it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            ArrayList<String> names = new ArrayList<>();
            names.add((String) me.getValue());
            reversedmap.put((Integer)me.getKey(), names);
        }

        System.out.println("Value of reversed " + reversedmap);

    }
}
