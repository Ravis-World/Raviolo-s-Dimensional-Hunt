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
        Main.clearScreen();
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
        Main.clearScreen();
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
        Main.clearScreen();
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
            Main.clearScreen();
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
            Main.text("Raviolo looks over the group, making sure the mud is truly gone.");
            Main.pause();

            Main.text("His eyes stop on Stella's sandals.");
            Main.text("\"Stella...\" he says slowly.");
            Main.text("\"You should really consider ditching those gladiator sandal boots.\"");
            Main.pause();

            Main.text("\"What?\" Stella replies.");
            Main.text("\"They're stylish.\"");
            Main.pause();

            Main.text("Raviolo sighs.");
            Main.text("\"Stylish does not help when your feet get stuck in canyon traps.\"");
            Main.text("\"You should switch to knee high reinforced rubber boots.\"");
            Main.pause();

            Main.text("Stella folds her arms.");
            Main.text("\"Nope.\"");
            Main.text("\"These sandals are staying.\"");
            Main.pause();

            Main.text("She steps forward confidently.");

            Main.text("CLACK.");

            Main.text("The heelbed of one sandal catches on a sharp boulder behind her.");
            Main.pause();

            Main.text("Stella keeps walking.");

            Main.text("The sandal does not.");

            Main.text("The leather straps stretch tight around her foot.");
            Main.pause();

            Main.text("She pulls harder.");

            Main.text("RRRRRIIIIIP.");
            Main.pause();

            Main.text("The entire sole and footbed tear free from the straps.");

            Main.text("The broken sole stays hooked on the rock.");
            Main.text("The loose straps flop uselessly around Stella's foot.");
            Main.pause();

            Main.text("Stella freezes.");
            Main.pause();

            Main.text("She slowly looks down.");

            Main.text("\"...\"");
            Main.text("\"...\"");
            Main.pause();

            Main.text("Stella laughs nervously.");
            Main.text("\"Heh.\"");
            Main.text("\"Well.\"");
            Main.text("\"That explains the sudden breeze.\"");
            Main.pause();

            Main.text("Raviolo groans loudly.");
            Main.text("\"Stella.\"");
            Main.pause();

            Main.text("He raises his hand again.");
            Main.text("A flash of magic surrounds her feet.");
            Main.pause();

            Main.text("When the light fades, a pair of knee high reinforced rubber boots replace the broken sandals.");
            Main.pause();

            Main.text("They are the exact shade of tan she loved from her sandal boots.");
            Main.pause();

            Main.text("Stella lifts one foot and examines the boot.");

            Main.text("\"...Okay those are actually nice.\"");
            Main.pause();
        } else {
            Main.clearScreen();
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
            Main.text("Raviolo looks over the group, making sure the mud is truly gone.");
            Main.pause();

            Main.text("His eyes stop on Stella's sandals.");
            Main.text("\"Stella...\" he says slowly.");
            Main.text("\"You should really consider ditching those gladiator sandal boots.\"");
            Main.pause();

            Main.text("\"What?\" Stella replies.");
            Main.text("\"They're stylish.\"");
            Main.pause();

            Main.text("Raviolo sighs.");
            Main.text("\"Stylish does not help when your feet get stuck in canyon traps.\"");
            Main.text("\"You should switch to knee high reinforced rubber boots.\"");
            Main.pause();

            Main.text("Stella folds her arms.");
            Main.text("\"Nope.\"");
            Main.text("\"These sandals are staying.\"");
            Main.pause();

            Main.text("She steps forward confidently.");

            Main.text("CLACK.");

            Main.text("The heelbed of one sandal catches on a sharp rock.");
            Main.pause();

            Main.text("Stella keeps walking.");

            Main.text("The rock holds the sandal in place.");

            Main.text("The leather straps stretch tight.");

            Main.text("Stella pulls harder.");

            Main.text("Rrrrrrrrip.");

            Main.pause();

            Main.text("Several straps tear loose from the sandal.");
            Main.pause();

            Main.text("Stella freezes.");
            Main.pause();

            Main.text("She slowly looks down at the damaged sandal.");

            Main.text("\"...\"");
            Main.text("\"...\"");
            Main.pause();

            Main.text("Stella laughs nervously.");
            Main.text("\"Heh.\"");
            Main.text("\"Well.\"");
            Main.text("\"That explains the sudden breeze.\"");
            Main.pause();

            Main.text("Raviolo groans loudly.");
            Main.text("\"Stella.\"");
            Main.pause();

            Main.text("He raises his hand again.");
            Main.text("A flash of magic surrounds her feet.");
            Main.pause();

            Main.text("When the light fades, a pair of knee high reinforced rubber boots replace the broken sandals.");
            Main.pause();

            Main.text("They are the same shade of tan she loved from her sandal boots.");
            Main.pause();

            Main.text("Stella lifts one foot, inspecting the boot.");

            Main.text("\"...Okay those are actually nice.\"");
            Main.pause();
        }

        // Converge after claymine
        converge();
    }

    // ===== CONVERGENCE =====
    private static void converge() {
        Main.clearScreen();
        Main.text("The canyon widens as the team finally escapes the narrow passage.");
        Main.text("The red sky becomes visible again above the cliffs.");
        Main.pause();

        Main.text("The wind moves quietly through the canyon.");
        Main.text("For a moment, everything feels still.");
        Main.pause();

        Main.text("Then something answers the wind.");
        Main.pause();

        Main.text("A low sound echoes through the canyon walls.");
        Main.text("Not quite a growl.");
        Main.text("Not quite breathing.");
        Main.pause();

        Main.text("Toad freezes.");
        Main.text("\"...Did anyone else hear that?\"");
        Main.pause();

        Main.text("The sound comes again.");
        Main.text("Closer this time.");
        Main.pause();

        Main.text("NNNNNNNNNGHHHHHHHHH...");
        Main.text("A long, dragging noise, like something enormous pulling itself across stone.");
        Main.pause();

        Main.text("Ai slowly turns toward the darkness behind them.");
        Main.text("\"Movement detected.\"");
        Main.pause();

        Main.text("Something shifts in the canyon shadows.");
        Main.text("Too large to be a normal creature.");
        Main.pause();

        Main.text("A shape unfolds from the rock wall.");
        Main.text("Limbs - too many of them - scraping against the canyon stone.");
        Main.pause();

        Main.text("SCRRRRRRRAAAAAAAPE.");
        Main.text("The sound of claws grinding against rock fills the canyon.");
        Main.pause();

        Main.text("Two dim red lights open in the darkness.");
        Main.text("Eyes.");
        Main.pause();

        Main.text("Toad whispers, \"Please tell me that's not looking at us.\"");
        Main.pause();

        Main.text("The creature inhales.");
        Main.text("The sound echoes like wind rushing into a cave.");

        Main.text("Then it SCREAMS.");

        Main.text("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        Main.pause();

        Main.text("The team does not wait to find out what it is.");
        Main.text("They run, but Raviolo doesn't.");
        Main.pause();

        Main.text("He points his finger up at the monster.");
        Main.text("Waves of pure energy fill the area and confine to a single point.");

        Main.text("Ai turns back.");
        Main.text("\"Raviolo! What are you doing?!\"");

        Main.text("\"Buying us time,\" Raviolo says.");

        Main.pause();

        Main.text("The creature crawls closer.");
        Main.text("Claws scrape against the stone.");
        Main.text("Its scream shakes the canyon walls.");

        Main.pause();

        Main.text("Raviolo compresses the energy further.");
        Main.text("The power must be released NOW.");

        Main.pause();

        Main.text("Choose an energy blast:");
        Main.text("1. Crimson Burst");
        Main.text("2. Void Pulse");
        Main.text("3. Prism Lock");
        Main.text("4. Thunder Lance");
        Main.text("> ");

        String choice;

        do {
            choice = Input.scanner.nextLine().trim();

            if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                Main.text("The energy destabilises. Choose quickly!");
                Main.text("> ");
            }

        } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"));

        if (choice.equals("3")) {

            Main.text("Raviolo focuses the energy into a prism of blinding light.");
            Main.text("San-ryō-kyō!");
            Main.text("The blast strikes the creature.");
            Main.pause();

            Main.text("A cage of shifting colours erupts around it.");
            Main.text("The monster thrashes against the light, claws scraping uselessly.");
            Main.pause();

            Main.text("Toad stares. \"It... it can't get out.\"");
            Main.text("Raviolo lowers his hand. \"Not for a while.\"");
            Main.pause();

            Main.text("The team quickly escapes while the creature remains trapped.");
            canyonEnding();
        } else if (choice.equals("1")) {

            Main.text("Raviolo fires a violent burst of crimson energy.");
            Main.text("Mo-e-ru!");
            Main.pause();

            Main.text("The blast hits the creature.");
            Main.text("For a moment it stops.");
            Main.pause();

            Main.text("Then the monster SCREAMS.");
            Main.text("The red energy feeds it.");
            Main.text("The creature lunges.");

            Main.deathPause();
            converge();
        } else if (choice.equals("2")) {

            Main.text("Raviolo compresses the energy into a dark sphere.");
            Main.text("Pulsus Vacuus!");
            Main.pause();

            Main.text("The void pulse collapses inward...");
            Main.text("Then violently implodes.");

            Main.text("The backlash tears through the canyon.");

            Main.deathPause();
            converge();
        } else if (choice.equals("4")) {

            Main.text("A bolt of lightning erupts from Raviolo's hand.");
            Main.text("Nayzeh-ye Ra'd!");
            Main.pause();

            Main.text("The creature absorbs the electricity.");
            Main.text("Its eyes blaze brighter.");

            Main.text("The canyon fills with a deafening roar.");

            Main.deathPause();
            converge();
        }
    }

    private static void canyonEnding() {
        Main.clearScreen();
        Main.text("After the canyon's trials, the team finally steps onto a stable plateau.");
        Main.text("The red light softens, the walls opening slightly to reveal the distant horizon.");
        Main.pause();

        Main.text("Toad shakes his head. \"That was… intense.\"");
        Main.text("Ai sighs. \"I didn’t think we’d make it out without losing a boot—or a limb.\"");
        Main.text("Diamond mutters: \"Next time, let’s avoid canyon detours.\"");
        Main.pause();

        Main.text("The plateau stretches before them, silent except for the distant echo of dripping water and the faint hum of the Red World.");
        Main.text("Then something catches your eye—a small, folded piece of parchment wedged between two rocks.");
        Main.pause();

        Main.text("You pick it up and unfold it carefully.");
        Main.text("The note reads:");
        Main.text("\"The rubies aren’t as far as you think… but beware the shadows that walk alone.\"");
        Main.text("It’s signed with a single symbol you don’t recognise yet:\n");
        Main.text("\">\"");
        Main.pause();

        Main.text("Raviolo frowns, holding the note up to the light.");
        Main.text("\"This is just the beginning…\" he mutters.");
        Main.text("The canyon behind you is quiet now, but the path forward is unknown.");
        Main.pause();

        Main.text("You tuck the note safely away and look at the portal leading out of the Red Canyon.");
        Main.text("The next dimension awaits.");
        Main.text("\n=== END OF RED CANYON PATH ===");
        Main.pause();
    }
}