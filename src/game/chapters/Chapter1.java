package game.chapters;

import game.Main;
import game.Input;

public class Chapter1 {

    public static void startGame() {
        // --- PROLOGUE (existing) ---
        Main.text("Prologue: Dimensional Trouble\n");

        Main.text("The vault was open.");
        Main.text("Not broken.");
        Main.text("Not forced.");
        Main.text("Just... open.");

        Main.text("Raviolo stood in the middle of the gem chamber with his team,");
        Main.text("staring at rows of empty pedestals where the rubies once sat.");

        Main.text("Every ruby was gone.");
        Main.text("No alarms had triggered.");
        Main.text("No portals had logged an exit.\n");
        Main.text("Someone knew exactly what they were doing.");
        Main.pause();

        Main.text("A voice broke the silence.");
        Main.text("\"I might know where your rubies went.\"\n");
        Main.text("The team turned.");
        Main.pause();

        Main.text("A tall, pale bunny stood in the doorway, upright like a person.");
        Main.text("Its ears brushed the frame. Its eyes reflected colours that were not there.");

        Main.text("\"I am the Warden of the Hollow,\" the bunny said. \"The Easter Bunny, if you will.\"\n");
        Main.text("\"My portals track dimensional disturbances.\"");
        Main.text("\"When your rubies vanished... they left a trail.\"\n");
        Main.text("\"A trail to where?\" Raviolo asked.\n");
        Main.text("\"To your own worlds.\"\n");
        Main.text("The bunny led them through a portal that was not on any map.");
        Main.pause();

        Main.text("They emerged on Planet 51 Eridani.");
        Main.text("Deep underground was the Hollow - a chamber of glowing crystal and stone.");
        Main.text("Roots twisted across the ceiling. Rings of light floated in the air.\n");
        Main.text("\"These are my trackers,\" the bunny said.");
        Main.text(
                "\"Your rubies were stolen; I've tracked them into possible locations: somehow, dimensions you already control.\"");
        Main.pause();

        Main.text("Images appeared:");
        Main.text("The Red World.");
        Main.text("The Yellow Storm Realm.");
        Main.text("The Orange Plains of Fire.");
        Main.text("The Ocean Silence.");
        Main.text("The Violet Fracture.\n");
        Main.text("The worlds of the gemstones.");
        Main.pause();

        Main.text("\"Coincidental,\" someone whispered.");
        // Translates to "Yes, convenient."
        Main.text("\"Da, udobno,\" the bunny replied.");
        Main.text("\"I will grant you access to my Hollow.\"");
        Main.text("\"Use it as your hub.\"\n");
        Main.text("\"Each doorway leads to a world where the rubies were taken.\"");
        Main.pause();

        Main.text("\"Then we start now,\" Raviolo said.");
        Main.text("The first portal ignited, glowing red and gold.");
        Main.text("Behind them, the Hollow hummed softly.");
        Main.text("And somewhere deep within its walls...");
        Main.text("Something listened.\n\n\n");
        Main.text("=== END OF PROLOGUE ===");
        Main.pause();
        chapter1Start();
    }

    public static void chapter1Start() {
        Main.text("Chapter 1: The Ruby Robber");
        Main.text("You step through the glowing portal and into the Red World - the tutorial dimension.");
        Main.text("Everything here glows a deep crimson, from the ground beneath your feet to the jagged cliffs in the distance.");
        Main.text("Even the air feels thick, tinged with a strange warmth and a faint hum that seems to resonate from the world itself.");
        Main.pause();
        
        Main.text("The team fumbles behind you, whispering nervously.");
        Main.text("Raviolo takes a deep breath, reminding everyone that there's no time to gawk - the ruby hoard isn't going to wait.");
        Main.pause();
        
        Main.text("You glance at your surroundings: jagged rocks, glowing fungi, and streams of red mist curling through the canyons.");
        Main.text("Nothing seems out of place... and yet, you feel that the ruby is hiding in plain sight.");
        Main.pause();
        
        Main.text("The team approaches a junction in the terrain. Two obvious paths lie ahead:");
        Main.text("One leads to a deep canyon, twisting and winding into darkness.");
        Main.text("The other leads toward a grand building with angular walls and large windows - the Museum.");
        Main.text("Despite being a tutorial world, you sense the ruby won't be easy to find here.");
        Main.pause();
    
        String firstChoice;
    
        do {
            Main.text("It's time to choose your path.");
            Main.text("1. Venture into the Canyon");
            Main.text("2. Head to the Museum");
            Main.text("> ");
    
            firstChoice = Input.scanner.nextLine().trim();
    
            if (!firstChoice.equals("1") && !firstChoice.equals("2")) {
                Main.text("Invalid choice. The team hesitates.");
                Main.pause();
            }
    
        } while (!firstChoice.equals("1") && !firstChoice.equals("2"));
    
        if (firstChoice.equals("1")) {
            RedCanyon.start();
        } else {
            RedMuseum.start();
        }
    }
}