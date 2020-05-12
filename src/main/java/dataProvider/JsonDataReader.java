package dataProvider;

/*import gherkin.deps.com.google.gson.Gson;
import managers.FileReaderManager;
import testDataTypes.Event;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;*/

public class JsonDataReader {

/*    private final String eventFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Event.json";
    private List<Event> eventList;

    public JsonDataReader() {
        eventList = getEventData();
    }

    private List<Event> getEventData() {
        Gson gson = new Gson();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(eventFilePath));
            Event[] events = gson.fromJson(bufferedReader, Event[].class);
            return Arrays.asList(events);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path: " + eventFilePath);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ignore) {
            }
        }
    }

    public final Event getEventByName(final String eventNameParameter) {
        return eventList.stream().filter(x -> x.eventName.equalsIgnoreCase(eventNameParameter)).findAny().get();
    }*/
}
