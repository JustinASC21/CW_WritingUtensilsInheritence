public class Pen extends WritingUtensils {
    private boolean isGelPen;
    private String brandName;

    public Pen(String brandName, int length, boolean hasInk, boolean isBrandNew, boolean isGelPen) {
        super(length,hasInk,isBrandNew);
        this.isGelPen = isGelPen;
        this.brandName = brandName;
    }

    public void replaceInkCartridge() {
        System.out.println("The ink cartridge has been replaced");
    }

    public String getBrandName() {
        return brandName;
    }

    public boolean isGelPen() {
        return isGelPen;
    }
}
