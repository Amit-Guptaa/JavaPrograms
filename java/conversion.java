public class conversion {
    // Demonstrating conversion and type casting to incompatible data types
    public static void main(String[] args) {
        int i = 250;
        byte b = 10;
        double d = 359.567;
        System.out.println("conversion of int to byte.");
        b = (byte) i;
        System.out.println(" i and b :" + i + " " + b);
        System.out.println(" conversion of double to int.");
        i = (int) d;
        System.out.println(" d and i : " + d + " " + i);
        System.out.println("conversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b :" + d + " " + b);
    }

}
