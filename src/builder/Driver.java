package builder;

/*
 * Builder Design patter
 * =======================
 *
 * Helps create a new object of some class without creating a billion constructors
 */

public class Driver {
    public static void main(String[] args) {
        CalendarBuilder cb = new CalendarBuilder();

        // BEAUTY of the Builder pattern
        cb.addEvent("Review Builder")
                .on("March 30")
                .at("zoom/nexus")
                .startingAt("11:30")
                .endingAt("12:45");
        cb.addEvent("Review CoR")
                .on("April 1")
                .at("zoom/nexus")
                .startingAt("11:30")
                .endingAt("12:45");

        System.out.println("Calendar: "+cb.getContents());
    }
}
