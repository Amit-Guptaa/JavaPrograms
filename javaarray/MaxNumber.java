import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the no. of elements in array:");
        n=sc.nextInt();
        int [] arr1 = new int[n];
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int num: arr1){
            if(num>max){
                max=num;
            }
        }
        System.out.println("max number is "+max);
        sc.close();
        
    }
}
