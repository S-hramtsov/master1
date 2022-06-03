package task.number1.finances;

public class Finances {
    public static int calcPayment(int start, int amount, int years) {
        return (amount - start) / years;
    }
}