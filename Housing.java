/**
 * Demonstrates building and selling multiple houses.
 * Generates random floor areas for each house, builds and sells them,
 * and prints the total floor area.
 *
 * Author: Joanne Hoar
 */
import java.util.Random;

public class Housing {
    /**
     * Main method to build and sell 3 houses with random floor areas.
     * Prints the floor area and sale price for each house,
     * and the total floor area at the end.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double totalFloorArea = 0.0;
        Random random = new Random();
        System.out.println("Building and selling 3 houses:");

        for (int i = 0; i < 3; ++i) {
            // Generate a random floor area between 1000.0 and 2500.0
            double floorArea = 1000.0 + random.nextDouble() * 1500.0;
            House house = new House();
            System.out.print("House " + (i + 1) + " floor area: ");
            house.build(floorArea);
            totalFloorArea += floorArea;
            System.out.print("House " + (i + 1) + " sale price: ");
            house.sell();
        }

        System.out.println("Total floor area of all houses: " + Math.round(totalFloorArea));
    }
}