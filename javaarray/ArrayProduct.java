import java.util.Scanner;
public class ArrayProduct {
    public static int prod(int []arr1){
        int product=1;
        for(int i=0;i<arr1.length;i++){
            product*=arr1[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textArr1;
        System.out.println("enter the elements of array 1: ");
        textArr1=sc.nextLine();
        String[] array1= textArr1.split(",");
        int[ ] arr1= new int[array1.length];
        for(int i=0;i<array1.length;i++){
          arr1[i] = Integer.parseInt(array1[i]);

        }
        int result;
        result=prod(arr1);
        System.out.println("product of these array elements: "+result);

        sc.close();
    }
}
