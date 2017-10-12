package events;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.Map;

/**
 * Created by nander on 12-10-17.
 */

public class LocationEvent implements Event {
    private double x;
    private double y;
    private final String type = "location";

    public LocationEvent(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x + ":" + y;
    }
}
