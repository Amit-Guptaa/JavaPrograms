import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements of a java: ");
        n=sc.nextInt();
        int [] array=new int[n];
        int target;
        System.out.println("Choose a target from the list.");
        target=sc.nextInt();
        boolean targetFound=false;
        System.out.println("enter the elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            if(array[i]==target){
                targetFound=true;
                break;
            }
        }
        if(targetFound){
            System.out.println("target is specied in the array list.");
        }
        else{
            System.out.println("Not Found!");
        }

        sc.close();
    }
}
