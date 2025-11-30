import java.util.Scanner;

public class ArrayProduct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        int product=1;
        System.out.println("enter the  number of elements of arrray: ");
        n=sc.nextInt();
         int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            product*=arr[i];
        }
        System.out.println("product: "+product);
        sc.close();
    }
}
