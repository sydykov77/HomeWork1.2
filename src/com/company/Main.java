package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle(12, "Rio", 2, "Black", "Europe");
        System.out.println(eagle1.getInfo());
        eagle1.getColor(Color.BLACK);


        Bird bird=new Bird(15,"FAD",5,"BLACK");
        System.out.println(bird.getInfo());
        bird.getColor(Color.GRAY);


        Animal animal=new Animal(20,"BoBIK");
        System.out.println(animal.getInfo());

    }

    }

