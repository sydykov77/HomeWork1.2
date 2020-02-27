package com.company;

public final class Eagle extends Bird {
    private int speed;
    private String home;

    public Eagle(int weight, String name, int age, Habitat habitat, Color color, String home) {
        super(weight, name,habitat, age, color);
        this.speed = speed;
        this.home = home;


    }

    private int getSpeed() {
        return speed;
    }

    private String getHome() {
        return home;
    }

    public final String getInfo() {
        return super.getInfo() +" Скорость:"+ speed + " ||Дом:" + home +"||";
    }


}

