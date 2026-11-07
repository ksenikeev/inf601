import java.util.Random;

public class SeaBattleField {

    public Ship[] ships;

    /*
        0-пустая, 1-ранен, 2-подбит, 3-корабль, 4-промах
     */
    public byte[][] battleField;

    public SeaBattleField() {
        System.out.println("SeaBattleField");
        createField();
    }

    private void createField() {
        ships = new Ship[10];
        battleField = new byte[10][10];

        Random random = new Random();
        int i = random.nextInt(10);

        System.out.println(ships[0]);
        /*
            создать корабли, назначая их расположение (ориентация, координаты носа)
            случайным образом

            вывести игровое поле в консоль
         */
    }
}