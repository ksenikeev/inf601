package ru.itis.inf601.lab1_12.map;

public class MapService {
    public ICalculateRoute calculateRoute;

    public MapService(ICalculateRoute calculateRoute) {
        this.calculateRoute = calculateRoute;
    }

    public RouteData calculateRoute(String start, String end) {
        return calculateRoute.calculate(start, end);
    }
}
