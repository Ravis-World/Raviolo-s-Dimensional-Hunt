package game;

public class Boot {

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
            }
        } catch (Exception e) {}
    }

    public static void setTitle(String title) {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "title " + title).start();
            }
        } catch (Exception e) {}
    }

    public static void showIntro() throws InterruptedException {
        clearScreen();
        setTitle("Raviolo's Dimensional Hunt");

        String[] bootText = {
            "Copyleft Ravi's World",
            "C:\\>",
            "Loading dimensional tracker...",
            "Accessing Easter Bunny's Hollow...",
            "DONE."
        };

        int[] delays = {100, 1500, 1000, 1200, 1500};

        for (int i = 0; i < bootText.length; i++) {
            Main.text(bootText[i]);
            Thread.sleep(delays[i]);
        }

        Thread.sleep(500);
        clearScreen();
    }
}