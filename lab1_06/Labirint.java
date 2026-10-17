import java.util.Scanner;

public class Labirint {
    static byte field[][] = {
            {1,0,1,1,1},
            {1,0,0,1,1},
            {1,1,0,1,1},
            {1,0,0,0,0},
            {1,1,1,1,1}
    };
    static char status[][] = {
            {'_','*','_','_','_'},
            {'_','_','_','_','_'},
            {'_','_','_','_','_'},
            {'_','_','_','_','_'},
            {'_','_','_','_','_'}
    };
    static int positionRow = 0;
    static int positionColumn = 1;
    static int exitRow = 3;
    static int exitColumn = 4;
    static int countStep = 0;
    public static void main(String[] args) {
        showStatus();
        getDirection();
    }

    public static void showStatus(){
        for (int i = 0; i < status.length; i++) {
            for (int j = 0; j < status[i].length; j++) {
                System.out.print(status[i][j]);
            }
            System.out.println();
        }
    }

    static String getDirection() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите направление: ");
            String direction = scanner.nextLine();
            switch (direction) {
                case "U":
                case "D":
                case "L":
                case "R":
                case "u":
                case "d":
                case "l":
                case "r":
                    return direction;
                default:
                    System.out.println("Вы ввели неверны символ! Допустимые символы: U, D, R, L");
                    break;
            }
        }
    }
    // Описать структуру данных
    // вывод состояния
    // ввод направления
    // анализ хода, пересчет состояния
}
