public class House {
    private double floorArea;
    private double salePrice;

    public void build(double floorArea) {
        this.floorArea = floorArea;
        System.out.println(floorArea);
    }

    public void sell() {
        this.salePrice = 150 * this.floorArea;
        System.out.println(this.salePrice);
    }
}