import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,o;
        System.out.println("enter the number of elements of arr1:");
        m=sc.nextInt();
        System.out.println("enter the no. of elem. of arr2: ");
        n=sc.nextInt();
        System.out.println("enter the no. of elem. of arr3: ");
        o=sc.nextInt();
        System.out.println("enter the elem. of arr1: ");
        int [] arr1=new int[m];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter elem. of arr2: ");
        int[] arr2= new int[n];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("enter the elm. of arr3: ");
        int[] arr3 =new int [o];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        int[] newArray;
        newArray=Arrays.copyOf(arr1, 5);
        System.out.println(Arrays.toString(newArray));
        sc.close();
    }
}
