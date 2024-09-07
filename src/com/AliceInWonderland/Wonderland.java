package src.com.AliceInWonderland;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Plot is influenced by who is met first between the Gardeners and the Rabbit, determining who will help you
enum Plot {
    Duchess, Rabbit
}

enum Size {
    Short,
    Tall,
    Normal
}

enum YesOrNo {
    Yes, No
}

public class Wonderland {

    public static Plot GamePlot;
    public static boolean CriedAtLongHall = false;
    public  static boolean ConsumptionAtLongHall = false;

    public static boolean PaidTheRabbit = false;
    public static boolean PaidTheMarchHare = false;
    public static boolean PaidPrizeForTheRace = false;
    public static YesOrNo YesOrNo;

    public static boolean TimeIsTakenBack = false;
    public static Size AliceSize = Size.Normal;

    public static ArrayList<String>IntroductionTexts = new ArrayList<String>();
    public static ArrayList<String>InstructionsTexts = new ArrayList<String>();

    public static Location CurrentLocation;


    public static void main(String[] args) {
        Wonderland GameSession = new Wonderland();
    }

    Wonderland() {
        Item.MakeItems();
        Location.ConstructLocations();
        Item.PlaceItemsInLocations();

        CurrentLocation = Location.DeepWell;

        ReadMetaTexts();

        Control.PostWelcomeMessage();
        Control.PostInstructionsMessage();

        Actions.DeepWell();
    }



    static void GameOver(String EndingMessage) {
        System.out.println("\nGAME OVER:" + EndingMessage);
        System.exit(0);
    }

    void ReadMetaTexts() {
        Map<String, ArrayList<String>> textsMap = new HashMap<>();
        textsMap.put("Introduction", new ArrayList<>());
        textsMap.put("Instructions", new ArrayList<>());

        try (BufferedReader br = new BufferedReader(new FileReader("Texts.txt"))) {
            StringBuilder currentText = new StringBuilder();
            String line;
            String currentCategory = null;

            while ((line = br.readLine()) != null) {
                line = line.replace("\\t", "\t").replace("\\n", "\n").trim();
                if (line.endsWith(":")) {
                    if (currentCategory != null) {
                        textsMap.get(currentCategory).add(currentText.toString());
                    }
                    currentCategory = line.substring(0, line.length() - 1);
                    if (!textsMap.containsKey(currentCategory)) {
                        textsMap.put(currentCategory, new ArrayList<>());
                    }
                    currentText = new StringBuilder();
                } else if (currentCategory != null) {
                    if (line.isEmpty() && currentText.length() > 0) {
                        textsMap.get(currentCategory).add(currentText.toString());
                        currentText = new StringBuilder();
                    } else {
                        currentText.append(line).append("\n");
                    }
                }
            }

            if (currentCategory != null) {
                textsMap.get(currentCategory).add(currentText.toString());
            }
    } catch (IOException e) {
        e.printStackTrace();
    }

    Wonderland.IntroductionTexts = textsMap.get("Introduction");
    Wonderland.InstructionsTexts = textsMap.get("Instructions");
    }
}