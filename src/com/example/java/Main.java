package com.example.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Anna");
        hmap.put(2, "Alex");
        hmap.put(3, "Betty");
        hmap.put(4, "John");
        hmap.put(5, "John");

        InvertMap imap = new InvertMap();
        System.out.println("Initial map:" + hmap);
        System.out.println("Value of reversed " + imap.invert(hmap));
    }
}
