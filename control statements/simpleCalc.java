import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;
        float sum;
        float diff;
        float product;
        float divide;
        float modulus;
        char operator;
        System.out.print(" enter fisrt num :");
        num1 = scanner.nextInt();
        System.out.print(" enter the second number :");
        num2 = scanner.nextInt();
        System.out.println("select the arithmetic operation you want to do .");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                sum = num1 + num2;
                System.out.println("sum =" + sum);
                break;
            case '-':
                diff = num1 - num2;
                System.out.println("diff =" + diff);
                break;
            case '*':
                product = num1 * num2;
                System.out.println("product =" + product);
                break;
            case '/':
                divide = num1 / num2;
                System.out.println("divide =" + divide);
                break;
            case '%':
                modulus = num1 % num2;
                System.out.println("modulus =" + modulus);
                break;
            default:
                System.out.println("Invalid Operator.");

        }
        scanner.close();

    }

}
