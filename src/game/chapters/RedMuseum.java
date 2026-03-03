package game.chapters;

import game.Main;
import game.Input;

public class RedMuseum {

    public static void start() {
        // Just a sample test
        Main.text("You enter the Red World Museum.");
        Main.pause();

        Main.text("A glowing display case sits in the center.");
        Main.text("1. Inspect the case");
        Main.text("2. Explore side rooms");
        Main.text("> ");

        String choice = Input.scanner.nextLine().trim();

        if (choice.equals("1")) {
            Main.text("Inside the case rests the ruby. You retrieve it!");
            Main.pause();
        } else if (choice.equals("2")) {
            Main.text("Empty rooms. No ruby here.");
            Main.pause();
        } else {
            Main.text("Invalid choice.");
            Main.pause();
            start();
        }
    }
}