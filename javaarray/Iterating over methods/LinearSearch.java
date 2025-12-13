import java.util.*;
public class LinearSearch {
    public static void search(int [] array,int target){
        boolean found=false;
        for(int i =0; i<array.length;i++){
            if(array[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("found!");
        }
        else{
            System.out.println("Not Found!");
        }
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the no. of elements:");
      int n= sc.nextInt();
      System.out.println("enter elements:");
      int [] arr= new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("specify the target or choose any number to check if it is in the list or not.:");
      int target=sc.nextInt();
      search(arr,target);
      sc.close();  

    }
}
