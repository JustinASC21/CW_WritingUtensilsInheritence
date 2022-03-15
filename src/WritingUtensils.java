public class WritingUtensils {
    private boolean hasInk;
    private int length;
    private boolean isBrandNew;

    public WritingUtensils(int length, boolean hasInk,boolean isBrandNew) {
        this.length = length;
        this.hasInk = hasInk;
        this.isBrandNew = isBrandNew;
    }

    public void write(String phrase) {
        System.out.println(phrase + " has been written");
    }

    public int getLength() {
        return length;
    }

    public boolean isHasInk() {
        return hasInk;
    }

    public boolean isBrandNew() {
        return isBrandNew;
    }
}
