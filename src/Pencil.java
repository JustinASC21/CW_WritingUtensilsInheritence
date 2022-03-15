public class Pencil extends WritingUtensils {
    private boolean hasEraser;

    public Pencil(String brandName,int length, boolean hasInk, boolean isBrandNew,boolean hasEraser) {
        super(length, hasInk, isBrandNew);
        this.hasEraser = hasEraser;
    }

    public void erase() {
        System.out.println("Pencil is erasing");
    }

    public boolean isHasEraser() {
        return hasEraser;
    }


}
