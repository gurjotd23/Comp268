import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageTest {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            File file = new File("testdata.txt");

            input = new Scanner(file);

            String name = input.nextLine();

            List<Integer> scores = new ArrayList<Integer>();
            
            while (input.hasNextLine()) {
                scores.add(input.nextInt());
            }

            input.close();

            int sum = 0;
            for (int num : scores) {
                sum = sum + num;
            }

            double average = (double)sum/scores.size();

            System.out.println(name + "has an average test score of " + average);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}