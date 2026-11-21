import java.util.Random;

public class SomeBody extends Animal {

    public SomeBody(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void move() {
        Random random = new Random();
        int newX = random.nextInt(-50, 50);
        int newY = random.nextInt(-50, 50);

        if (x + newX >= 0 && x + newX <= Game.fieldWidth) {
            x += newX;
        }

        if (y + newY >= 0 && y + newY <= Game.fieldHeight) {
            y += newY;
        }
    }
}
