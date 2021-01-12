package strategy;

/**
 * Prefer  HAS-A over IS-A relationship.
 *
 * Everything that varies (Compressor and Filter in this example, we implement interfaces for them)
 *
 * As image is stored, we want to compress using some algo and filter to some filter.
 */
public class ImageRepository {
    private Compressor compressor;
    private Filter filter;

    public ImageRepository(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        this.compressor.compress(fileName);
        this.filter.apply(fileName);
    }
}
