package task;

import task.number1.finances.Finances;

public class Number1 {

    public static void main(String[] args) {
        int payment = Finances.calcPayment(100000, 350000, 36);
        System.out.println("Ежемесячный платеж составит " + payment + "р");
    }
}
