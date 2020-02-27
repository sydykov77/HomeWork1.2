package com.company;

public class Animal {
    private int weight;
    private String name;
    Habitat habitat;

    public Animal(int weight, String name,Habitat habitat) {
        this.weight = weight;
        this.name = name;
        this.getName(habitat);

    }

    public Habitat getHabitat(Habitat habitat) {
        return habitat;
    }

    public int getWeight() {
        return weight;
    }

    public String getName(Habitat habitat) {
        return name;
    }


    public String getInfo() {
        return "||Вес:"+weight+"|| "+
                "Имя:"+name+"||"+"Место обитание:"+habitat.getName()+"||";
    }
}
