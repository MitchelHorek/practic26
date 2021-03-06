package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Amanda","Seyfried");
        map.put("Brendan","Fraser");
        map.put("Tiffany","Haddish");
        map.put("Keith","Keith");
        map.put("Steve","Jobs");
        map.put("Stephen","Hawking");
        map.put("Marie","Curie");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
        System.out.println("Задача 2");
        Ex2 ex2 = new Ex2();
        ex2.work();
    }
}