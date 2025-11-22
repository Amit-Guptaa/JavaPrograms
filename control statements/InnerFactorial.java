class Factorial{
    int n;
    int fact;
    void setN(int num){
        n=num;
    }
    void setFact(int facto){
        fact=facto;
    }
    int getN(){
        return n;
    }
    int getFact(){
        int i;
        fact=1;
        for(i=1;i<=n;i++){
                  fact=fact*i;
        }
        return fact;
    }
}
public class InnerFactorial {
    public static void main(String[] args) {
        Factorial f1= new Factorial();
        f1.setN(5 );
System.out.println("factorial of "+f1.getN()+ " is "+f1.getFact());
    }  
}