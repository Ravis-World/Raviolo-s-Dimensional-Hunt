package game;

import java.io.*;
import java.util.*;

public class MainMenu {

    // Map for friendly chapter names
    private static Map<String, String> chapterNames = new HashMap<>();

    // Load chapter names when class is loaded
    static {
        loadChapterNames();
    }

    /** Reads chapters.txt to map class names to display names */
    private static void loadChapterNames() {
        File file = new File("src/game/chapters.txt");
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || !line.contains("=")) continue;
                String[] parts = line.split("=", 2);
                chapterNames.put(parts[0].trim(), parts[1].trim());
            }
        } catch (IOException e) {
            Main.text("Error reading chapters.txt: " + e.getMessage());
        }
    }

    /** Get friendly name or fallback to cleaned class name */
    private static String getDisplayName(String className) {
        return chapterNames.getOrDefault(className, className.replace("_", " "));
    }

    /** Show the main menu loop */
    public static void showMenu() {
        while (true) {
            clearScreen();
            Main.text("=== EASTER BUNNY'S HOLLOW ===");
            Main.text("Track the stolen rubies\n");

            ArrayList<String> chapters = getAvailableChapters();

            if (chapters.isEmpty()) {
                Main.text("No chapters found.");
                pause();
                return;
            }

            for (int i = 0; i < chapters.size(); i++) {
                String displayName = getDisplayName(chapters.get(i));
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
                    runChapter(chapters.get(index));
                } else {
                    Main.text("Invalid chapter number.");
                    pause();
                }
            } catch (NumberFormatException e) {
                Main.text("Invalid input. Please enter a number or 'Q'.");
                pause();
            }
        }
    }

    /** List all .class files in build/game/chapters and return class names */
    private static ArrayList<String> getAvailableChapters() {
        ArrayList<String> list = new ArrayList<>();
        File folder = new File("build/game/chapters");

        if (!folder.exists()) return list;

        for (File file : folder.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                list.add(file.getName().replace(".class", ""));
            }
        }
        Collections.sort(list);
        return list;
    }

    /** Run a chapter by reflection */
    private static void runChapter(String className) {
        try {
            Class<?> chapter = Class.forName("game.chapters." + className);
            chapter.getMethod("startGame").invoke(null);
        } catch (Exception e) {
            Main.text("Error loading chapter: " + className + "\n" + e);
            pause();
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

    /** Pause until user presses Enter */
    private static void pause() {
        Main.text("\nPress Enter...");
        Input.scanner.nextLine();
    }
}