import java.util.Calendar;

public class Calculation extends BuyMenu {

    public static int varone;
    public static int input;
    public static String purchase;
    private static int int_varone;
    private static int amount;
    private static int total_final;

    //getters, for Encapsulation
    public int get_varOne() {
        return int_varone;
    }
    public int get_amount() {
        return amount;
    }
    public int get_totalFinal() {
        return total_final;
    }

    //setters, for Encapsulation
    @SuppressWarnings("static-access")
    public void set_varOne(int int_varone) {
        this.int_varone = varone;
    }
    @SuppressWarnings("static-access")
    public void set_amount(int amount) {
        this.amount = input;
    }
    @SuppressWarnings("static-access")
    public void set_totalFinal(int total_final) {
        this.total_final = 0;
    }

    public static void calc_amountPrice() {

        Calculation encap = new Calculation();

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        if (day == Calendar.WEDNESDAY) {

            //System.out.println("var_one=" + calculation.int_varone + "\namount =" + calculation.amount);
            System.out.println("\nIt's WOWzer Wednesday! You will receive £2 discount off every ticket you purchase.\n");
            total_final += ((encap.get_varOne() - 2) * encap.get_amount());
        } else {
            System.out.println("\nCome back for our WOWzer Wednesdays and receive a \n£2 discount off every ticket you purchase.\n");
            total_final += encap.get_varOne() * encap.get_amount();
        }
    }


}