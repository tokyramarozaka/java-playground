package oop.basics;

import java.util.ArrayList;

public class Robot {
    int x;
    int y;
    String direction;

    Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = "NORD";
    }

    void avancer(){
        switch(this.direction){
            case "NORD" -> this.y++;
            case "SUD" -> this.y--;
            case "EST" -> this.x++;
            case "OUEST" -> this.x--;
        }
    }

    void tourner(){
        this.direction = switch(this.direction){
            case "NORD" -> "EST";
            case "EST" -> "SUD";
            case "SUD" -> "OUEST";
            case "OUEST" -> "NORD";
            default -> this.direction;
        };
    }


    public static void main(String[] args) {

    }
}
