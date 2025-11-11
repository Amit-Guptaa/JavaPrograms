class student {
    int rollNo;
    double Percent;
    String Name;

    void setrollNo(int rn){
        rollNo=rn;
    }
    void setPercent(double pr){
        Percent=pr;
    }
    void setName(String nm){
        Name=nm;
    }
    int getrollNo(){
        return(rollNo);
    }
    double getPercent(){
        return(Percent);
    }
    String getName(){
        return(Name);
    }


}
public class firstclass {
    public static void main(String[] args) {
        student s1= new student();
        s1.setrollNo(101);
        s1.setPercent(89.6);
        s1.setName("Amit Gupta");

        System.out.println("rollNo : "+s1.getrollNo());
        System.out.println("Percent :"+s1.getPercent());
        System.out.println("Name :"+s1.getName());
    }
}
