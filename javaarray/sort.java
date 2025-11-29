import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length,arr2.length);
        Arrays.sort(result);
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textArr1;
        String textArr2;
        System.out.println("enter the text of array 1: ");
        textArr1=sc.nextLine();
        System.out.println("enter the text of array2: ");
        textArr2=sc.nextLine();
        String[] arr1= textArr1.split(",");
        String [] arr2 = textArr2.split(",");
        String [] mergedArray= merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray)+"");
        sc.close();
    }

}
