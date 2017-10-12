import events.Event;
import events.EventFactory;
import events.LocationEvent;

/**
 * Created by nander on 12-10-17.
 */
public class main {
    public static void main(String[] args) {
        Event e = EventFactory.getEvent( "{'type':'alt_location','x' : 9, 'y':12}");
        System.out.println(e);
        System.out.println(EventFactory.toJson(e));
        Event k = new LocationEvent(1,2);
        System.out.println(EventFactory.toJson(k));

    }

}
