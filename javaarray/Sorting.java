import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of an array.");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of array.");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The sorted array list is :");
        for(int num:arr){
            System.out.println(num);
        }
        sc.close();
    }
}
