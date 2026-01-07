import java.util.Scanner;
public class arsteristic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Eneter the no. of * be in the last row: ");
        n=sc.nextInt();
        int rows=(n/2)+1;
        for(int i=0;i<rows;i++){
            String stars= new String(new char[2*(i+1)-1]).replace("\0", "*");
            System.out.println(stars);
        }
        sc.close();
    }
    
}
