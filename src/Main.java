public class Main {
    public static void main(String[] args) {

        int TicketPrice = 14356;
        int RublesFor1Mile= 20;


        int BonusMiles = TicketPrice / RublesFor1Mile;

        System.out.println("Количество начисленных миль: " + BonusMiles);
    }
}
