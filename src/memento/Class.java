package memento;

public class Class {
    private String content;

    // Getters and setters for getting content
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    /**
     * Creates a new state for the currect class.
     *
     * @return ClassState   The new ClassState object
     */
    public ClassState saveState() {
        return new ClassState(this.content);
    }

    /**
     * Restores the state of the current object to the state passed in the param
     *
     * @param state ClassState  The state to be restored to
     */
    public void restoreState(ClassState state) {
        this.content = state.getContent();
    }
}
