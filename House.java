/**
 * Represents a house with a floor area and sale price.
 * Provides methods to build the house and calculate its sale price.
 *
 * Author: Joanne Hoar
 */
public class House {
    // The floor area of the house in square units
    private double floorArea;
    // The sale price of the house
    private double salePrice;

    /**
     * Builds the house by setting its floor area.
     * Prints the floor area to the console.
     *
     * @param floorArea the floor area of the house
     */
    public void build(double floorArea) {
        this.floorArea = floorArea;
        System.out.println(floorArea);
    }

    /**
     * Calculates and sets the sale price of the house based on its floor area.
     * Prints the sale price to the console.
     */
    public void sell() {
        this.salePrice = 150 * this.floorArea;
        System.out.println(this.salePrice);
    }
}