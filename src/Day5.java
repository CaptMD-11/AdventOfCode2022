import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {

    public String cratesOnTop() {
        try {
            File file = new File("data/Day5.txt");
            Scanner scanner = new Scanner(file);
            String line = "";

            ArrayList<String> stack1 = new ArrayList<String>();
            ArrayList<String> stack2 = new ArrayList<String>();
            ArrayList<String> stack3 = new ArrayList<String>();
            ArrayList<String> stack4 = new ArrayList<String>();
            ArrayList<String> stack5 = new ArrayList<String>();
            ArrayList<String> stack6 = new ArrayList<String>();
            ArrayList<String> stack7 = new ArrayList<String>();
            ArrayList<String> stack8 = new ArrayList<String>();
            ArrayList<String> stack9 = new ArrayList<String>();

            stack1.add("n");
            stack1.add("s");
            stack1.add("d");
            stack1.add("c");
            stack1.add("v");
            stack1.add("q");
            stack1.add("t");

            stack2.add("m");
            stack2.add("f");
            stack2.add("v");

            stack3.add("f");
            stack3.add("q");
            stack3.add("w");
            stack3.add("d");
            stack3.add("p");
            stack3.add("n");
            stack3.add("h");
            stack3.add("m");

            stack4.add("d");
            stack4.add("q");
            stack4.add("r");
            stack4.add("t");
            stack4.add("f");

            stack5.add("r");
            stack5.add("f");
            stack5.add("m");
            stack5.add("n");
            stack5.add("q");
            stack5.add("h");
            stack5.add("v");
            stack5.add("b");

            stack6.add("c");
            stack6.add("f");
            stack6.add("g");
            stack6.add("n");
            stack6.add("p");
            stack6.add("w");
            stack6.add("q");

            stack7.add("w");
            stack7.add("f");
            stack7.add("r");
            stack7.add("l");
            stack7.add("c");
            stack7.add("t");

            stack8.add("t");
            stack8.add("z");
            stack8.add("n");
            stack8.add("s");

            stack9.add("m");
            stack9.add("s");
            stack9.add("d");
            stack9.add("j");
            stack9.add("r");
            stack9.add("q");
            stack9.add("h");
            stack9.add("n");

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                int amountToMove = Integer.parseInt(line.substring(line.indexOf(" ") + 1), line.indexOf("f") - 1);
                for (int i = 0; i < amountToMove; i++) {

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

}