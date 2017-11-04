package com.example.animalsworld.model;

import java.util.ArrayList;

/**
 * Created by Lenovo on 4/11/2560.
 */

public class AnimalList {
    private static ArrayList<Animal> animalList;

    public static ArrayList<Animal> getContext() {
        if (animalList == null) {
            animalList = new ArrayList<>();
        }
        return animalList;
    }
}
