package builder;

public class CalendarBuilder {
    private Calendar content = new Calendar();

    /**
     * Adds event to the Calendar
     *
     * @param name
     * @return
     */
    public CalendarBuilder addEvent(String name) {
        content.addEvent(new CalendarEvent());
        getCurrentEvent().setName(name);
        return this;
    }

    /**
     * Returns the current event
     *
     * @return
     */
    public CalendarEvent getCurrentEvent(){
        return content.getEvents().get(content.getEvents().size()-1);
    }

    public CalendarBuilder on(String dateOf){
        getCurrentEvent().setDateOf(dateOf);
        return this;
    }

    public CalendarBuilder at(String locn){
        getCurrentEvent().setLocation(locn);
        return this;
    }

    public CalendarBuilder startingAt(String st){
        getCurrentEvent().setStartTime(st);
        return this;
    }

    public CalendarBuilder endingAt(String et){
        getCurrentEvent().setEndTime(et);
        return this;
    }

    public String toString(){
        return ""+content;
    }

    public Calendar getContents(){
        return content;
    }
}
