import java.util.Scanner;
public class findPrime {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime;
        System.out.println("enter the num to check if it is prime or not:");
        num=sc.nextInt();
        if(num<=2){
            isPrime=false;

        }
        else{
            isPrime=true;
        }
        for(int i=2;i<num/i;i++){
            if(num%2==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("prime!");
        }
        else{
            System.out.println("not prime!");
        }
        sc.close();
    }
}
