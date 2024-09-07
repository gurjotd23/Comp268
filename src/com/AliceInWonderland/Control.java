package src.com.AliceInWonderland;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

enum PossibleActions {
    AllowChangeOfLocation,
    CollectItem,
    GiveItem,
    Global,
    YesOrNo
}

public class Control {

    public static void GetUserInput(Location location, PossibleActions possibleActions) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        while (true) {
            System.out.println("Please enter a command or 'skip;':");
            text = sc.nextLine();

            if (text.equalsIgnoreCase("skip")) {

                if (possibleActions == PossibleActions.CollectItem || possibleActions == PossibleActions.GiveItem) {
                    if (possibleActions == PossibleActions.CollectItem && Wonderland.CurrentLocation.Items.size() > 0) {
                        Wonderland.CurrentLocation.Items.remove(0);
                    }
                    return;
                } else {
                    System.out.println("The 'skip' command is not valid for this action. Please enter a valid command.");
                    continue;
                }
            }

            if (!text.trim().isEmpty()) {
                break;
            }
        }


        // dropping an item
        String[] tokens = text.split(" ");
        if (tokens.length == 0) {
            System.out.println("Invalid command. Please try again.");
            return;
        }

        if (GlobalAction(tokens, location, possibleActions)) return;


        switch (possibleActions) {
            case YesOrNo:
                handleYesOrNo(tokens, location, possibleActions);
                break;

            case AllowChangeOfLocation:
                handleChangeLocation(tokens, location, possibleActions);
                break;

            case CollectItem:
                handleCollectItem(tokens, location);
                break;

            case GiveItem:
                handleGiveItem(tokens, location);

            default:
                System.out.println("Invalid action type.");
                break;
        }
    }

    private static void handleYesOrNo(String[] tokens, Location location, PossibleActions possibleActions) {
        if (tokens.length == 0 || (!tokens[0].equalsIgnoreCase("yes") && !tokens[0].equalsIgnoreCase("no"))) {
            System.out.println("\tAnswer with a 'yes' or 'no'");
            GetUserInput(location, possibleActions);
            return;
        }

        if (tokens[0].equalsIgnoreCase("yes")) Wonderland.YesOrNo = YesOrNo.Yes;
        else Wonderland.YesOrNo = YesOrNo.No;
    }

    private static void handleChangeLocation(String [] tokens, Location location, PossibleActions possibleActions) {
        if (tokens.length < 2 || !tokens[0].equalsIgnoreCase("go")) {
            System.out.println("You need to choose a place to go, e.g 'go north'.");
            GetUserInput(location, possibleActions);
            return;
        }

        try {
            CardinalPoint p = location.TextToCardinalPoint(tokens[1]);
            Location newLocation = location.Exits.get(p);

            if (newLocation != null) {
                GoToLocation(newLocation);
            } else {
                System.out.println("There is no path that way.");
                GetUserInput(location, possibleActions);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid direction, use compass directions like 'go north'.");
            GetUserInput(location, possibleActions);
        }
    }

    private static void handleCollectItem(String [] tokens, Location location) {
        if (tokens.length < 2 || !tokens[0].equalsIgnoreCase("collect")) {
            System.out.println("\tTo collect an item, type 'collect <item name>'.");
            GetUserInput(location, PossibleActions.CollectItem);
            return;
        }

        String itemName = tokens[1];
        CollectItem(itemName);
    }

    private static void handleGiveItem(String[] tokens, Location location) {
        if (tokens.length < 2 || !tokens[0].equalsIgnoreCase("give")) {
            System.out.println("\tTo give an item, type 'give <item name>'.");
            GetUserInput(location, PossibleActions.GiveItem);
            return;
        }

        String itemName = tokens[1];
        for (Item i : Inventory.MyInventory()) {
            if (i.Name.equalsIgnoreCase(itemName)) {
                if (GiveItem(i)) {
                    System.out.println("Item accepted.");
                } else {
                    System.out.println("Item not accepted.");
                }
                break;
            }
        }
    }

    public static boolean GlobalAction(String[] tokens, Location location, PossibleActions possibleActions) {

        if (tokens[0].equalsIgnoreCase("drop")) {

            if (tokens.length == 1) {
                System.out.println("\tTo drop an item, type 'drop' + the name of the item e.g. 'drop gem'");
            } else if (Inventory.Count() == 0) {
                System.out.println("\tYou do not have any item");
            } else {
                for (Item i : Inventory.MyInventory()) {
                    if (i.Name.equalsIgnoreCase(tokens[1])) {
                        DropItem(i.Name);
                        GetUserInput(location, possibleActions);
                        return true;
                    }
                }
                System.out.println("\tYou do not have a " + tokens[1]);
                ShowCollectedItems();
            }

            GetUserInput(location, possibleActions);
            return true;

        } else if (tokens[0].equalsIgnoreCase("map") ||
                (tokens.length == 2 && tokens[0].equalsIgnoreCase("show") && tokens[1].equalsIgnoreCase("map"))) {
            DisplayMap();
            GetUserInput(location, possibleActions);
            return true;

        } else if (tokens[0].equalsIgnoreCase("instructions")) {
            PostInstructionsMessage();
            GetUserInput(location, possibleActions);
            return true;

        } else if (tokens[0].equalsIgnoreCase("inventory") || tokens[0].equalsIgnoreCase("i")) {
            ShowCollectedItems();
            GetUserInput(location, possibleActions);
            return true;

        } else if (tokens[0].equalsIgnoreCase("consume") || tokens[0].equalsIgnoreCase("eat")
                || tokens[0].equalsIgnoreCase("drink")) {

            if (tokens.length == 1) {
                System.out.println("\tTo consume an item in your inventory you can type 'eat cake', 'drink bottle', 'eat mushroom' or 'consume mushroom'");
            } else if (Inventory.Count() == 0) {
                System.out.println("\tYou do not have any item. To consume an item, you have to collect it first.");
            } else {


                for (Item i : Inventory.MyInventory()) {
                    if (i.Name.equalsIgnoreCase(tokens[1])) {
                        if (!i.Edible) {
                            System.out.println("\t" + i.Name + " is not edible");
                            GetUserInput(location, possibleActions);
                        } else {
                            Item.ConsumeItem(i);
                        }
                        return true;
                    }
                }

                System.out.println("\tYou do not have a " + tokens[1]);
                ShowCollectedItems();
            }

            GetUserInput(location, possibleActions);
            return true;
        }

        return false;
    }

    public static void ShowCollectibleItems(Location location, int index, String Text) {

    }

    public static void PostWelcomeMessage() {
        Control.PrintDelayedTexts(Wonderland.IntroductionTexts);
    }

    public static void PostInstructionsMessage() {
        Control.PrintDelayedTexts(Wonderland.InstructionsTexts);
    }

    public static void DisplayMap() {

        boolean HasMap = false;
        for (Item i : Inventory.MyInventory()) {
            if (i.Name.compareToIgnoreCase("map") == 0) HasMap = true;
        }

        if (!HasMap && Wonderland.CurrentLocation != Location.DeepWell) {
            System.out.println("\tDamn it! I forgot to collect the map.");
            return;
        } else if (!HasMap && Wonderland.CurrentLocation == Location.DeepWell) {
            System.out.println("\tWhere's my map! I thought I had carried one! Too bad!.");
            return;
        }
        System.out.println("\nMap\n");
        System.out.println("\tCurrent location: " + Wonderland.CurrentLocation.Name);
        System.out.println("\tCurrent cardinal location: " + Wonderland.CurrentLocation.CardinalLocation);

        if (Wonderland.CurrentLocation.Exits.size() != 0) {
            System.out.println("\n\tExits:");
            for (Map.Entry<CardinalPoint, Location> Exit : Wonderland.CurrentLocation.Exits.entrySet()) {
                CardinalPoint direction = Exit.getKey();
                Location location = Exit.getValue();
                System.out.println("\t\t" + location.Name + ": " + direction);
            }
        } else {
            System.out.println("\n\tThere are no exits from this location.");
        }
    }

    public static boolean GiveItem(Item item) {
        if (Inventory.HasItem(item)) {
            DropItem(item.Name);

            if (Wonderland.CurrentLocation == Location.RabbitsHouse && Wonderland.GamePlot == Plot.Rabbit && item == Item.GloveAndFan) {
                Wonderland.PaidTheRabbit = true;
            } else if (Wonderland.CurrentLocation == Location.MarchHaresHouse && item == Item.Gem) {
                Wonderland.PaidTheMarchHare = true;
            } else if (Wonderland.CurrentLocation == Location.Shores && Wonderland.GamePlot == Plot.Rabbit) {
                Wonderland.PaidPrizeForTheRace = true;
            }
            return true;
        }
        return false;
    }


    public static void CollectItem(String name) {

        Item itemToCollect = null;
        for (Item item : Wonderland.CurrentLocation.Items) {
            if (item.Name.equalsIgnoreCase(name)) {
                itemToCollect = item;
                break;
            }
        }

        if (itemToCollect == null) {
            System.out.println("\tThe item '" + name + "' is not available at this location.");
            GetUserInput(Wonderland.CurrentLocation, PossibleActions.Global);
            return;
        }

        if (Inventory.AddItem(itemToCollect)) {
            System.out.println("\t" + itemToCollect.Name + " collected.");
            Wonderland.CurrentLocation.Items.remove(itemToCollect);

            if (itemToCollect.Edible) {
                GetUserInput(Wonderland.CurrentLocation, PossibleActions.Global);
            }
        } else {
            System.out.println("\tCould not collect item. You do not have space for more items. Consider dropping one or two.");
            GetUserInput(Wonderland.CurrentLocation, PossibleActions.CollectItem);
            return;
        }

        if (Inventory.Count() == 2) {
            System.out.println("\tYou have 2 items in your pocket. Space for only one more! if you wish, you can drop an item.");
        } else if (Inventory.Count() == 3) {
            System.out.println("\tYou have 3 items. You do not have space for it anymore.");
        }
    }

    public static void DropItem(String name) {
        int index = 0;
        for (Item i : Inventory.MyInventory()) {
            if (i.Name.equalsIgnoreCase(name)) {


                if (Wonderland.CurrentLocation == Location.SafeRoom) {
                    if (Location.SafeRoom.Items.size() == 1) Location.SafeRoom.Items.remove(0);
                    Location.SafeRoom.Items.add(i);
                    Inventory.DropItem(index);
                    System.out.println("\t" + i.Name + " left in the Safe Room");
                } else {
                    Inventory.DropItem(index);
                    System.out.println("\t" + i.Name + " dropped");
                }
                return;
            }
            index++;
        }

    }

    public static void ShowCollectedItems() {
        if (Inventory.Count() == 0) System.out.println("\n\tYou have 0 collected items");
        else {
            System.out.println("\n\tCollected items:");
            for (Item i : Inventory.MyInventory()) {
                System.out.println("\t\t" + i.Name);
            }
        }
    }

    public static void GoToLocation(Location location) throws NullPointerException {
        try {
            switch (location.id) {
                case 1:
                    Wonderland.CurrentLocation = Location.LongHall;
                    Actions.LongHall();
                    break;
                case 2:
                    Wonderland.CurrentLocation = Location.Garden;
                    Actions.Garden();
                    break;
                case 3:
                    Actions.Courtroom();
                    Wonderland.CurrentLocation = Location.Courtroom;
                    break;
                case 4:
                    Wonderland.CurrentLocation = Location.MarchHaresHouse;
                    Actions.MarchHaresHouse();
                    break;
                case 5:
                    Wonderland.CurrentLocation = Location.DuchessHouse;
                    Actions.DuchessHouse();
                    break;
                case 6:
                    Wonderland.CurrentLocation = Location.CroquetPlayground;
                    Actions.CroquetPlayground();
                    break;
                case 7:
                    Wonderland.CurrentLocation = Location.RabbitsHouse;
                    Actions.RabbitsHouse();
                    break;
                case 8:
                    Wonderland.CurrentLocation = Location.Shores;
                    Actions.Shores();
                    break;
                case 9:
                    Wonderland.CurrentLocation = Location.SafeRoom;
                    Actions.SafeRoom();
                    break;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void PrintDelayedTexts(ArrayList<String> Texts) {
        Scanner sc = new Scanner(System.in);

        for (String Text : Texts) {
            System.out.println(Text);
            String UserInput = sc.nextLine();

            if (UserInput.equalsIgnoreCase("skip") || UserInput.equalsIgnoreCase("s")) return;

        }
    }

}