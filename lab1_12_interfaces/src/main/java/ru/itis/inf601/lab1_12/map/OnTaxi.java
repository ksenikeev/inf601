package ru.itis.inf601.lab1_12.map;

public class OnTaxi implements ICalculateRoute {
    @Override
    public RouteData calculate(String start, String end) {
        return new RouteData(300, 20);
    }
}
