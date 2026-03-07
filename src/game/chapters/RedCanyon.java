package game.chapters;

import game.Main;
import game.Input;

public class RedCanyon {

    public static void start() {
        Main.text("The team approaches the Red Canyon.");
        Main.text("Sheer crimson cliffs rise on both sides, glowing faintly under the strange red sky.");
        Main.pause();

        Main.text("Diamond squints upward. \"We could climb above it.\"");
        Main.text("Stella points into the shadows. \"Or go through it.\"");
        Main.text("Toad gulps. \"Why do I feel like both are bad ideas?\"");
        Main.pause();

        Main.text("Ai scans the terrain. \"Both routes are possible. Neither is safe.\"");
        Main.text("Toadette sighs. \"Then let’s pick our poison.\"");
        Main.pause();

        String choice;

        // ===== CLIMB OR INSIDE REPEAT-UNTIL =====
        do {
            Main.text("How will you enter the canyon?");
            Main.text("1. Climb above the canyon");
            Main.text("2. Go inside the canyon");
            Main.text("> ");

            choice = Input.scanner.nextLine().trim();

            if (!choice.equals("1") && !choice.equals("2")) {
                Main.text("Invalid choice. The team hesitates.");
                Main.pause();
            }

        } while (!choice.equals("1") && !choice.equals("2"));

        if (choice.equals("1")) {
            upperPath();
        } else {
            innerPath();
        }
    }

    // ===== PATH 1: ABOVE =====
    private static void upperPath() {
        Main.text("\nYou begin climbing the canyon wall.");
        Main.text("The rock is warm and gritty, glowing red beneath your hands.");
        Main.pause();

        Main.text("Toad slips slightly. \"I hate this! I hate this!\"");
        Main.text("Diamond pulls him back up. \"Focus.\"");
        Main.pause();

        Main.text("From above, the canyon looks endless.");
        Main.text("You spot something glinting far below - a faint ruby reflection.");
        Main.pause();

        // ===== CLAYMINE TRAP =====
        canyonTop();
    }

    // ===== PATH 2: INSIDE =====
    private static void innerPath() {
        Main.text("\nYou enter the canyon itself.");
        Main.text("The walls close in around you, the red light dimming into shadow.");
        Main.pause();

        Main.text("Every sound echoes - footsteps, breathing, the faint hum of the world.");
        Main.pause();

        Main.text("Toad whispers, \"This place feels alive.\"");
        Main.text("Toadette replies, \"Everything here feels alive.\"");
        Main.pause();

        Main.text("A thin red mist drifts along the ground.");
        Main.text("It swirls strangely, forming shapes that vanish when approached.");
        Main.pause();

        Main.text("Ai stops suddenly. \"We are not alone.\"");
        Main.text("A shadow moves along the wall, then disappears.");
        Main.text("The canyon narrows as the team walks deeper inside.");
        Main.text("The red stone walls grow taller, closing in overhead until the sky disappears.");
        Main.pause();

        Main.text("Toad whispers, \"I really do not like this place.\"");
        Main.text("Their footsteps echo between the rock walls.");
        Main.pause();

        Main.text("Suddenly - CRACK.");
        Main.text("A slab of stone shifts under Diamond's foot.");
        Main.text("Before anyone can react, a section of the canyon wall collapses.");
        Main.pause();

        Main.text("Rocks slam into the ground with a thunderous crash.");
        Main.text("Dust fills the air.");
        Main.text("When it settles, the team realises what happened.");
        Main.pause();

        Main.text("Their arms and legs are pinned beneath fallen stone.");
        Main.text("They can move... but not enough to escape.");
        Main.pause();

        Main.text("Toad groans. \"Oh no. Oh no no no.\"");
        Main.text("Stella mutters, \"This is exactly how those survival stories start.\"");
        Main.pause();

        Main.text("Everyone looks at Raviolo.");

        Main.text("Raviolo sighs.");
        Main.text("\"Relax. I planned for this.\"");
        Main.pause();

        Main.text("Ai tilts her head. \"You planned to be crushed by rocks?\"");
        Main.text("\"Not exactly,\" Raviolo replies.");
        Main.pause();

        Main.text("\"Rainbow Ravi.\"");
        Main.pause();

        Main.text("A faint glow spreads from Raviolo's hands.");
        Main.text("Colours ripple through the canyon like liquid light.");
        Main.pause();

        Main.text("The power flows outward, spreading across the team.");
        Main.text("Even the trapped stones begin to shimmer.");
        Main.pause();

        Main.text("Toad blinks. \"Wait... I can move again.\"");
        Main.pause();

        Main.text("With a burst of colour, the rocks lighten as if gravity forgot about them.");
        Main.text("The team pushes the stones aside with surprising ease.");
        Main.pause();

        Main.text("Diamond stretches her arms.");
        Main.text("\"I always forget you can do that.\"");

        Main.text("Raviolo shrugs.");
        Main.text("\"Usually it's a terrible idea early game.\"");
        Main.text("\"But sometimes it saves us from getting flattened.\"");
        Main.pause();

        Main.text("Toadette dusts herself off.");
        Main.text("\"Next time maybe use it BEFORE the rocks fall.\"");
        Main.pause();

        Main.text("The canyon opens ahead.");
        Main.text("The team continues forward, now certain the ruby trail passed through here.");
        Main.pause();
        converge();
    }

    // ===== CANYON TOP CLAYMINE =====
    private static void canyonTop() {
        Main.text("The team climbs higher and higher, until the canyon floor disappears beneath them.");
        Main.text("The red stone narrows into a wide plateau coated in dull, cracked clay.");
        Main.pause();

        Main.text("Diamond steps forward - and suddenly freezes.");
        Main.text("\"Uh... guys? I can’t lift my foot.\"");
        Main.pause();

        Main.text("One by one, everyone realises their boots are sinking.");
        Main.text("The clay ripples like thick mud, gripping the soles with suction.");
        Main.pause();

        Main.text("Stella groans. \"Of course it’s sticky. This world is always sticky.\"");
        Main.text("Ai scans the ground. \"Guys, we are experts at this - if we panic, we’ll sink deeper.\"");
        Main.pause();

        String choice;

        do {
            Main.text("What should the team do?");
            Main.text("1. Take off their boots and escape barefoot");
            Main.text("2. Pull their boots free and keep their protection");
            Main.text("> ");

            choice = Input.scanner.nextLine().trim();

            if (!choice.equals("1") && !choice.equals("2")) {
                Main.text("They hesitate. The clay tugs harder.");
                Main.pause();
            }

        } while (!choice.equals("1") && !choice.equals("2"));

        if (choice.equals("1")) {
            Main.text("Raviolo orders everyone to sit down slowly.");
            Main.text("One by one, they slip their boots off.");
            Main.text("The clay releases with wet, sucking sounds.");
            Main.pause();

            Main.text("Barefoot, they tiptoe across the sticky surface, wincing at every step.");
            Main.text("Toad mutters, \"I really miss my shoes.\"");
            Main.text("\"We are magicians,\" Raviolo calls out. \"Watch this.\"");
            Main.text("\"By the power of plot, give us our shoes back.\"");
            Main.text("And so their shoes were given back and reset.");
            Main.pause();

        } else {
            Main.text("Raviolo plants his hands firmly on the ground.");
            Main.text("\"On three - pull!\"");
            Main.pause();

            Main.text("One... two... three! Everyone heaves with all their strength.");
            Main.text("Hnnnggggg... nnn-ngh... the clay grips like a living beast!");
            Main.pause();

            Main.text("The boots stretch, thick red clay quivering with each tug.");
            Main.text("A wet ripping sound echoes as soles tear free with a squelch.");
            Main.pause();

            Main.text("Ai grunts: \"Keep going! Don't stop now!\"");
            Main.text("Diamond groans: \"My hands... my arms... hnnnngh!\"");
            Main.pause();

            Main.text("The clay stretches and rips again - like taffy being pulled too far.");
            Main.text("Clumps of red sludge fly off the sides, splattering the canyon floor.");
            Main.text("Toadette screams: \"MY SHOE! IT'S STUCK! Hnnnnnnnngh!\"");
            Main.text("She twists, tugs, and finally - POP! - the clay releases with a wet, sucking squelch.");
            Main.text("Everyone stumbles backward, boots tearing loose with wet, ripping sounds.");
            Main.pause();

            Main.text("Thick red clay coats the soles and climbs up the sides of their shoes.");
            Main.text("It drips slowly back into the pit, refusing to let go.");
            Main.pause();

            Main.text("Toadette lifts her foot and stares at it in horror.");
            Main.text("\"Look at my shoe!\"");
            Main.text("\"This is museum-grade mud. This is *historic* mud.\"");
            Main.text("\"I am NOT walking around with prehistoric canyon goo on my boots.\"");
            Main.pause();

            Main.text("She scrapes her sole against a rock, but it only smears the clay thinner.");
            Main.text("Toad snickers. \"At least it matches the world.\"");

            Main.text("\"We wear the same shoes that are just now covered in this goo,\" Toadette groaned.");
            Main.text("\"Not all the same.\"");
            Main.text("\"How?\"");
            Main.text("\"My shoes have a leather feel. Yours are more bumpy. Check the official renders.\"");
            Main.pause();

            Main.text("Stella lifts her foot, grimacing.");
            Main.text("\"Ugh, my sandals!\"");
            Main.text("Red clay has seeped between every strap and around her toes.");
            Main.text("\"I can feel it squishing everywhere...\"");
            Main.pause();

            Main.text("She tries to scrape it off on a nearby rock, but it only smears it further.");
            Main.text("Her toes wiggle in protest as the goo creeps into the tiniest gaps.");

            Main.text("Diamond shakes her head. \"At least it's not your socks.\"");
            Main.text("Stella mutters: \"You just wait. This will take forever to clean.\"");

            Main.text("\"We are magicians,\" Raviolo calls out. \"Watch this.\"");
            Main.text("\"By the power of plot, clean all our shoes.\"");

            Main.text("And just like that, the mud vanishes.");
            Main.text("Their shoes reset to satisfactory levels.");
            Main.pause();
        }

        // Converge after claymine
        converge();
    }

    // ===== CONVERGENCE =====
    private static void converge() {
        Main.text("\nThe team emerges from the canyon on the far side.");

        Main.text("Diamond looks back. \"Whatever took the ruby passed through here.\"");
        Main.text("Stella nods. \"We’re on the right trail.\"");
        Main.pause();

        Main.text("Toad sighs in relief. \"Next time, can we search somewhere normal?\"");
        Main.text("Toadette smirks. \"Define normal.\"");
        Main.pause();

        Main.text("Ai kneels and examines the dust.");
        Main.text("\"There are marks here. Something heavy was dragged away.\"");
        Main.pause();
    }
}