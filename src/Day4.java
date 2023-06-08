import java.io.File;
import java.util.Scanner;

public class Day4 {

    // PART I METHOD
    public int numberOfFullyContain() {
        try {
            File file = new File("data/Day4.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int count = 0;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String part1 = line.substring(0, line.indexOf(","));
                String part2 = line.substring(line.indexOf(",") + 1);
                int part1Start = Integer.parseInt(part1.substring(0, part1.indexOf("-")));
                int part1End = Integer.parseInt(part1.substring(part1.indexOf("-") + 1));
                int part2Start = Integer.parseInt(part2.substring(0, part2.indexOf("-")));
                int part2End = Integer.parseInt(part2.substring(part2.indexOf("-") + 1));

                if ((part2Start <= part1Start && part1End <= part2End)
                        || (part1Start <= part2Start && part2End <= part1End))
                    count++;

            }
            scanner.close();
            return count;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // PART II METHOD
    public int numberOfOverlapAtAll() {
        try {
            File file = new File("data/Day4.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int count = 0;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (doesOverlap(line))
                    count++;
            }
            scanner.close();
            return count;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public boolean doesOverlap(String line) {
        String part1 = line.substring(0, line.indexOf(","));
        String part2 = line.substring(line.indexOf(",") + 1);
        int part1Start = Integer.parseInt(part1.substring(0, part1.indexOf("-")));
        int part1End = Integer.parseInt(part1.substring(part1.indexOf("-") + 1));
        int part2Start = Integer.parseInt(part2.substring(0, part2.indexOf("-")));
        int part2End = Integer.parseInt(part2.substring(part2.indexOf("-") + 1));
        for (int i = part1Start; i <= part1End; i++) {
            if (i == part2Start)
                return true;
        }
        for (int i = part2Start; i <= part2End; i++) {
            if (i == part1Start)
                return true;
        }
        return false;
    }

}