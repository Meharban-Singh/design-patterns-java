package observer.pushBasedObserver;

public class Spreadsheet implements Observer {
    private String name;

    public Spreadsheet(String name) {
        this.name = name;
    }

    @Override
    public void update(int value) {
        System.out.println("Spreadsheet " + this.name + " got notified!" + value);
    }
}
