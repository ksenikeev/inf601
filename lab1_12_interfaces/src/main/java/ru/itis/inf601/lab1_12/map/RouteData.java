package ru.itis.inf601.lab1_12.map;

public class RouteData {
    private int cost;
    private int time;

    public RouteData(int cost, int time){
        this.cost = cost;
        this.time = time;

    }

    public int getCost(){
        return cost;
    }

    public int getTime(){
        return time;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setTime(int time) {
        this.time = time;
    }
}


