import java.util.Random;

public class Turtle extends Animal {

    public Turtle(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void move() {
        int[] currentDirection = direction;
        int[] step = rndStep();
        int newX = x + step[0];
        int newY = y + step[1];

        if (newX < 0 || newX > Game.fieldWidth || newY < 0 || newY > Game.fieldHeight) {
            direction = currentDirection;
        } else {
            x = newX;
            y = newY;
        }
    }

    private int[] rndStep() {
        Random random = new Random();
        int step = random.nextInt(5);
        if (direction[0] == 0 && direction[1] == -1)  //вверх
            switch (step) {
                case 0: direction[0] = -1;direction[1] = 0;return new int[] {-1,0};
                case 1: return new int[] {-1,-1};
                case 2: return new int[] {0,-1};
                case 3: return new int[] {1,-1};
                case 4: direction[0] = 1;direction[1] = 0;return new int[] {1,0};
            }
        else if (direction[0] == -1 && direction[1] == 0)  //влево
            switch (step) {
                case 0: direction = new int[] {0,1};return new int[] {0,1};
                case 1: return new int[] {-1,1};
                case 2: return new int[] {-1,0};
                case 3: return new int[] {-1,-1};
                case 4: direction = new int[] {0,-1};return new int[] {0,-1};
            }
        else if (direction[0] == 0 && direction[1] == 1)  //вниз
            switch (step) {
                case 0: direction = new int[] {1,0};return new int[] {1,0};
                case 1: return new int[] {1,1};
                case 2: return new int[] {0,1};
                case 3: return new int[] {-1,1};
                case 4: direction = new int[] {-1,0};return new int[] {-1,0};
            }
        else if (direction[0] == 1 && direction[1] == 0)  //вправо
            switch (step) {
                case 0: direction = new int[] {0,-1};return new int[] {0,-1};
                case 1: return new int[] {1,-1};
                case 2: return new int[] {1,0};
                case 3: return new int[] {1,1};
                case 4: direction = new int[] {0,1};return new int[] {0,1};
            }
        return null;
    }
}
