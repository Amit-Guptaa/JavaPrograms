import java.util.*;
public class Average {
    public static double Avg(int[] arr){
        double sum=0;
        for(int num: arr){
            sum+=num;
        }
        double Average=sum/arr.length;
        return Average;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
            int [] array= new int[n];
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
        double result;
        result=Avg(array);
        System.out.println("Average : "+result);
        sc.close();
    }
}
