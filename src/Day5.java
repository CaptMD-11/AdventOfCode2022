import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {

    public String cratesOnTop() {
        try {
            File file = new File("data/Day5.txt");
            Scanner scanner = new Scanner(file);
            String line = "";

            Stack<String> stack1 = new Stack<String>();
            Stack<String> stack2 = new Stack<String>();
            Stack<String> stack3 = new Stack<String>();
            Stack<String> stack4 = new Stack<String>();
            Stack<String> stack5 = new Stack<String>();
            Stack<String> stack6 = new Stack<String>();
            Stack<String> stack7 = new Stack<String>();
            Stack<String> stack8 = new Stack<String>();
            Stack<String> stack9 = new Stack<String>();

            stack1.push("n");
            stack1.push("s");
            stack1.push("d");
            stack1.push("c");
            stack1.push("v");
            stack1.push("q");
            stack1.push("t");

            stack2.push("m");
            stack2.push("f");
            stack2.push("v");

            stack3.push("f");
            stack3.push("q");
            stack3.push("w");
            stack3.push("d");
            stack3.push("p");
            stack3.push("n");
            stack3.push("h");
            stack3.push("m");

            stack4.push("d");
            stack4.push("q");
            stack4.push("r");
            stack4.push("t");
            stack4.push("f");

            stack5.push("r");
            stack5.push("f");
            stack5.push("m");
            stack5.push("n");
            stack5.push("q");
            stack5.push("h");
            stack5.push("v");
            stack5.push("b");

            stack6.push("c");
            stack6.push("f");
            stack6.push("g");
            stack6.push("n");
            stack6.push("p");
            stack6.push("w");
            stack6.push("q");

            stack7.push("w");
            stack7.push("f");
            stack7.push("r");
            stack7.push("l");
            stack7.push("c");
            stack7.push("t");

            stack8.push("t");
            stack8.push("z");
            stack8.push("n");
            stack8.push("s");

            stack9.push("m");
            stack9.push("s");
            stack9.push("d");
            stack9.push("j");
            stack9.push("r");
            stack9.push("q");
            stack9.push("h");
            stack9.push("n");

            boolean stack1Select = false;
            boolean stack2Select = false;
            boolean stack3Select = false;
            boolean stack4Select = false;
            boolean stack5Select = false;
            boolean stack6Select = false;
            boolean stack7Select = false;
            boolean stack8Select = false;
            boolean stack9Select = false;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                int amountToMove = Integer.parseInt(line.substring(line.indexOf(" ") + 1), line.indexOf("f") - 1);
                Stack<String> temp1 = new Stack<String>();
                Stack<String> temp2 = new Stack<String>();
                if (line.substring(line.lastIndexOf("m") + 2, line.lastIndexOf("t") - 1).equals("1")) {
                    if (line.substring(line.lastIndexOf("o") + 1).equals("1")) {

                    }
                }
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

}