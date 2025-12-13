import java.util.*;
public class MaxMethod {
    public static int findMax(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
         return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements :");
        int [] array = new int [n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int maxNum;
        maxNum=findMax(array);
        System.out.println("the max number from the list is: "+maxNum);
        sc.close();
    }
}
