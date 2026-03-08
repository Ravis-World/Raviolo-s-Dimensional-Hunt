package game;

public class Main {

    public static void main(String[] args) throws Exception {
        Boot.showIntro();
        MainMenu.showMenu();
    }

    public static void text(String msg) {
        System.out.println(msg);
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
            }
        } catch (Exception e) {}
    }

    // ✅ GLOBAL pause method
    public static void pause() {
        text("\n(Press Enter to continue)");
        Input.scanner.nextLine();
        clearScreen();
    }

    // 💀 Alternate pause for death
    public static void deathPause() {
        text("");
        text("=== YOU DIED ===");
        text("");
        text("Press Enter to return to checkpoint...");
        Input.scanner.nextLine();
    }
}