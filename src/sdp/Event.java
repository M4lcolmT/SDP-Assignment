package sdp;


public class Event {

    public Event(String eventName, String eventLocation, String eventDateTime) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDateTime = eventDateTime;
    }
    
    Event(String data){
        String[] dataArrays = data.split(",");
        eventName = dataArrays[0];
        eventLocation = dataArrays[1];
        eventDateTime = dataArrays[2];
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
    
private String eventName;
private String eventLocation;
private String eventDateTime;

}
