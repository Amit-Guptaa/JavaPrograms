public class ForEach {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        int sums=0;
        for (int x : nums) {
            System.out.println("value is: " + x);
            sum += x;
        }
        System.out.println("================");
        System.out.println("summation: " + sum);
        System.out.println("================");

        for (int y : nums) {
            System.out.println("value is: " + y);
            sums += y;
            if (y == 5) {
                break;
            }
        }
        System.out.println("================"); 
        System.out.println("Sum of the first five natural number is: ");

        System.out.println("summation: " + sums);
        System.out.println("================");

    }
}
