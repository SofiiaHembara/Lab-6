package flowerstore;

/**
 * Main class to demonstrate the functionality of the flower store.
 */
public final class Main {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private Main() {
        // Utility class, no instantiation needed
    }

    /**
     * Entry point for the flower store application.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        final int flowerPrice = 100;
        final int flowerPackCount1 = 5;
        final int flowerPackCount2 = 10;
        final int updatedPrice = 10;

        Flower flower = new Flower();
        flower.setPrice(flowerPrice);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();

        FlowerPack flowerPack = new FlowerPack(flower, flowerPackCount1);
        flowerBucket.add(flowerPack);

        FlowerPack flowerPack2 = new FlowerPack(flower, flowerPackCount2);
        flowerBucket.add(flowerPack2);

        System.out.println(flowerBucket.getPrice());

        flower.setPrice(updatedPrice);

        System.out.println(flowerBucket.getPrice());
    }
}
