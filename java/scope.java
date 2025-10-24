public class scope {
    public static void main(String[] args) {
        int X;
        X=10;
        if (X==10){
         int   Y=20;
            System.out.println("x and y :" +X + " " + Y);
            X=Y*2;
        }
        System.out.println(" x is :"+X);
    }
}
