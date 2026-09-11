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

            //ask to play again? Show menu & get choice
            choice = 'Q';
        }

        scanInput.close();

    }

    public static char menu(Scanner scanInput){
        char choice = 'Q';
        String inputString;

        //menu loop
        //   print menu
        
        //   prompt user, get response & convert to upper case
        System.out.print("What choice do you prefer: ");
        inputString = scanInput.nextLine();
        choice = inputString.toUpperCase().charAt(0);

        //   verify that the choice is L, C or Q 
 
        return choice;
    }
}

