import java.util.Scanner;

class NegativeValueException extends Exception{
    NegativeValueException(String Message){
        super(Message);
    }
}
public class NegativeValueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        try{
            if(num<0){
                throw new NegativeValueException("Negative valu!e is not allowed!");

            }
        
        System.out.println("the num entered is "+num);
        }
        catch(NegativeValueException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
