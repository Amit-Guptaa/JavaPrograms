import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.print("Enter the number :");
        n=sc.nextInt();
        System.out.println("The multiplication table of "+n+ " is____");
        for(int i=1;i<=10;i++){
            int product=n*i;
            sum=sum+product;
            System.out.println(n+ " x "+i+ " = " +product);
        }
System.out.println("_________________________!");
System.out.println("The sum of the all the values as a result : "+sum);

        sc.close();
    }
}
