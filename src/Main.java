public class Main {
    public static void main(String[] args) {
        int amount = 11234; // стоимоть билета
        int rpm = 20; // рублей для одной бонусной мили

        int bonus = amount / rpm; //вычисление бонусов для начисления

        System.out.println("Вам начислено бонусов: " + (bonus));
    }
}