package composite;

/*
 * Composite Design patter
 * =======================
 *
 * A folder can have files and folders. Create an interface to represent both of them and
 * add a HAS-A relationship from Folder to list of components.
 *
 * This is sort of similar to decorator, but the HAS-A relationship is one to many instead
 * of one to one.
 */
public class Driver {
    public static void main(String[] args) {
        // Create some images (Files)
        File img1 = new File("Img1", "jpg");
        File img2 = new File("Img2", "png");
        File img3 = new File("Img3", "svg");
        File img4 = new File("Img4", "jpg");

        // Create a folder to store images.
        Folder images = new Folder("Images");
        images.add(img1);
        images.add(img2);
        images.add(img3);
        images.add(img4);

        // Delete a folder
        images.delete();

        // Delete a file
        img4.delete();
    }
}
