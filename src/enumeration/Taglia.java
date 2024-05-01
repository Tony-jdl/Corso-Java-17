package src.enumeration;

public enum Taglia {
    EXTRASMALL(1),
    SMALL(2),
    MEDIUM(3),
    LARGE(4),
    EXTRALARGE(5);

    // in questo modo è possibile associare ad ogni enum un valore, come in questo esempio, di tipo numerico

    private int valore;

    Taglia(int valore){
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }
}
