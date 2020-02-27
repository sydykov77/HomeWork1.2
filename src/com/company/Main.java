package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle(12, "Rio",2,new Habitat("URAAAA"), Color.BLUE, "Europe");
        System.out.println(eagle1.getInfo());
        eagle1.getColor();



        Bird bird=new Bird(15,"FAD",new Habitat("NAKONEC"),5,Color.BLACK);
        System.out.println(bird.getInfo());
        bird.getColor();
        bird.makeMusic2("UUUUUUUU");



        Animal animal=new Animal(20,"BoBIK",new Habitat("UHHH"));
        System.out.println(animal.getInfo());

    }

    }

