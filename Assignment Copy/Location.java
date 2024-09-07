import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.*;

enum CardinalPoint {
    North, South, East, West, Northeast, Northwest, Southeast, Southwest, Central
}

public class Location {
    public CardinalPoint CardinalLocation;
    public String Name;
    public int ID;
    public ArrayList<String> Texts;
    public ArrayList<Item> Items;
    public boolean Visited = false;

    public static Location GreatHallway, SafeRoom, Garden, SeaShore, RabbitsHouse, BlackForest,
            DuchessHouse, CroquetGrounds, MarchHaresTea;

    public HashMap<CardinalPoint, Location> Entries;
    public HashMap<CardinalPoint, Location> Exits;

    public Location(String FileName, int ID) {
        this.ID = ID;
        this.Texts = new ArrayList<String>();
        this.Items = new ArrayList<Item>();
        this.Entries = new HashMap<CardinalPoint, Location>();    
        this.Exits = new HashMap<CardinalPoint, Location>();

        try {
            this.GetFileData(FileName);
        } catch (IOException e) {
            System.out.println("Location file missing or contains invalid data." + FileName);
            e.printStackTrace();
        }
    }

    public void addItem(Item item) {
        this.Items.add(item);
    }

    public static CardinalPoint TexttoCardinalPoint(String cardinalPoint) {

        switch (cardinalPoint.toLowerCase()) {
            case "north":
            case "n":
                return CardinalPoint.North;
            case "northeast":
            case "ne":
                return CardinalPoint.Northeast;
            case "northwest":
            case "nw":
                return CardinalPoint.Northwest;
            case "south":
            case "s":
                return CardinalPoint.South;
            case "southwest":
            case "sw":
                return CardinalPoint.Southwest;
            case "southeast":
            case "se":
                return CardinalPoint.Southeast;
            case "east":
            case "e":
                return CardinalPoint.East;
            case "west":
            case "w":
                return CardinalPoint.West;
            case "central":
            case "c":
                return CardinalPoint.Central;
        }

        throw new IllegalArgumentException();
    }

    private void GetFileData(String FileName) throws IOException {
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
        this.CardinalLocation = TexttoCardinalPoint(LocObj.getString("CardinalLocation"));

        JSONArray textsArray = LocObj.getJSONArray("Texts");

        for (int j = 0; j < textsArray.length(); j++) {
            this.Texts.add(textsArray.getString(j));
        }
    }
}
