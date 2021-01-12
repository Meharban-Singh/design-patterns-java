package strategy;

public class VintageFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Adding vintage filter to " + fileName);
    }
}
