package game.chapters;

import game.Main;
import game.Input;

public class RedMuseum {

    public static void start() {
        Main.clearScreen();
        Main.text("\nYou step through the portal into the Red Museum.");
        Main.text("The air is cool, a stark contrast to the blazing glow of the Red World outside.");
        Main.text("Tall walls stretch upward, lined with polished red stone and glass displays.");
        Main.pause();

        Main.text("Ahead, a giant spiral staircase winds toward the upper floors.");
        Main.text("But a line of shadowy guards blocks your path.");
        Main.text("Their faces are hidden, and their presence radiates an eerie authority.");
        Main.pause();

        Main.text("Raviolo steps forward, scanning the guards carefully.");
        Main.text("\"Looks like we'll need a little persuasion...\" he mutters.");
        Main.text("Only one of your powers will safely clear the path. Choose wisely:\n");
        Main.text("1. Blazing Encore - a wave of concentrated red energy");
        Main.text("2. Void Pulse - a pulsing shadow field");
        Main.text("3. Prism Lock - refracts light to trap or confuse enemies");
        Main.text("4. Thunder Lance - a bolt of focused electricity");
        Main.text("> ");

        String choice;

        do {
            choice = Input.scanner.nextLine().trim();

            if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                Main.text("The energy destabilises. Choose quickly!");
                Main.text("> ");
            }

        } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"));

        if (choice.equals("1")) {
            Main.clearScreen();
            Main.text("Raviolo fires a violent burst of crimson energy.");
            Main.text("Mo-e-ru!");
            Main.pause();

            Main.text("The blast hits the guards.");
            Main.pause();

            Main.text("The guards stagger, blinded by the brilliance, stumbling aside.");
            Main.text("You make your way past them unharmed.");

            Main.pause();
            museumUpperFloor();
        } else if (choice.equals("2")) {
            Main.clearScreen();
            Main.text("A pulsing shadow spreads outward from Raviolo.");
            Main.text("Pulsus Vacuus!");
            Main.pause();

            Main.text("The guards are sucked into a momentary void of darkness, disoriented and unable to act.");
            Main.text("You are about to slip by carefully, but something feels wrong... You can't feel it...");

            Main.deathPause();
        } else if (choice.equals("3")) {
            Main.clearScreen();
            Main.text("Raviolo focuses on the guards, bending the light around them.");
            Main.text("San-ryō-kyō!");
            Main.text("The blast strikes the guards.");
            Main.pause();

            Main.text("They are trapped in shifting beams, unable to move forward or back.");
            Main.text("The team attempts to pass, but the illusion overwhelms them!");

            Main.deathPause();
        } else if (choice.equals("4")) {
            Main.clearScreen();
            Main.text("A bolt of lightning erupts from Raviolo's hand.");
            Main.text("Nayzeh-ye Ra'd!");
            Main.pause();

            Main.text("The bolt arcs through the guards' line, stunning them violently.");
            Main.text("You are hit by a secondary arc!");

            Main.deathPause();
        }
    }

    public static void museumUpperFloor() {
        Main.clearScreen();
        Main.text("\nThe team climbs the massive spiral staircase.");
        Main.text("Step after step echoes through the hollow museum walls.");
        Main.pause();

        Main.text("At the top, the hallway opens into a wide gallery.");
        Main.text("The floor glistens strangely.");
        Main.pause();

        Main.text("Stella takes one step forward.");

        Main.text("SPLORCH.");

        Main.pause();

        Main.text("\"...\"");
        Main.text("\"...What was that.\"");
        Main.pause();

        Main.text("Stella slowly lifts her foot.");

        Main.text("A thick blob of clear slime stretches between the floor and her sandal.");
        Main.text("Long strands of saliva cling between the leather straps and her toes.");
        Main.pause();

        Main.text("Stella grimaces.");
        Main.text("\"Eugh.\"");
        Main.text("\"That feels horrible.\"");
        Main.text("\"It is cold... and sticky...\"");
        Main.pause();

        Main.text("She shakes her foot, but the slime stretches and snaps back into place.");
        Main.text("\"Why is it so stringy?!\"");
        Main.pause();

        Main.text("The saliva slowly seeps deeper between the straps of her sandal.");
        Main.text("It squishes between her toes.");
        Main.pause();

        Main.text("Stella shudders.");
        Main.text("\"That is disgusting.\"");
        Main.text("\"Please tell me this is not what I think it is.\"");
        Main.pause();

        Main.text("Diamond crouches down and studies the slime.");
        Main.text("\"It is saliva.\"");
        Main.pause();

        Main.text("Stella recoils.");
        Main.text("\"SALIVA?!\"");
        Main.pause();

        Main.text("Ai suddenly looks concerned.");
        Main.text("\"Wait.\"");
        Main.text("\"Something is wrong.\"");

        Main.text("Stella sways slightly.");
        Main.pause();

        Main.text("\"I feel... weird.\"");
        Main.text("\"Tired.\"");
        Main.pause();

        Main.text("Diamond crouches beside the slime.");

        Main.text("\"This isn't normal saliva.\"");
        Main.text("\"It drains energy.\"");
        Main.text("\"If it stays on too long it corrupts the victim.\"");
        Main.pause();

        Main.text("Then a sound echoes from deeper in the gallery.");

        Main.text("DRRRRIP.");
        Main.text("DRRRRROOOOOL.");
        Main.pause();

        Main.text("A massive shadow moves behind the pillars.");
        Main.pause();

        Main.text("A gigantic museum guard monster emerges.");

        Main.text("Thick saliva pours constantly from its mouth.");
        Main.text("The same saliva now coating Stella's sandal.");
        Main.pause();

        Main.text("Ai whispers:");
        Main.text("\"Magic is disabled in this room.\"");
        Main.text("\"Museum security field.\"");
        Main.pause();

        Main.text("The monster slowly crawls toward the team.");
        Main.text("Drool splattering across the floor.");
        Main.pause();

        Main.text("You must act quickly.");

        Main.text("\n1. Clean Stella's sandals first");
        Main.text("2. Fight the monster first");
        Main.text("> ");

        boolean decided = false;

        do {

            String choice = Input.scanner.nextLine().trim();

            if (choice.equals("1")) {
                cleanSandals();
                decided = true;
            }

            else if (choice.equals("2")) {
                fightMonster();
                decided = true;
            }

            else {
                Main.text("Invalid choice.");
                Main.text("> ");
            }

        } while (!decided);
    }

    public static void cleanSandals() {
        Main.clearScreen();
        Main.text("\nYou decide to clean the sandals first.");
        Main.text("The monster is still approaching.");
        Main.pause();

        Main.text("How will you clean the saliva?");

        Main.text("1. Plain water");
        Main.text("2. Baby wipes");
        Main.text("3. Use your hands");
        Main.text("> ");

        boolean solved = false;

        do {

            String choice = Input.scanner.nextLine().trim();

            if (choice.equals("1")) {
                Main.clearScreen();
                Main.text("\nYou pour water over the sandal.");

                Main.text("The slime absorbs it.");

                Main.text("The saliva becomes thicker.");
                Main.text("Stickier.");

                Main.text("It spreads across Stella's entire foot.");

                Main.text("The corruption spreads.");

                Main.deathPause();
                cleanSandals();
            }

            else if (choice.equals("2")) {
                Main.clearScreen();
                Main.text("\nYou pull out a pack of baby wipes.");

                Main.text("You scrub the sandal quickly.");

                Main.text("The wipe absorbs the slime immediately.");
                Main.text("The corruption stops spreading.");

                Main.text("Stella exhales in relief.");
                Main.pause();

                fightMonsterAlt(); // converge
                solved = true;
            }

            else if (choice.equals("3")) {
                Main.clearScreen();
                Main.text("\nYou try wiping the slime with your hands.");

                Main.text("The saliva sticks to your skin.");

                Main.text("Your energy drains instantly.");

                Main.text("The corruption spreads to you. GAME OVER.");

                Main.deathPause();
                cleanSandals();
            }

            else {
                Main.text("Invalid choice.");
                Main.text("> ");
            }
        } while (!solved);
    }

    public static void cleanSandalsAlt() {
        Main.text("You have successfully defeated the monster, but you still need to help Stella.");
        Main.text("\nYou pull out a pack of baby wipes.");

        Main.text("You scrub the sandal quickly.");

        Main.text("The wipe absorbs the slime immediately.");
        Main.text("The corruption stops spreading.");

        Main.text("Stella exhales in relief.");
    }

    public static void fightMonster() {

        Main.text("\nThe monster lunges forward.");
        Main.pause();

        Main.text("You ignore the anti-magic field.");
        Main.text("Raviolo prepares an attack.");

        Main.text("\n1. Blazing Encore");
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

        if (choice.equals("1")) {
            Main.text("\nRaviolo raises his hand.");

            Main.text("Mo-e-ru!");

            Main.pause();

            Main.text("A roaring spiral of crimson fire erupts forward.");
            Main.text("The monster screams.");

            Main.text("The drool evaporates instantly.");

            Main.text("The creature collapses into burning ash.");

            Main.pause();

            Main.text("The gallery falls silent.");

            cleanSandalsAlt();

        } else if (choice.equals("2")) {
            Main.clearScreen();
            Main.text("Raviolo compresses the energy into a dark sphere.");
            Main.text("Pulsus Vacuus!");
            Main.pause();

            Main.text("The sphere collapses inward, swallowing the light around it.");
            Main.text("A deep humming fills the gallery.");
            Main.pause();

            Main.text("The void pulse releases.");

            Main.text("Instead of striking the monster, the anti-magic field bends the attack.");
            Main.text("The energy folds back on itself.");

            Main.pause();

            Main.text("The sphere implodes violently.");

            Main.text("The floor cracks.");
            Main.text("Glass displays shatter.");
            Main.text("A shockwave rips through the staircase chamber.");

            Main.pause();

            Main.text("The monster remains untouched.");

            Main.text("The team is thrown into the collapsing gallery.");

            Main.deathPause();
            fightMonster();
        } else if (choice.equals("3")) {
            Main.clearScreen();
            Main.text("Raviolo focuses the energy into a prism of blinding light.");
            Main.text("San-ryō-kyō!");
            Main.pause();

            Main.text("A burst of refracted light explodes outward.");
            Main.text("A cage of shifting colours forms around the monster.");

            Main.pause();

            Main.text("The creature slams against the walls of light.");
            Main.text("Claws scrape across the glowing prison.");

            Main.pause();

            Main.text("Toad whispers, \"It is trapped...\"");

            Main.pause();

            Main.text("CRACK.");

            Main.text("A fracture spreads across the prism.");
            Main.pause();

            Main.text("The monster's saliva drips onto the light barrier.");

            Main.text("The corruption spreads through the prism like rot.");

            Main.pause();

            Main.text("The entire cage shatters.");

            Main.text("The creature lunges forward.");

            Main.deathPause();
            fightMonster();
        } else if (choice.equals("4")) {
            Main.clearScreen();
            Main.text("Raviolo raises his hand to the ceiling.");
            Main.text("A spear of lightning forms in the air.");

            Main.text("Nayzeh-ye Ra'd!");
            Main.pause();

            Main.text("The lightning lance crashes down onto the monster.");

            Main.pause();

            Main.text("The creature convulses.");

            Main.pause();

            Main.text("Then it stops.");

            Main.pause();

            Main.text("The electricity crawls across its body.");
            Main.text("Its veins glow bright white.");

            Main.pause();

            Main.text("The monster absorbs the lightning.");

            Main.text("Its eyes flare with blinding energy.");

            Main.pause();

            Main.text("The entire gallery shakes as the creature roars.");

            Main.text("You just made it stronger.");

            Main.deathPause();
            fightMonster();
        }
    }

    public static void fightMonsterAlt() {
        Main.text("\nThe monster lunges forward.");
        Main.pause();

        Main.text("You ignore the anti-magic field.");
        Main.text("Raviolo prepares an attack.");
        Main.text("Mo-e-ru!");

        Main.pause();

        Main.text("A roaring spiral of crimson fire erupts forward.");
        Main.text("The monster screams.");

        Main.text("The drool evaporates instantly.");

        Main.text("The creature collapses into burning ash.");

        Main.pause();

        Main.text("The gallery falls silent.");
        museumEnding();
    }

    public static void museumEnding() {

        Main.text("\nThe gallery slowly grows quiet.");
        Main.pause();
    
        Main.text("Ash drifts through the air where the monster once stood.");
        Main.text("The thick slime coating the floor begins to dry and crack.");
        Main.pause();
    
        Main.text("Stella carefully lifts her sandal and inspects it.");
        Main.text("\"Please tell me that thing is actually gone.\"");
        Main.pause();
    
        Main.text("Toad pokes the pile of ash with a stick.");
        Main.text("\"Yep. Definitely gone.\"");
        Main.pause();
    
        Main.text("Raviolo lowers his hand and exhales.");
        Main.text("\"That creature was guarding something.\"");
        Main.pause();
    
        Main.text("Diamond looks around the gallery.");
        Main.text("Rows of museum displays stretch along the walls.");
        Main.text("Ancient artifacts glow under dim red lighting.");
        Main.pause();
    
        Main.text("Ai suddenly points toward a display pedestal.");
        Main.text("\"There.\"");
        Main.pause();
    
        Main.text("A small folded note rests where an artifact should be.");
        Main.pause();
    
        Main.text("Raviolo walks over and carefully picks it up.");
        Main.pause();
    
        Main.text("The paper feels old.");
        Main.text("Too old to belong in this museum.");
        Main.pause();
    
        Main.text("He unfolds it.");
    
        Main.text("\n\"The rubies are not lost.\"");
        Main.text("\"They are simply waiting.\"");
        Main.text("\"Follow the trail if you wish to see them again.\"");
        Main.pause();
    
        Main.text("A strange symbol is written beneath the message: \">\".");
        Main.text("None of you recognise it.");
        Main.pause();
    
        Main.text("Toad scratches his head.");
        Main.text("\"So the thief wants us to follow them?\"");
        Main.pause();
    
        Main.text("Raviolo folds the note again.");
        Main.text("\"Looks like it.\"");
        Main.pause();
    
        Main.text("Stella sighs and wipes the last bits of slime from her sandal.");
        Main.text("\"Next time can the ruby hide somewhere normal?\"");
        Main.pause();
    
        Main.text("The team leaves the gallery and heads back toward the portal.");
    
        Main.text("\n=== END OF RED MUSEUM PATH ===");
        Main.pause();
    }
}