package observer.pullBasedObserver;

/*
 * Observer Pull Based model
 * =========================
 *
 * Observers observe changes in some file and, when something changes, they update themselves.
 * Example: When the data source changes in an excel cell, some other cell which references that cell in a formula updates
 * itself.
 *
 * In pull base model, the observers are pull the changes from the subject when needed. So each observer has the reference to
 * the Subject.
 *
 */
public class Driver {
    public static void main(String[] args) {
        DataSource data = new DataSource(100);

        Spreadsheet enrollment = new Spreadsheet("Enrollment", data);
        Chart grades = new Chart("Grades", data);

        // Add observers
        data.addObserver(enrollment);
        data.addObserver(grades);

        // update the data source should automatically update the observers.
        data.setValue(99);
    }
}
