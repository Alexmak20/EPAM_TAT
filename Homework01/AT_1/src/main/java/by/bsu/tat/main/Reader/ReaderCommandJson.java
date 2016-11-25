package by.bsu.tat.main.Reader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class reader command from json file.
 * @author Alexey Makovski.
 */
public class ReaderCommandJson extends ReaderCommand {
    private File file;

    public ReaderCommandJson(File file) {
        this.file = file;
    }

    /**
     * Method reader command from json file.
     * @return list commands
     * @throws IOException
     */
    @Override
    public ArrayList<String> readCommands() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        JsonParser json = new JsonParser();
        JsonElement jsonElement = json.parse(new JsonReader(new FileReader(file)));
        JsonArray jsonList = jsonElement.getAsJsonObject().get("commands").getAsJsonArray();
        for (int i = 0; i < jsonList.size(); i++) {
            list.add(jsonList.get(i).getAsString());
        }
        return list;
    }
}
