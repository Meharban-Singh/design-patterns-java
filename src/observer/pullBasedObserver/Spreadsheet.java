package observer.pullBasedObserver;

public class Spreadsheet implements Observer {
    private String name;
    private DataSource dataSource;

    public Spreadsheet(String name, DataSource dataSource) {
        this.name = name;
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet " + this.name + " notified with " + this.dataSource.getValue());
    }
}
