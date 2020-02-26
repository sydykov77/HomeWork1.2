package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle(12, "Rio",2, Color.BLUE, "Europe");
        System.out.println(eagle1.getInfo());
        eagle1.getColor();
        eagle1.getHabitat();



        Bird bird=new Bird(15,"FAD",5,Color.BLACK);
        System.out.println(bird.getInfo());
        bird.getColor();
        bird.getHabitat();


        Animal animal=new Animal(20,"BoBIK");
        System.out.println(animal.getInfo());
        animal.getHabitat();

    }

    }

