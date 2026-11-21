public class Game {

    public static int fieldWidth = 999;
    public static int fieldHeight = 999;

    private int rectX1 = 600;
    private int rectY1 = 400;
    private int rectX2 = 800;
    private int rectY2 = 500;
    private Animal[] gamers;

    private ISendWinner winnerSender;

    public Game(ISendWinner winnerSender) {
        gamers = new Animal[2];
        gamers[0] = new Turtle("Фанис", 500, 0);
        gamers[1] = new SomeBody("Маша", 500,0);
        this.winnerSender = winnerSender;
    }

    public void start() {
        boolean isWinner = false;
        while (!isWinner) {
            for (int i = 0; i < gamers.length; i++) {
                gamers[i].move();
                System.out.println(gamers[i].getName() + ": " + gamers[i].getX() + ", " + gamers[i].getY());
                if (isWinner(gamers[i])) {
                    isWinner = true;
                    if (winnerSender != null)
                        winnerSender.send(gamers[i]);
                    System.out.println("Победитель:" + gamers[i].getName());
                    break;
                }
            }

        }
    }

    public boolean isWinner(Animal animal) {
        if (animal.getX() >= rectX1 && animal.getX() <= rectX2 &&
                animal.getY() >= rectY1 && animal.getY() <= rectY2)
            return true;

        return false;
    }

}
