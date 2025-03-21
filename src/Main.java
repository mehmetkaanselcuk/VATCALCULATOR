import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount, amountincvat, vatamount;
        System.out.print("Enter the amount: ");
        amount = sc.nextDouble();
        double rate = (amount>0 && amount<=1000 ) ? 0.8 : 0.18;
        vatamount = amount * rate;
        amountincvat = amount + vatamount;
        System.out.println("Amount Excluding VAT :" + amount);
        System.out.println("VAT rate : " + rate);
        System.out.println("VAT amount : " + vatamount);
        System.out.println("Amount Included VAT :" + amountincvat);

    }
}