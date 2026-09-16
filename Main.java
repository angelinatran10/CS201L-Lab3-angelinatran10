/*
 * name: your name
 * date: your date
 * program: lab 3 - games part 2
 *
 * llm prompt used:
 * "help me update my java games assignment while keeping
 * my original code and comments, and follow the assignment
 * requirements for craps, scraps, and rock paper scissors."
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nWELCOME TO YOUR GAMES!!");
        Scanner scanInput = new Scanner(System.in);
        char choice;
        choice = menu(scanInput);
        
        while (choice != 'Q'){
            //test for choice type and call appropriate Game
            if (choice == 'L')
                Games.lotteryGame(scanInput);

            else if (choice == 'C')
                Games.playCraps(scanInput);

            else if (choice == 'S')
                Games.playScraps(scanInput);

            else if (choice == 'R')
                Games.playRockPaperScissors(scanInput);

            //ask to play again? Show menu & get choice
            choice = menu(scanInput);
        }

        scanInput.close();

    }

    public static char menu(Scanner scanInput){
        char choice = ' ';
        String inputString;

        //menu loop
        while (choice != 'L' && choice != 'C' &&
               choice != 'S' && choice != 'R' &&
               choice != 'Q') {

            //   print menu
            System.out.println("\nL - Lottery");
            System.out.println("C - Craps");
            System.out.println("S - Scraps");
            System.out.println("R - Rock, Paper, Scissors");
            System.out.println("Q - Quit");
        
            //   prompt user, get response & convert to upper case
            System.out.print("What choice do you prefer: ");
            inputString = scanInput.nextLine();

            if (inputString.length() > 0) {
                choice = inputString.toUpperCase().charAt(0);
            }

            //   verify that the choice is L, C or Q 
            if (choice != 'L' && choice != 'C' &&
                choice != 'S' && choice != 'R' &&
                choice != 'Q') {

                System.out.println("Invalid choice. Please try again.");
            }
        }
 
        return choice;
    }
}
