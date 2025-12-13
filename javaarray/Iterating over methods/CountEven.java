import java.util.*;
public class CountEven {
    public static int count(int[] arr1){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elemnents :");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int evenCount;
        evenCount=count(array);
        System.out.println("the no. of even number in the list is: "+evenCount);
        sc.close();
    }
}
