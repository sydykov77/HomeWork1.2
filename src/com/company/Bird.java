package com.company;

import java.util.Random;

public class Bird extends Animal {
    private int age = generateDefaultAge();
    String Color;



    public Bird(int weight, String name, int age,String Color) {
        super(weight, name);
        this.age = age;
        this.Color= Color;
    }

    public int getAge() {
        return age;
    }

    public String getColor(com.company.Color black) {
        return Color;
    }
    private int generateDefaultAge() {
        Random r = new Random();
        return r.nextInt(100);

    }
    private void makeMusic1(int age,String music){
        for (int i = 0; i < age; i++) {
            System.out.println(music);

        }

    }
    private void makeMusic2(String music){
        System.out.println("тю тю тю");
    }
    private final void makeMusic3(String music,int weight){
        for (int i = 0; i <weight; i++) {
            System.out.println(music);

        }
    }

    public String getInfo() {
        return super.getInfo() +" Возраст:"+ age + " ||Цвет:" + Color+"||" ;
    }
}
