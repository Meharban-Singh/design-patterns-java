package builder;

public class CalendarEvent {
    private String dateOf, name, location, startTime, endTime;

    /**
     * Inits a CalendarEvent object
     */
    public CalendarEvent(){
    }

    /**
     * Inits a CalendarEvent object
     *
     * @param name
     */
    public CalendarEvent(String name){
        this.name = name;
    }

    /**
     * Sets name of the current event
     *
     * @param n
     */
    public void setName(String n){
        name = n;
    }

    /**
     * Sets date of the event
     *
     * @param d
     */
    public void setDateOf(String d){
        dateOf = d;
    }

    /**
     * Sets location of the event
     *
     * @param locn
     */
    public void setLocation(String locn){
        location = locn;
    }

    /**
     * Sets the start time of the event
     *
     * @param st
     */
    public void setStartTime(String st){
        startTime = st;
    }

    /**
     * Sets the end time of the event
     *
     * @param et
     */
    public void setEndTime(String et){
        endTime = et;
    }

    /**
     * Returns String representation of the object
     *
     * @return
     */
    public String toString(){
        return name +" on "+dateOf+" at "+location
                +" beginning at "+startTime
                +" ending at "+endTime;
    }
}
