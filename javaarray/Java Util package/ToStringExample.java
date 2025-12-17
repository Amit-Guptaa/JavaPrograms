import java.util.Arrays;
import java.util.Scanner;

public class ToStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of elements:");
        int n=sc.nextInt();
        System.out.println("elements are:");
        int [] array = new int [n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        sc.close();
    }
    
}
