
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int x= sc.nextInt();
        System.out.println("enter the elements of the array :");
        int [] arr= new int [x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

            }
        }
     System.out.println("the (Bubble) sorted array list is :)");
        for(int num: arr){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
