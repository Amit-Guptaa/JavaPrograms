import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isPrime=true;
        System.out.println("Enter the which you want to check either it is prime number or not: ");
        number = sc.nextInt();
        System.out.println("checking if "+number+ " is prime!");
        for(int divisor =2;divisor<=number/2;divisor++){
            System.out.println("Checking divisor: "+divisor);
            if(number%2==0){
                isPrime=false;
                System.out.println("Found divisor: "+divisor);
                break;
            }

        }
        System.out.println(number+" is " + (isPrime?"prime!":"not prime!"));
        sc.close();
    }
    
}
