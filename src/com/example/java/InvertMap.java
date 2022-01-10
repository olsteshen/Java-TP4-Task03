package com.example.java;

import java.util.*;

public class InvertMap {
    public <K,V> HashMap<V, Collection<K>> invert(Map<K,V> amap) {
        HashMap<V, Collection<K>> reversedmap = new HashMap<>();
        Set<K> keys = amap.keySet();
        for(K key: keys){
            V value = amap.get(key);
            reversedmap.compute(value, (a,b) -> {
               if(b==null){
                    b = new HashSet<>();
                }
                b.add(key);
            return b;
            });
        }
    return reversedmap;



    }
}
