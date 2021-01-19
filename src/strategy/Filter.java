package strategy;

public interface Filter {
    /**
     * Applies the filter to the image
     *
     * @param fileName The name of the file to apply the filter to.
     */
    void apply (String fileName);
}
