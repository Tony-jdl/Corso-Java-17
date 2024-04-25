package src.record;

import java.util.Random;

class MyRandom {
    private int valore = 0;
    private Random r = new Random();

    public void setValore() {
        valore = r.nextInt(50);
    }

    public int getValore() {
        return valore;
    }
}