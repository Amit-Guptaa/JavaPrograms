public class MyThread extends Thread {
    public void run (){
        try{
            System.out.println("Thread is running");
            Thread.sleep(1000);
            System.out.println("Thread resumed");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
        public static void main(String[] args){
            MyThread t= new MyThread();
            t.start();

        
    }
}
