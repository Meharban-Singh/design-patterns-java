package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class WhatsApp implements Iterable<String>{
    private List<String> messages;

    /**
     * Iterator for WhatsApp messages
     */
    private class WhatsAppIterator implements Iterator<String> {
        public int index;

        /**
         * Returns true if there are more elements to loop through with the iterator
         *
         * @return boolean
         */
        public boolean hasNext() {
            return this.index < WhatsApp.this.messages.size();
        }

        /**
         * Returns the next element in the iterator
         *
         * @return String
         * @throws NoSuchElementException
         */
        public String next() throws NoSuchElementException {
            if(index >= WhatsApp.this.messages.size()) throw new NoSuchElementException();
            return WhatsApp.this.messages.get(index++);
        }
    }

    /**
     * Inits a new WhatsApp instance
     */
    public WhatsApp() {
        this.messages = new ArrayList<>();
    }

    /**
     * Adds message to WhatsApp Instance
     *
     * @param message String
     */
    public void addMessage(String message) {
        this.messages.add(message);
    }

    /**
     * Returns a new iterator associated with this object
     *
     * @return Iterator<String>
     */
    public Iterator<String> iterator() {
        return new WhatsAppIterator();
    }
}
