package builder;

import java.util.ArrayList;
public class Calendar {
    private ArrayList<CalendarEvent> events = new ArrayList<>();

    /**
     * Inits a new Calendar
     */
    public Calendar(){
    }

    /**
     * Adds a new event in the calendar
     * @param event
     */
    public void addEvent(CalendarEvent event){
        events.add(event);
    }

    /**
     * Returns the current event
     *
     * @return CalendarEvent
     */
    public CalendarEvent getCurrentEvent(){
        return events.get(events.size()-1);
    }

    /**
     * Get a list of all event in the calendar\
     *
     * @return ArrayList<CalendarEvent>
     */
    public ArrayList<CalendarEvent> getEvents(){
        return events;
    }

    /**
     * Returns string representation of the Calendar object
     *
     * @return
     */
    public String toString(){
        return ""+events;
    }
}
