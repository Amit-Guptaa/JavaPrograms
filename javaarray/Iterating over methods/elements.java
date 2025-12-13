import java.util.*;
public class elements {
    public static int sum(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of elements:");
    int n=sc.nextInt();
    System.out.println("enter the numbers of array to summation :");
    int [] arr= new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int result;
    result=sum(arr);
    System.out.println("the sum of these element is : "+result);
    sc.close();
   } 
}
