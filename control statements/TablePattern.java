import java.util.Scanner;
public class TablePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Enter the number to print table upto: ");
    number=sc.nextInt();
    System.out.print("  ");
    for(int i=1;i<=number;i++){
        System.out.print(i+"  ");

    }
    System.out.println();
    int row;
    int col;
    for(row=1; row<=number; row++){
      System.out.print(row+ " ");
           for(col=1; col<=number; col++){
            int product = row*col;
            if(product<10){
              System.out.print(product+ "  ");
            }
            else{
              System.out.print(product+ " ");
            }

           }
           System.out.println();
    }
    
    
    sc.close();
  }  
}
