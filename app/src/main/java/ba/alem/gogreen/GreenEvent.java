package ba.alem.gogreen;

public class GreenEvent extends com.skyhope.eventcalenderlibrary.model.Event {

    private String description;
    private String url;
    private String date;

    public GreenEvent(long time, String eventText) {
        super(time, eventText);
    }

    public GreenEvent(long time, String eventText, int eventColor) {
        super(time, eventText, eventColor);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
