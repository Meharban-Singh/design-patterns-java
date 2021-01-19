package composite;

public class File implements Component {
    private String name;
    private String extension;

    /**
     * Creates a new File with a name and an extension
     *
     * @param name
     * @param extension
     */
    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    /**
     * Deletes the file
     */
    public void delete() {
        System.out.println("File " + this.name + "." + this.extension + " deleted");
    }
}
