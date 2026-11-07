public class Ship {
    private byte size;
    /*
        система координат: 0-9 (X), 0-9 (Y)
     */
    private byte xStart;
    private byte yStart;
    private byte xEnd;
    private byte yEnd;
    /* 0-целый, 1-ранен, 2-подбит */
    //public byte state;
    private byte[] statePart;

    public Ship(byte size, byte xStart, byte yStart, byte xEnd, byte yEnd) {
        this.size = size;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public byte getState() {
        for (int i = 0; i < statePart.length; ++i) {
            if (statePart[i] == 1) return 1;
            if (statePart[i] == 2) return 2;
        }
        return 0;
    }

    public byte[] getStatePart() {
        return statePart;
    }

    public byte getxStart() {
        return xStart;
    }

    public byte getSize() {
        return size;
    }

    public void setState(byte state) {
        for( ...)
        statePart[i] = 2;
    }

    public void setState(byte x, byte y) {

        statePart[..] = 1;
    }
}