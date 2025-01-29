public class Main {
    public static void main(String[] args) {
        //Баланс
        int balance = 100;
        //Сумма пополнения
        int refill = 1100;
        //Сумма бонусов
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс:" + (balance + refill + bonus));
    }
}