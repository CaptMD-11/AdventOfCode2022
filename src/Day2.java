import java.io.File;
import java.util.Scanner;

// Rock Paper Scissors game 
public class Day2 {

    // PART I METHOD
    public int totalScore() {
        try {
            File file = new File("data/Day2.txt");
            Scanner scanner = new Scanner(file);
            int totalScore = 0;
            String line = "";

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                totalScore += getRoundScore(line);
            }
            scanner.close();
            return totalScore;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public int getRoundScore(String line) {
        int roundScore = 0;
        if (line.substring(2).equals("X"))
            roundScore += 1;
        else if (line.substring(2).equals("Y"))
            roundScore += 2;
        else if (line.substring(2).equals("Z"))
            roundScore += 3;

        if (displayRoundOutcome(line).equals("win"))
            roundScore += 6;
        else if (displayRoundOutcome(line).equals("lose"))
            roundScore += 0;
        else if (displayRoundOutcome(line).equals("draw"))
            roundScore += 3;

        return roundScore;
    }

    public String displayRoundOutcome(String line) {
        if ((line.substring(0, 1).equals("A") && line.substring(2).equals("Y"))
                || (line.substring(0, 1).equals("B") && line.substring(2).equals("Z"))
                || (line.substring(0, 1).equals("C") && line.substring(2).equals("X")))
            return "win";
        else if ((line.substring(0, 1).equals("A") && line.substring(2).equals("X"))
                || (line.substring(0, 1).equals("B") && line.substring(2).equals("Y"))
                || (line.substring(0, 1).equals("C") && line.substring(2).equals("Z")))
            return "draw";

        else
            return "lose";

    }

    // PART II METHOD
    public int decryptTotalScore() {
        try {
            File file = new File("data/Day2.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int totalScore = 0;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String tempLine = line.substring(0, 2);

                if (line.substring(2).equals("X")) {
                    if (line.substring(0, 1).equals("A"))
                        tempLine += "Z";
                    else if (line.substring(0, 1).equals("B"))
                        tempLine += "X";
                    else if (line.substring(0, 1).equals("C"))
                        tempLine += "Y";
                } else if (line.substring(2).equals("Y"))
                    tempLine += getMatchingLetter(tempLine.substring(0, 1));
                else if (line.substring(2).equals("Z")) {
                    if (line.substring(0, 1).equals("A"))
                        tempLine += "Y";
                    else if (line.substring(0, 1).equals("B"))
                        tempLine += "Z";
                    else if (line.substring(0, 1).equals("C"))
                        tempLine += "X";
                }

                totalScore += getRoundScore(tempLine);
            }
            scanner.close();
            return totalScore;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public String getMatchingLetter(String input) {
        if (input.equals("A"))
            return "X";
        else if (input.equals("B"))
            return "Y";
        else if (input.equals("C"))
            return "Z";
        return "";
    }

}