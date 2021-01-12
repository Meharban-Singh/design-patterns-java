package strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Adding black and white filter to " + fileName);
    }
}
