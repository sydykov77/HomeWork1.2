package com.company;

public class Animal {
    private int weight;
    private String name;
    Habitat habitat;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;

    }

    public Habitat getHabitat() {
        return habitat;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "||Вес:"+weight+"|| "+
                "Имя:"+name+"||"+"Место обитание:"+habitat+"||";
    }
}
