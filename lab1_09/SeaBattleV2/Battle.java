public class Battle {

    public SeaBattleField seaBattleField;

    public Battle() {
        System.out.println("Battle");
        seaBattleField = new SeaBattleField();

        System.out.println(seaBattleField.ships);
        //seaBattleField.createField();
        seaBattleField.showField();
    }
}