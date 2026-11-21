public abstract class Animal {

    protected String name;
    protected int x;
    protected int y;
    protected int[] direction;

    public Animal(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        direction = new int[]{0,1};
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
