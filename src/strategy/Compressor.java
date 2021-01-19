package strategy;

public interface Compressor {
    /**
     * Compresses the file
     *
     * @param fileName The name of the file to be compressed.
     */
    void compress(String fileName);
}
