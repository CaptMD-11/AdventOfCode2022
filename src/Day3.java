import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {

    public int getPrioritySum() {
        try {
            File file = new File("Data/Day3.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            ArrayList<String> lettersForPriorities = new ArrayList<String>();

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();

                String firstSack = line.substring(0, line.length() / 2);
                String secondSack = line.substring(line.length() / 2);

                outerloop: for (int i = 0; i < firstSack.length(); i++) {
                    for (int j = 0; j < secondSack.length(); j++) {
                        if (firstSack.substring(i, i + 1).equals(secondSack.substring(j, j + 1))) {
                            lettersForPriorities.add(firstSack.substring(i, i + 1));
                            break outerloop;
                        }
                    }
                }
            }
            scanner.close();

            String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            int prioritiesSum = 0;

            for (int i = 0; i < lettersForPriorities.size(); i++) {
                if (lowerCaseLetters.indexOf(lettersForPriorities.get(i)) != -1)
                    prioritiesSum += (lowerCaseLetters.indexOf(lettersForPriorities.get(i)) + 1);
                else if (upperCaseLetters.indexOf(lettersForPriorities.get(i)) != -1)
                    prioritiesSum += (upperCaseLetters.indexOf(lettersForPriorities.get(i)) + 1 + 26);
            }

            return prioritiesSum;

        } catch (Exception e) {
            System.out.println(e);
        }

        return 0;

    }

    public int getGroupPrioritySum() {
        try {
            File file = new File("data/Day3.txt");
            Scanner scanner = new Scanner(file);
            String line = "";

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}