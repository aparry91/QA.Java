    import java.util.Scanner;


    public class BuyMenu extends StartMenu implements References {

        private static String forgot;
        private static String more;

        public static void Menu() {

            Scanner buy = new Scanner(System.in);
            Calculation encap = new Calculation();


            // Display the menu
            System.out.println("->\tStandard\t\t£" + References.standard + ".00\n->\tOAP\t\t\t\t£" + References.oap + ".00\n->\tStudent\t\t\t£" + References.student + ".00\n->\tChild\t\t\t£" + References.child + ".00\n->\tCheckout\t\t>>>>>");
            System.out.println("\nPlease enter your choice:");
            Calculation.purchase = buy.next().toLowerCase();

            switch (Calculation.purchase) {
                case "standard":
                    encap.set_varOne(Calculation.varone = References.standard);
                    //System.out.println("is : " + int_varone + "and, " + references.standard);
                    BuyMenu.choose_amount();
                    buy.close();
                    break;
                case "oap":
                    encap.set_varOne(Calculation.varone = References.oap);
                    //System.out.println("is : " + calculation.int_varone + "and, " + references.oap);
                    BuyMenu.choose_amount();
                    buy.close();
                    break;
                case "student":
                    encap.set_varOne(Calculation.varone = References.student);
                    //System.out.println("is : " + calculation.int_varone + "and, " + references.student);
                    BuyMenu.choose_amount();
                    buy.close();
                    break;
                case "child":
                    encap.set_varOne(Calculation.varone = References.child);
                    //System.out.println("is : " + calculation.int_varone + "and, " + references.child);
                    BuyMenu.choose_amount();
                    buy.close();
                    break;
                case "checkout":
                    if (encap.get_totalFinal() == 0) {
                        BuyMenu.forgotOrder();
                    } else {
                        System.out.println("The final price of your tickets is: £" + encap.get_totalFinal() + ".00");
                        System.out.println("Please pay at the checkout. Thank you for your custom.\n\n\n");
                        //encap.set_totalFinal(0);
                        encap.set_amount(0);
                        encap.set_varOne(0);
                        StartMenu.main(null);
                    }
                    buy.close();
                    break;
                default:
                    System.err.println("\nInvalid choice, please try again.");
                    BuyMenu.Menu();
                    buy.close();
            }
        }


        private static void choose_amount() {
            Calculation encap = new Calculation();

            Calculation.input = 0;
            encap.set_amount(0);
            System.out.println("Please enter the amount of " + Calculation.purchase + " tickets that you would like to purchase.");
            Scanner scanner2 = new Scanner(System.in);

            if(scanner2.hasNextInt())
            {
                Calculation.input = scanner2.nextInt();
                if(Calculation.input > 0)
                {
                    encap.set_amount(Calculation.input);
                }
            }
            else
            {
                BuyMenu.Menu();
                scanner2.close();
            }
            if(encap.get_amount() > 0){
                BuyMenu.buyMore();
                scanner2.close();
            }
            else
            {
                encap.set_amount(0);
                BuyMenu.Menu();
                scanner2.close();
            }
        }


        private static void buyMore() {

            Calculation encap = new Calculation();

            System.out.println("Buy more? yes/no");
            Scanner scanner3 = new Scanner(System.in);
            more = scanner3.next().toLowerCase();
            switch (more) {

                case "yes":
                    Calculation.calc_amountPrice();
                    System.out.println("The total price of your tickets so far is: £" + encap.get_totalFinal() + ".00\n");
                    BuyMenu.Menu();
                    scanner3.close();
                    break;
                case "no":
                    Calculation.calc_amountPrice();
                    System.out.println("\n\nThe final price of your tickets is: £" + encap.get_totalFinal() + ".00");
                    System.out.println("Please pay at the checkout. Thank you for your custom.\n\n\n");
                    StartMenu.main(null);
                    scanner3.close();
                    break;
                default:
                    BuyMenu.buyMore();
                    break;
            }

        }

        private static void forgotOrder() {

            System.err.print("Did you forget to order your tickets? yes/no\n");
            Scanner scanner4 = new Scanner(System.in);
            forgot = scanner4.next().toLowerCase();
            switch (forgot) {

                case "yes":
                    System.out.println("Returning to ticket selection menu.\n");
                    BuyMenu.Menu();
                    scanner4.close();
                    break;
                case "no":
                    System.err.print("Exiting system.");
                    scanner4.close();
                    System.exit(0);
                    break;
                default:
                    BuyMenu.forgotOrder();
                    break;
            }
        }

    }

