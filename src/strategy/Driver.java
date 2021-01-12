package strategy;

public class Driver {

    public static void main(String[] args) {
        ImageRepository repo = new ImageRepository(new JPEGCompressor(), new BlackAndWhiteFilter());

        repo.store("BlackAndWhite");
    }
}
