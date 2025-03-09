package org.utils;

import java.util.*;

public class HashMapUtils {

    public static <T> Object randomKeyValuePair(HashMap<T, T> hashMap) throws Exception{
        Random randomNum = new Random();
        Object[] arrayHashMap = hashMap.entrySet().toArray();

        return arrayHashMap[randomNum.nextInt(arrayHashMap.length)];
    }

    public static <T> Object getValueByIndex(HashMap<String, String> hashMap, int index) throws Exception{
        List keys = new ArrayList(hashMap.keySet());

        return keys.get(index);
    }

    public static HashMap<String, String> arrayListToHashMap (ArrayList<String> list) throws Exception{
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for(String item :list){
            if(!item.isEmpty()){
                Map.Entry<String, String> stringPair = StringUtils.stringToPair(item);
                hashMap.put(stringPair.getKey(), stringPair.getValue());
            }
        }

        return hashMap;
    }

    public void checkMapEntryIsEmpty(){

    }

}
