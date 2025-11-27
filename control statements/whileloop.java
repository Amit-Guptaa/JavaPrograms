import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        double yearlyDeposit;
        double interestRate;
        double targetAmount;
        int years=0;
        System.out.print("Enter the initial balance :");
        balance=sc.nextDouble();
        System.out.print("AMount to be deposited yearly to the balance :");
        yearlyDeposit=sc.nextDouble();
        System.out.print("Enter the interest rate :");
        interestRate=sc.nextDouble();
        System.out.print("Enter the target amount :");
        targetAmount=sc.nextDouble();
        while (balance<targetAmount) {
            balance+=yearlyDeposit;
            balance+=balance*interestRate;
            years ++;
            System.out.printf("Year %d: ₹%.2f\n",years,balance);
        
        }
        System.out.println("________________________");
        System.out.println("To reach the targetamount it take "+years+ " years.");
        System.out.println("The final balance is :");
        System.out.printf("₹%.2f",balance);

        sc.close();
    }
}
