import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Character {
    public String Name;
    public Location location;
    public boolean TakesItem;
    public ArrayList<String> Dialouge;

    public static Character Mouse, WhiteRabbit, Catterpillar, Duchess, Queen, King,
            MarchHare, MadHatter;

    Character(String Name, Location location, boolean TakesItem, String FileName) {
        this.Name = Name;
        this.location = location;
        this.TakesItem = TakesItem;

        try {
            this.GetDialouge(FileName);
        } catch (IOException e) {
            System.out.println("Location file missing or contains invalid data. " + FileName);
            e.printStackTrace();
        }
    }

    private void GetDialouge(String FileName) throws IOException {
        StringBuilder FileContents = new StringBuilder();

        try {
            FileReader fr = new FileReader(FileName);
            int i;
            while ((i = fr.read()) != -1) {
                FileContents.append((char) i);
            }
            fr.close();
        } catch (IOException e) {
            throw e;
        }

        JSONObject LocObj = new JSONObject(FileContents.toString());

        this.Name = LocObj.getString("Name");

        JSONArray textsArray = LocObj.getJSONArray("Texts");

        for (int j = 0; j < textsArray.length(); j++) {
            this.Dialouge.add(textsArray.getString(j));
        }
    }
}