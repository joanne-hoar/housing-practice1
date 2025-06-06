import java.util.Random;

public class Housing {
    public static void main(String[] args) {
        House house;
        double floorArea;
        double totalFloorArea = 0;
        Random rand = new Random();

        System.out.println("Building and selling 3 houses:");
        for (int i = 0; i < 3; i++) {
            floorArea = 1000 + (rand.nextDouble() * (2500 - 1000));
            house = new House();
            System.out.print("House " + (i + 1) + " floor area: ");
            house.build(floorArea);
            totalFloorArea += floorArea;
            System.out.print("House " + (i + 1) + " sale price: ");
            house.sell();
        }
        System.out.println("Total floor area of all houses: " + totalFloorArea);
    }
}