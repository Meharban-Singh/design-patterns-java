package iterator;

import java.util.Iterator;


/*
 * Iterator Design Pattern
 * ==========================
 *
 * Used for looping through an internal list of items without needing the internal private list.
 * Make your class use foreach if it implements java.util.Iterable
 */

public class Driver {
    public static void main(String[] args) {
        WhatsApp app = new WhatsApp();
        app.addMessage("hi");
        app.addMessage("yo");

        // Able to iterate over the entire contents of the object without accesing its fields.
        Iterator<String> iter = app.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Also enables this
        for(String e: app){
            System.out.println(e);
        }
    }
}
