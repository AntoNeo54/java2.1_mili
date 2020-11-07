public class Main {
    public static void main(String[] args) {
        int ticket_price = 10_8999;
        int bonus_rub = 20;
        int miles = (int) (ticket_price / 100) / bonus_rub;
        System.out.println(miles);
    }
}
