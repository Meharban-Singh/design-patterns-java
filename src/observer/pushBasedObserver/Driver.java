package observer.pushBasedObserver;

/*
 * Observer Pull Based model
 * =========================
 *
 * Observers observe changes in some file and, when something changes, they update themselves.
 * Example: When the data source changes in an excel cell, some other cell which references that cell in a formula updates
 * itself.
 *
 * In push base model, the subject pushed the data to the observers. So observers do not need the references to the subjects.
 */
public class Driver {
    public static void main(String[] args) {
        DataSource data = new DataSource(100);

        Spreadsheet enrollment = new Spreadsheet("Enrollment");
        Chart grades = new Chart("Grades");

        // Add observers
        data.addObserver(enrollment);
        data.addObserver(grades);

        // update the data source should automatically update the observers.
        data.setValue(99);
    }
}
