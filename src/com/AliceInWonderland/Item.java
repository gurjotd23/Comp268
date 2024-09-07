package src.com.AliceInWonderland;
import java.util.ArrayList;

public class Item {
    public static Item Gem, Jar, Map, DrinkMeBottle, EatMeCake, Mushroom, GloveAndFan, GoldenKey;

    public String Name;
    public boolean Edible;
    public ArrayList<Character> CharactersWhoAccept;

    Item(String Name, ArrayList<Character> CharactersWhoAccept, boolean Edible) {
        this.Name = Name;
        this.CharactersWhoAccept = CharactersWhoAccept;
        this.Edible = Edible;
    }

    static void MakeItems() {
        Item.Gem = new Item("Gem", new ArrayList<Character>(), false);
        Item.Jar = new Item("Jar", new ArrayList<Character>(), false);
        Item.Map = new Item("Map", new ArrayList<Character>(), false);
        Item.GoldenKey = new Item("Key", new ArrayList<Character>(), false);
        Item.DrinkMeBottle = new Item("Bottle", new ArrayList<Character>(), true);
        Item.EatMeCake = new Item("Cake", new ArrayList<Character>(), true);
        Item.Mushroom = new Item("Mushroom", new ArrayList<Character>(), true);
        Item.GloveAndFan = new Item("Both", new ArrayList<Character>(), false);


        // characters who can accept an item
        Item.Gem.CharactersWhoAccept.add(Character.MarchHare);
        Item.GloveAndFan.CharactersWhoAccept.add(Character.Rabbit);
    }

    static void PlaceItemsInLocations() {
        Location.DeepWell.AddItem(Item.Jar);
        Location.DeepWell.AddItem(Item.Gem);
        Location.DeepWell.AddItem(Item.Map);

        Location.LongHall.AddItem(Item.GoldenKey);
        Location.LongHall.AddItem(Item.DrinkMeBottle);
        Location.LongHall.AddItem(Item.EatMeCake);


        Location.RabbitsHouse.AddItem(Item.Mushroom);

        
    }

    static void ConsumeItem(Item item) {
        if (!item.Edible) return;
        if (!Inventory.HasItem(item)) return;

        if (item.Name.compareToIgnoreCase(Item.DrinkMeBottle.Name) == 0) {
            System.out.println("You have drank from the bottle. And now you're becoming very short!");

            Wonderland.AliceSize = Size.Short;
            Control.DropItem(item.Name);

            if (Wonderland.CurrentLocation == Location.LongHall && !Location.Garden.Visited && !Location.Shores.Visited) Actions.DrinkInLongHall();
        } else if (item.Name.compareToIgnoreCase(Item.EatMeCake.Name) == 0) {
            System.out.println("You have eaten the cake. And now you're becoming very tall!");

            Wonderland.AliceSize = Size.Tall;
            Control.DropItem(item.Name);

            if (Wonderland.CurrentLocation == Location.LongHall && !Location.Garden.Visited && !Location.Shores.Visited) Actions.EatCakeInLongHall();
        } else if (item.Name.compareToIgnoreCase(Item.Mushroom.Name) == 0) {

            if (Wonderland.AliceSize == Size.Normal) Wonderland.AliceSize = Size.Short;
            else if (Wonderland.AliceSize == Size.Tall) Wonderland.AliceSize = Size.Short;
            else if (Wonderland.AliceSize == Size.Short) Wonderland.AliceSize = Size.Tall;

            if (Wonderland.AliceSize == Size.Short) {
                System.out.println("You have taken a bite. And now you're very short. I wonder what I'll become if I take another bite");
            }
            else if (Wonderland.AliceSize == Size.Short) {
                System.out.println("You have taken a bite. And now you're very tall.");
                System.out.println("I wonder what I'll become if I take another bite");
            }
        }
    }
}