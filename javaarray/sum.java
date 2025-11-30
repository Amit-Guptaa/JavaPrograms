import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;
        System.out.println("enter the elements' no.: ");
        n=sc.nextInt();
        int [] arr2 = new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<arr2.length;i++){
              arr2[i]=sc.nextInt();
              sum+=arr2[i];

        }
        System.out.println("sum of the numbers in the array: "+sum);
        sc.close();
    }
    
}
