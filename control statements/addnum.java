import java.util.Scanner;
public class addnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println ("number is :");
        count=sc.nextInt();
        int sum=0;
        for(int i=0;i<count;i++){
            int result;
            result=sc.nextInt();
            sum=sum+result;
        }
System.out.println(sum);
        sc.close();
    }
}
