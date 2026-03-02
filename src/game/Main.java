package game;

public class Main {
    public static void main(String[] args) throws Exception {
        Boot.showIntro();
        MainMenu.showMenu();
    }

    public static void text(String msg) {
        System.out.println(msg);
    }
}