import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        boolean acceptingInput = true;
        System.out.println("Hello from Duke");
        System.out.println("What can I do for you?");
        ArrayList<String> storage = new ArrayList<>();

        while (acceptingInput) {
            Scanner inputScanner = new Scanner(System.in);
            String inputString = inputScanner.nextLine();
            if (inputString.equals("bye")){
                acceptingInput = false;
                System.out.println("Bye. Hope to see you again soon!");
            } else if (inputString.equals("list")) {
                for (int i = 0; i < storage.size(); i++) {
                    System.out.println(i + ". " + storage.get(i));
                }
            } else {
                storage.add(inputString);
                System.out.println("added: " + inputString);
            }
        }

    }
}
