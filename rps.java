import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Välj sten, sax eller påse.");
        String player = scan.nextLine();

        Random random = new Random();
        int ai = random.nextInt(3);

        String aii;
        if (ai == 0) {
            aii = "sten";
        } else if (ai == 1) {
            aii = "sax";
        } else {
            aii = "påse";
        }
        System.out.println("AI valde " + aii);

        if (player == aii) {
            System.out.println("Oavgjort");
        } else {
                switch (player) {
                    case "sten":
                        if (aii == "sax")
                            System.out.println("Player vinner");
                        else
                            System.out.println("AI vinner");
                        break;
                    case "sax":
                        if (aii == "påse")
                            System.out.println("Player vinner");
                        else
                            System.out.println("AI vinner");
                        break;
                    case "påse":
                        if (aii == "sten")
                            System.out.println("Player vinner");
                        else
                            System.out.println("AI vinner");
                        break;

                }
            }


            }

        }