import java.util.Scanner;
import java.util.InputMismatchException;

public class Cave {

    public static void main( String[] args ){
        Scanner keyboard = new Scanner(System.in);

        String Go = "";
        String group = "";
        String lone = "";

        System.out.println(" Welcome to the Goblin Cave");
        System.out.println("  ");
        System.out.println(" The stench of putrid fumes surround you as you step into a dark humid cave." +
                "\n You see two points of interest on each side of this cave. On one" +
                "\n side of the cave a group of goblins are seen hovering over a device." +
                "\n On the other side you see a lone figure having spasms and screaming." +
                "\n This scene greats you, but you came with a mission. You must retrieve" +
                "\n the shining artifact that belongs to you. You cannot function without it" +
                "\n Choose to: \n\r 1: Approach the group" +
                "\n\r 2: Approach the lone figure");
        System.out.print("> ");
        try {
            Go = keyboard.next();
        } catch (Exception e) {
            System.out.println("Enter 1 or 2!");
                   keyboard.next();
        }

        if (Go.equals("1")) {
            System.out.println(" You approach the group and notice the smell getting worse... " +
                    "\n The fumes start making you hallucinate..." +
                    "\n You see a bright light ahead of you." +
                    "\n you hear voices, but can't make out what they are saying." +
                    "\n What do you do?" +
                    "\n Choose to: \n\r 1: Get closer \n\r 2: Go back to the beginning ");
            System.out.print(">  ");
            try {
                group = keyboard.next();
            } catch (Exception e) {
                System.out.println("Enter 1 or 2!");
                keyboard.next();
            }

            if (group.equals("1")) {
                System.out.println(" The voices get clearer... \n You hear 'WHAT ARE YOU DOING DPS'. " +
                        "'HEALER, WHERE ARE MY HEALS'" +
                        "\n Turns out, the smelly goblins were just World of Warcraft players." +
                        "\n You join them in their dungeon they were running and lose track of time." +
                        "\n As the days pass you realize you forgot to eat food and die." +
                        "\n YOU DIED!");

            } else if (group.equals("2")) {
                System.out.println(" As you try to turn you feel weak..." +
                        "\n The smell slowly seeps into your body. You fall" +
                        "\n onto your knees and slowly lay down. As your consciousness fades and your face " +
                        "\n lies on the cold ground, you hear growls of happiness from the figures " +
                        "\n as if they have just achieved something." +
                        "\n YOU DIED!"); }
            else {
                System.out.println("Invalid Entry Detected.");
                System.exit(0);
            }


        }
        else if (Go.equals("2")) {
            System.out.println(" You approach the lone figure and notice the smell getting better..." +
                    "\n as the stench leaves your nose, the screaming is getting louder" +
                    "\n the sounds are becoming so loud that the space around the figure starts to distort." +
                    "\n You notice the figure playing League of Legends as it's rage rips apart the air around it" +
                    "\n You see the artifact you came for on the desk of the figure." +
                    "\n Choose to: \n\r 1: Go for the artifact \n\r 2: Leave");
            System.out.print(">  ");
            try {
                lone = keyboard.next();
            } catch (Exception e) {
                System.out.println("Enter 1 or 2!");
                keyboard.next();
            }

            if (lone.equals("1")) {
                System.out.println(" You go for the artifact..." +
                        "\n As the very space gets ripped apart from the decibels, you grab the artifact." +
                        "\n It shines as a sense of accomplishment shoots through your body. You've done it. " +
                        "\n The protective glow of the artifact shields your body from the tears in space." +
                        "\n You stroll out of the cave and think to yourself..." +
                        "\n 'Finally, I can charge my phone'. \n VICTORY!!! ");

            } else if (lone.equals("2")) {
                System.out.println(" You turn to leave..." +
                        "\n As you turn to leave a tear in space appears in front of you." +
                        "\n You can't stop your momentum and fall into the portal generated. " +
                        "\n Time passes.." +
                        "\n You wake up after hearing sounds near you. You realize you are in " +
                        "\n a forest. Small figures approach you and start poking you with a stick" +
                        "\n You do not understand what they are saying, but you can tell that they are goblins." +
                        "\n They take you back to their tribe and you slowly integrate into their society..." +
                        "\n You become Goblin King and rule over them for seven years until you fall onto a stick and die." +
                        "\n YOU DIED!"); }
            else {
                System.out.println("Invalid Entry Detected.");
                System.exit(0);
            }

        } else {
            System.out.println("Invalid Entry Detected.");
            System.exit(0);
        }
    }
}

