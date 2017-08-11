/**
 * Created by Administrator on 08/08/2017.
 */
import java.util.Scanner;

public class StartMenu {


    public static void Menu() {

        Calculation encap = new Calculation();
        encap.set_amount(0);
        encap.set_varOne(0);
        encap.set_totalFinal(0);

        Scanner in = new Scanner(System.in);

        //Get user's choice
        String initial;

        // Display the menu

        System.out.println("1\t Purchase Tickets\n2\t Exit");
        System.out.println("\nPlease enter your choice:");
        initial = in.next();


        switch(initial) {
            case "1":
                System.out.println("\nChoose the tickets you would like to purchase.");
                BuyMenu.Menu();
                in.close();
                break;
            case "2":
                System.err.println("\nExiting the system.");
                in.close();
                System.exit(0);
                break;
            default:
                System.err.println("\nInvalid choice, please try again.");
                StartMenu.Menu();
                break;
        }
    }

    public static void main(String [] args){

        //Available Ticket Types
        System.out.println("Welcome to the QA Cinema online prototype ticket office.");
        System.out.println("Please note QA Cinemas also offers a discount each Wednesday");
        System.out.println("where every ticket is discounted by £2.00");
        System.out.println("");

        StartMenu.Menu();

    }//end of switch
    //end of the main method
}

//end of class
