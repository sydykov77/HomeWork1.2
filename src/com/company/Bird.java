package com.company;

import java.util.Random;

public class Bird extends Animal {
    private int age = generateDefaultAge();
    Color  color;



    public Bird(int weight, String name,Habitat habitat, int age, Color Color) {
        super(weight, name,habitat);
        this.age = age;
        this.color=Color;
    }

    public int getAge() {
        return age;
    }

    public Color getColor(){
        return color;
    }
    private int generateDefaultAge() {
        Random r = new Random();
        return r.nextInt(100);

    }
    public void makeMusic1(int age,String music){
        for (int i = 0; i < age; i++) {
            System.out.println(music);

        }

    }
    public void makeMusic2(String music){
        System.out.println("тю тю тю");
    }
    public final void makeMusic3(String music,int weight){
        for (int i = 0; i <weight; i++) {
            System.out.println(music);

        }
    }

    public String getInfo() {
        return super.getInfo() +" Возраст:"+ age + " ||Цвет:" + color+"||" ;
    }
}
