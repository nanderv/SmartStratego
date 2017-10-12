package events;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by nander on 12-10-17.
 */

public interface EventFactory {
    public static Event getEvent(String s){
        JsonParser parser = new JsonParser();
        String type = parser.parse(s).getAsJsonObject().get("type").getAsString();
        Gson gson = new Gson();

        switch(type){
            case "location": return gson.fromJson(s, LocationEvent.class);
            case "alt_location": return gson.fromJson(s, LocationEvent.class);

            default: return null;
        }
    }
    public static String toJson(Event e){
        Gson gson = new Gson();
        return gson.toJson(e);
    }
}
