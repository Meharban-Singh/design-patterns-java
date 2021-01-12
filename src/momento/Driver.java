package momento;

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
