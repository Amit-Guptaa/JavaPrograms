import java.util.Scanner;

class circle {
    float radius, area;

    void setRadius(float r) {
        radius = r;
    }

    float getradius() {
        return (radius);
    }

    void setArea(float a) {
        area = a;
    }

    float getArea() {
        area = 3.14f * radius * radius;
        return (area);

    }

}

public class circleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle a1 = new circle();
        System.out.println("enter the radius:");
        a1.setRadius(sc.nextFloat());
        System.out
                .println("area of circle whose radius is " + a1.getradius() + " will be calculated to " + a1.getArea());
        sc.close();
    }
}
