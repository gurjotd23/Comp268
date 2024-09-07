package src.com.AliceInWonderland;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

enum CardinalPoint {
    North, Northeast, East, Southeast, South, Southwest, West, Northwest, Central
}

public class Location {
    public CardinalPoint CardinalLocation;
    public String Name;
    public int id;
    public ArrayList<String> Texts;
    public ArrayList<Item> Items;
    public boolean Visited = false;

    public static Location DeepWell, LongHall, Garden, Courtroom, MarchHaresHouse, DuchessHouse,
            CroquetPlayground, RabbitsHouse, Shores, SafeRoom;

    public HashMap<CardinalPoint, Location> Entries;
    public HashMap<CardinalPoint, Location> Exits;

    public Location(String FileUrl, int id) {
        this.id = id;

        this.Texts = new ArrayList<String>();
        this.Items = new ArrayList<Item>();
        this.Entries = new HashMap<CardinalPoint, Location>();
        this.Exits = new HashMap<CardinalPoint, Location>();

        try {
            this.GetFileData(FileUrl);
        } catch (IOException e) {
            System.out.println("Location file missing or contains invalid data. " + FileUrl);
            e.printStackTrace();
        }
    }

    void AddItem(Item item) {
        this.Items.add(item);
    }

    void RemoveItem(Item item) {
        int index = 0;
        for (Item i: this.Items) {
            if (i.Name.compareToIgnoreCase(item.Name) == 0) {
                this.Items.remove(index);
                return;
            }
            index++;
        }
    }

    static void ConstructLocations() {

        Location.DeepWell = new Location("Locations/DeepWell.txt", 0);
        Location.LongHall = new Location("Locations/LongHall.txt", 1);
        Location.Garden = new Location("Locations/Garden.txt", 2);
        Location.Courtroom = new Location("Locations/Courtroom.txt", 3);
        Location.MarchHaresHouse = new Location("Locations/MarchHaresHouse.txt", 4);
        Location.DuchessHouse = new Location("Locations/DuchessHouse.txt", 5);
        Location.CroquetPlayground = new Location("Locations/CroquetPlayground.txt", 6);
        Location.RabbitsHouse = new Location("Locations/RabbitsHouse.txt", 7);
        Location.Shores = new Location("Locations/Shores.txt", 8);
        Location.SafeRoom = new Location("Locations/SafeRoom.txt", 9);


        // Entries and Exits
        Location.DeepWell.Exits.put(CardinalPoint.North, Location.LongHall);

        Location.LongHall.Entries.put(CardinalPoint.South, Location.SafeRoom);


        Location.Garden.Entries.put(CardinalPoint.West, Location.LongHall);
        Location.Garden.Entries.put(CardinalPoint.South, Location.Courtroom);
        Location.Garden.Exits.put(CardinalPoint.Southwest, Location.SafeRoom);

        Location.Courtroom.Entries.put(CardinalPoint.West, Location.SafeRoom);
        Location.Courtroom.Exits.put(CardinalPoint.North, Location.Garden);

        Location.MarchHaresHouse.Entries.put(CardinalPoint.West, Location.DuchessHouse);
        Location.MarchHaresHouse.Exits.put(CardinalPoint.Northwest, Location.SafeRoom);

        Location.DuchessHouse.Entries.put(CardinalPoint.North, Location.SafeRoom);
        Location.DuchessHouse.Exits.put(CardinalPoint.East, Location.MarchHaresHouse);
        Location.DuchessHouse.Exits.put(CardinalPoint.West, Location.CroquetPlayground);

        Location.CroquetPlayground.Entries.put(CardinalPoint.East, Location.DuchessHouse);
        Location.CroquetPlayground.Exits.put(CardinalPoint.Northeast, Location.SafeRoom);

        Location.RabbitsHouse.Entries.put(CardinalPoint.North, Location.Shores);
        Location.RabbitsHouse.Exits.put(CardinalPoint.East, Location.SafeRoom);

        Location.Shores.Entries.put(CardinalPoint.East, Location.LongHall);
        Location.Shores.Exits.put(CardinalPoint.South, Location.RabbitsHouse);

        Location.SafeRoom.Exits.put(CardinalPoint.North, Location.LongHall);
        Location.SafeRoom.Exits.put(CardinalPoint.South, Location.DuchessHouse);
        Location.SafeRoom.Exits.put(CardinalPoint.East, Location.Courtroom);
    }


    public static CardinalPoint TextToCardinalPoint(String cardinalPoint) {

        switch (cardinalPoint.toLowerCase()) {
            case "north":
            case "n":
                return CardinalPoint.North;
            case "northeast":
            case "ne":
                return CardinalPoint.Northeast;
            case "east":
            case "e":
                return CardinalPoint.East;
            case "southeast":
            case "se":
                return CardinalPoint.Southeast;
            case "south":
            case "s":
                return CardinalPoint.South;
            case "southwest":
            case "sw":
                return CardinalPoint.Southwest;
            case "west":
            case "w":
                return CardinalPoint.West;
            case "northwest":
            case "nw":
                return CardinalPoint.Northwest;
            case "central":
            case "c":
                return CardinalPoint.Central;
        }

        throw new IllegalArgumentException();
    }

    private void GetFileData(String FileUrl) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FileUrl))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Name:")) {
                    this.Name = line.substring(5).trim();
                }

                else if (line.startsWith("CardinalLocation:")) {
                    String cardinal = line.substring(17).trim();
                    this.CardinalLocation = TextToCardinalPoint(cardinal);
                }

                else if (line.startsWith("Text:")) {
                    String text = line.substring(5).trim();
                    text = processSpecialCharacters(text);
                    this.Texts.add(text);
                }

                else if (!line.trim().isEmpty()) {
                    if (!this.Texts.isEmpty()) {
                        int lastIndex = this.Texts.size() - 1;
                        String updatedText = this.Texts.get(lastIndex) + " " + processSpecialCharacters(line.trim());
                        this.Texts.set(lastIndex, updatedText);
                    }
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading location file: " + FileUrl, e);
        }
    }

    private String processSpecialCharacters(String text) {
        text = text.replace("\\t", "\t");  // Replace \t with actual tab character
        text = text.replace("\\n", "\n");  // Replace \n with actual newline character
        return text;
    }

    public static void main(String[] args) {
        
    }
}
