package composite;

import java.util.ArrayList;
import java.util.List;

/*
 * A folder can be a file and a folder - so it has a list of components.
 */
public class Folder implements Component {
    private String name;
    private List<Component> contents;

    /**
     * Creates a new Folder object with name
     *
     * @param name
     */
    public Folder(String name) {
        this.contents = new ArrayList<>();
        this.name = name;
    }

    /**
     * Deletes all contents of the folder
     */
    public void delete() {
        // Delete files
        for(Component cmp: contents) {
            cmp.delete();
        }

        // Delete folder
        System.out.println("Folder " + this.name + " deleted!");
    }

    /**
     * Adds a component cmp to the folder
     *
     * @param cmp
     */
    public void add(Component cmp) {
        this.contents.add(cmp);
    }
}
