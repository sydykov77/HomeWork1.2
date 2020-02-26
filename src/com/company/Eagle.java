package com.company;

public final class Eagle extends Bird {
    private int speed;
    private String home;

    public Eagle(int weight, String name, int age, Color color, String home) {
        super(weight, name, age, color);
        this.speed = getSpeed();
        this.home = getHome();


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

