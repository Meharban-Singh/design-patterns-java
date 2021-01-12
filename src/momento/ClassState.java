package momento;

/**
 *  This class represents any ONE of the states of Class.java.
 *  We restrict changing add the private fields once they are initialized.
 */

public class ClassState {
    // We declare this field as final since this field can never change once its set.
    private final String content;

    public ClassState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
