import java.util.Scanner;

class CreateJaggedArray{
    public static int [][] jaggedArray(int n){
        int array[][]= new int [n][];
        for(int i=0; i<array.length;i++){
            array[i]= new int [i+1];
            for( int j=0; j<array[i].length;j++){
                array[i][j]= (i+1)*(j+1);
            }
        }
        return array;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n= sc.nextInt();
        int result[][] = jaggedArray(n);
        for(int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}