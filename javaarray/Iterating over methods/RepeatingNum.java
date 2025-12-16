import java.util.*;

public class RepeatingNum {
    public static int repeat(int[] arr,int target){
        boolean found=false;
        int countTarget=0;
        for(int numbers: arr){
            if(target==numbers){
                found =true;
                countTarget++;
            
            }
        }
        if(found){
            System.out.println("found!");
        }
        else{
            System.out.println("target is not in the list!");
        }
       return countTarget;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("chhose the target from the list:");
        int favTarget=sc.nextInt();
        int result;
        result=repeat(array, favTarget);
        System.out.println("the no. of times "+favTarget+" is repeating: "+result);
        sc.close();
    }
}
