package org.utils;

import java.util.*;

public class HashMapUtils {
    public static HashMap<String, String> randomMix(){
        HashMap<String, String> hashMap = new HashMap<String, String>();

        return hashMap;
    }

    public static HashMap<String, String> getRandomEntries(int number, HashMap<String, String> hashMap){
        HashMap<String, String> hashMapResult = new HashMap<String, String>();
        for(int i=0; i<=number;i++){
            Random randomNum = new Random(hashMap.size()-1);
            hashMap.get(i);
            //hashMapResult.put(hashMap.get(i));
        }

        return hashMap;
    }

    public static HashMap<String, String> arrayListToHashMap (ArrayList<String> list) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try{
            for(String item :list){
                Map.Entry<String, String> stringPair = StringUtils.stringToPair(item);
                hashMap.put(stringPair.getKey(), stringPair.getValue());
            }
        }catch (Exception e){

        }

        return hashMap;
    }

}
