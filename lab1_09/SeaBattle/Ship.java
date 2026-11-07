public class Ship {
    public byte size;
    /*
        система координат: 0-9 (X), 0-9 (Y)
     */
    public byte xStart;
    public byte yStart;
    public byte xEnd;
    public byte yEnd;

    public byte state;
    public byte[] statePart;

    public Ship(byte size, byte xStart, byte yStart, byte xEnd, byte yEnd) {
        this.size = size;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }
}