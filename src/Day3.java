import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {

    // PART I METHOD
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

    // PART II METHOD
    public int getGroupPrioritySum() {
        try {
            File file = new File("data/Day3.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            ArrayList<String> fileToList = new ArrayList<String>();

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                fileToList.add(line);
            }
            scanner.close();

            int start = 0;
            int end = 2;

            ArrayList<String> commonLetters = new ArrayList<String>();

            while (end <= fileToList.size()) {
                ArrayList<String> tempList = new ArrayList<String>();
                for (int i = start; i <= end; i++) {
                    tempList.add(fileToList.get(i));
                }

                commonLetters.add(findCommonLetter(tempList));

                start += 3;
                end += 3;
            }

            String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            int groupPrioritySum = 0;

            for (int i = 0; i < commonLetters.size(); i++) {
                if (lowerCaseLetters.indexOf(commonLetters.get(i)) != -1)
                    groupPrioritySum += (lowerCaseLetters.indexOf(commonLetters.get(i)) + 1);
                else if (upperCaseLetters.indexOf(commonLetters.get(i)) != -1)
                    groupPrioritySum += (upperCaseLetters.indexOf(commonLetters.get(i)) + 1 + 26);
            }

            return groupPrioritySum;

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public String findCommonLetter(ArrayList<String> list) {
        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);
        String output = "";

        outerloop: for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                for (int k = 0; k < str3.length(); k++) {
                    if (str1.substring(i, i + 1).equals(str2.substring(j, j + 1))
                            && str2.substring(j, j + 1).equals(str3.substring(k, k + 1))) {
                        output = str1.substring(i, i + 1);
                        break outerloop;
                    }
                }
            }
        }
        return output;
    }

}