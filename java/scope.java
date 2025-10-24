public class scope {
    public static void main(String[] args) {
        int X;
        X = 10;
        if (X == 10) {
            int Y = 20;
            System.out.println("x and y :" + X + " " + Y);
            X = Y * 2;
        }
        System.out.println(" x is :" + X);
        for (X = 0; X < 4; X++) {
            int y = -1;
            System.out.println("y is :" + y);
            y = 100;
            System.out.println(" y is now :" + y);
        }
    }
}
