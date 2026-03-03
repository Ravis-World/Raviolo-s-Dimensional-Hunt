package game;

import java.io.*;
import java.util.*;

public class MainMenu {

    /** Show the main menu loop */
    public static void showMenu() {
        while (true) {
            clearScreen();
            Main.text("=== EASTER BUNNY'S HOLLOW ===");
            Main.text("Track the stolen rubies\n");

            ArrayList<String[]> chapters = getAvailableChapters();

            if (chapters.isEmpty()) {
                Main.text("No chapters found.");
                Main.pause();
                return;
            }

            for (int i = 0; i < chapters.size(); i++) {
                String displayName = chapters.get(i)[1]; // display name
                Main.text((i + 1) + ". " + displayName);
            }

            Main.text("Q. Quit\n");
            System.out.print("> ");
            String choice = Input.scanner.nextLine().toLowerCase();

            if (choice.equals("q")) {
                System.exit(0);
            }

            try {
                int index = Integer.parseInt(choice) - 1;
                if (index >= 0 && index < chapters.size()) {
                    clearScreen();
                    runChapter(chapters.get(index)[0]); // class name
                } else {
                    Main.text("Invalid chapter number.");
                    Main.pause();
                }
            } catch (NumberFormatException e) {
                Main.text("Invalid input. Please enter a number or 'Q'.");
                Main.pause();
            }
        }
    }

    /** Read chapters.txt and return {className, displayName} */
    private static ArrayList<String[]> getAvailableChapters() {
        ArrayList<String[]> list = new ArrayList<>();

        File file = new File("chapters.txt");
        if (!file.exists()) return list;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty() || line.startsWith("#")) continue;

                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    String className = parts[0].trim();
                    String displayName = parts[1].trim();
                    list.add(new String[]{className, displayName});
                }
            }
        } catch (Exception e) {
            Main.text("Failed to load chapters.txt");
            Main.pause();
        }

        return list;
    }

    /** Run a chapter by reflection */
    private static void runChapter(String className) {
        try {
            Class<?> chapter = Class.forName("game.chapters." + className);
            chapter.getMethod("startGame").invoke(null);
        } catch (Exception e) {
            Main.text("Error loading chapter: " + className);
            Main.pause();
        }
    }

    /** Clear console screen */
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
            }
        } catch (Exception e) {}
    }
}