package ru.itis.inf601.lab1_12.map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ICalculateRoute calculator = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Откуда отправляетесь");
        String start = scanner.nextLine();
        System.out.println("Куда направляетесь");
        String end = scanner.nextLine();
        System.out.println("Выберите вид транспорта: 1 - такси, 2 - автобус, 3 - пешком");
        int select = scanner.nextInt();

        switch(select) {
            case 1:
                calculator = new OnTaxi();
                break;
            case 2:
                calculator = new OnBus();
                break;
            case 3:
                calculator = new OnFoot();
                break;
        }

        MapService mapService = new MapService(calculator);

        RouteData result = mapService.calculateRoute(start,end);

        System.out.println("Ваша поездка " +
                result.getCost() + " " + result.getTime());


    }
}
