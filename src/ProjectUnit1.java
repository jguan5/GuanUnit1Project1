import java.util.Scanner;
public class ProjectUnit1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the price(no tip): ");
        double totalPrice = scan.nextDouble();
        System.out.print("What percent tip?: ");
        double tip = scan.nextDouble();
        double tipPercent = tip / 100;
        System.out.print("How many people are in your group?: ");
        int amountPeople = scan.nextInt();
        double totalTip = (totalPrice * tipPercent);
        double totalTipRounded = Math.round(totalTip*100.0)/100.0;
        double totalBill = totalTip + totalPrice;
        double totalBillRounded = Math.round(totalBill*100.0)/100.0;
        double tipShared = totalTip / amountPeople;
        double tipSharedRounded = Math.round(tipShared*100.0)/100.0;
        double billShared = totalBill / amountPeople;
        double billSharedRounded = Math.round(billShared*100.0)/100.0;

        System.out.println("Your tip: " + totalTipRounded);
        System.out.println("Tip when shared: " + tipSharedRounded);
        System.out.println("Your total bill: " + totalBillRounded);
        System.out.println("Your shared bill: " + billSharedRounded);
    }
}
