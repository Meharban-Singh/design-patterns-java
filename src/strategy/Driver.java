package strategy;

/*
 * Strategy Design patter
 * =======================
 *
 * Use when you need to apply a set of algorithms(called as strategies) to some object.
 * In this example, we can create an image repo with any compressing algorithm and any
 * filter. Any image stored in the repo will have that filter and compressor applied.
 * To achieve this, we create an interface for each of the Compressor and Filter classes and
 * the ImageRepository HAS-A compressor and it HAS-A Filter associated with it.
 *
 * We prefer HAS-A over IS-A relationship since it gives more control.
 */
public class Driver {

    public static void main(String[] args) {
        ImageRepository repo = new ImageRepository(new JPEGCompressor(), new BlackAndWhiteFilter());

        repo.store("BlackAndWhite");
    }
}
