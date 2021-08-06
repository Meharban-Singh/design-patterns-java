package memento;

import java.util.Stack;

/*
 * This class represents the state of the Class Objects.
 * It keeps a stack of states and can be used to undo to the last state.
 */
public class History {
    private Stack<ClassState> states = new Stack<>();

    /**
     * Adds a new state of the Class to the history of states
     *
     * @param state ClassState  The new state of the class.
     */
    public void push(ClassState state) {
        this.states.push(state);
    }

    /**
     * Returns and removes the last saved state
     *
     * @return ClassState
     */
    public ClassState pop() {
        return this.states.pop();
    }
}
