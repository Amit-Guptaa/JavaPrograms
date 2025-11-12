import java.util.Scanner;

public class sampleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;
        System.out.println("enter the value for n :");
        n = scanner.nextInt();

        for(i=1;i<n;i++){
            switch(i){
                case 1:
                System.out.println("i is 0 now");
                break;
                case 2:
                System.out.println("i is 1 now");
                break;
                case 3:
                System.out.println("i is 2 now");
                break;
                default:
                System.out.println("i is gtreater than 3.");
                
            }


        }
        
        scanner.close();
    }
}
