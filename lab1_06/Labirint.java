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
        while (!isWin()) {
            showStatus();
            moves();
        }
        System.out.println("Победа! Лабиринт пройден за " + countStep + " шагов");
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

    static void moves(){
        String direction = getDirection();
        countStep++;
        switch (direction) {
            case "U": case "u":
                if (positionRow == 0){
                    break;
                }
                if(field[positionRow - 1][positionColumn] == 0) {
                    status[positionRow][positionColumn] = '#';
                    status[positionRow - 1][positionColumn] = '*';
                    positionRow -= 1;
                }else{
                    status[positionRow - 1][positionColumn] = 'x';
                }
                break;
            case "D": case "d":
                if (positionRow == field.length - 1){
                    break;
                }
                if(field[positionRow + 1][positionColumn] == 0) {
                    status[positionRow][positionColumn] = '#';
                    status[positionRow + 1][positionColumn] = '*';
                    positionRow += 1;
                }else{
                    status[positionRow + 1][positionColumn] = 'x';
                }
                break;

            case "L": case "l":
                if (positionColumn == 0){
                    break;
                }
                if(field[positionRow][positionColumn - 1] == 0) {
                    status[positionRow][positionColumn] = '#';
                    status[positionRow][positionColumn - 1] = '*';
                    positionColumn -= 1;
                }else{
                    status[positionRow][positionColumn - 1] = 'x';
                }
                break;

            case "R": case "r":
                if (positionColumn == field[0].length - 1){
                    break;
                }
                if(field[positionRow][positionColumn + 1] == 0) {
                    status[positionRow][positionColumn] = '#';
                    status[positionRow][positionColumn + 1] = '*';
                    positionColumn += 1;
                }else{
                    status[positionRow][positionColumn + 1] = 'x';
                }
                break;

        }

    }

    static boolean isWin() {
        return positionColumn == exitColumn && positionRow == exitRow;
    }
    // Описать структуру данных
    // вывод состояния
    // ввод направления
    // анализ хода, пересчет состояния
}
