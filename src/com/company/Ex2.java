package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ex2 {
    public static void work()
    {
        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        List<City> cities = List.of(
                new City("Prague", "Czech"),
                new City("Washington", "USA"),
                new City("Berlin", "Germany"),
                new City("Rome", "Italy"),
                new City("Warsaw", "Poland"),
                new City("Kiev", "Ukraine")
        );

        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
