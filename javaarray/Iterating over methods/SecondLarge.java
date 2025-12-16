import java.util.Scanner;

public class SecondLarge {
    public static int number(int[] arr){
        int minimum=arr[0];
        for(int num: arr){
            if(num<minimum){
                minimum=num;
            }
            if(num>minimum){

                minimum=num;
                break;
    
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] array= new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int result;
        result=number(array);
        System.out.println(result);
        sc.close();
    }
}
