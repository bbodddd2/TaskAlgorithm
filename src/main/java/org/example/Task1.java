package org.example;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args){
        CountWord("Apple juice postmalon  postmelon banana apple ");

    }


    public static void CountWord (String str){
        HashMap<String, Integer> array = new HashMap<>();
        String[] strR = str.split(" ");
        for( int i = 0; i < strR.length; i ++){
            if(strR[i].isEmpty()){
                continue;
            }
            if( array.containsKey(strR[i])){
                array.put(strR[i], array.get(strR[i] + 1));
            }else{
                array.put(strR[i], 1);
            }
        }
        for (String word : array.keySet()) {
            System.out.println(word + ":" + array.get(word));
        }




    }

}
