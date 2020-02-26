package com.company;

import java.util.Random;

public class Animal {
    private int weight;
    private String name;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "||Вес:"+weight+"|| "+
                "Имя:"+name+"||";
    }
}
