package ru.itis.inf601.lab1_12.map;

public class OnFoot implements ICalculateRoute {
    @Override
    public RouteData calculate(String start, String end) {
        return new RouteData(0, 90);
    }
}
