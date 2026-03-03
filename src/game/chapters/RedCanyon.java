package game.chapters;

import game.Main;
import game.Input;

public class RedCanyon {

    public static void start() {
        // Just a sample test
        Main.text("You head into the canyon. The red cliffs tower above you.");
        Main.pause();

        Main.text("You spot a narrow ledge leading to a dark alcove.");
        Main.text("1. Climb the ledge");
        Main.text("2. Follow the main path");
        Main.text("> ");

        String choice = Input.scanner.nextLine().trim();

        if (choice.equals("1")) {
            Main.text("Dead end. No ruby here.");
            Main.pause();
        } else if (choice.equals("2")) {
            Main.text("You find the ruby shimmering on a cliff edge!");
            Main.pause();
        } else {
            Main.text("Invalid choice.");
            Main.pause();
            start();
        }
    }
}