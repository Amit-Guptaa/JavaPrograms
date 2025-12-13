import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array list");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the reversed array list is:");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+"  ");
        }
        sc.close();
    }
}
