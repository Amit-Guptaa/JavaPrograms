import java.util.Scanner;

public class Array3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the depth of the array and rows and columns of each depth :");
        int depth=sc.nextInt();
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int array3D[][][]= new int [depth][rows][cols];
        for(int d=0; d<depth;d++){
            for(int r=0; r<rows;r++){
                for(int c=0; c<cols; c++){
                    array3D[d][r][c]=(d+1)*(r+1)*(c+1);
                }
            }
        }
        // print array
        for(int d=0; d<depth; d++){
            System.out.println("depth "+d+ ":");
            for(int r=0;r<rows; r++){
                for(int c=0;c<cols;c++){
                    System.out.print(array3D[d][r][c]+ " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
