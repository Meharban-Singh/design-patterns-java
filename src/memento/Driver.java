package memento;

/*
 * Memento Design patter
 * =======================
 *
 * A Class can have a lot of ClassStates, which are essentially just snapshots of the
 * Class. All such class states are associated to a History object, which now keeps track
 * of the lifetime of Class object changes and it can be used to revert back to any previous state.
 */
public class Driver {
    public static void main(String[] args) {
        Class editor = new Class();
        History editorHistory = new History();

        // Start with a value of "a", change to "b" and then to "c", while saving each state.
        editor.setContent("a");
        editorHistory.push(editor.saveState());

        editor.setContent("b");
        editorHistory.push(editor.saveState());

        editor.setContent("c");

        // Print the last state - prints "c"
        System.out.println(editor.getContent());

        // Undo 2 times
        editor.restoreState(editorHistory.pop());
        editor.restoreState(editorHistory.pop());

        System.out.println(editor.getContent()); // prints "a"
    }
}
