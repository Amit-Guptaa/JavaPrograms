class circle{
    float radius,area;
    void setRadius(float r){
        radius=r;
    }
    float getradius(){
        return(radius);
    }
    void setArea(float a){
        area=a;
    }
    float getArea(){
        area=3.14f*radius*radius;
        return(area);
        
    }

}

public class circleArea {
    public static void main(String[] args) {
        circle a1 = new circle();
        a1.setRadius(100);
        System.out.println("area of circle whose radius is " +a1.getradius()+ " will be calculated to "+a1.getArea());
    }
}
