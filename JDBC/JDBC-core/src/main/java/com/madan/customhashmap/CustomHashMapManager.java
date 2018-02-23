package com.avanseus.customhashmap;

import org.bytedeco.javacpp.presets.opencv_core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by madan on 23/2/18
 */
public class CustomHashMapManager {
    public static void main(String[] args) {
        CustomHashMap<String,String> customHashMap = new CustomHashMap<>();
        customHashMap.put("n","a");
        customHashMap.put("k","k");
        customHashMap.put("b","ss");
//        System.out.println(customHashMap.get("k"));
//        customHashMap.remove("k");
//        System.out.println(customHashMap.get("k"));
        System.out.println(customHashMap.toString());
        /*for (CustomHashMap.Entry<String,String>  entry: customHashMap.entrySet()){
            System.out.println(entry.getKey());
        }*/
        Map<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("c","b");
        System.out.println(map.toString());
//        for (Map.Entry<String,String> e : map.entrySet()){
//            System.out.println(e.getKey());
//        }

    }
}
