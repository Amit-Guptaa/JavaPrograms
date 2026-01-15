class SharedResource {
    synchronized void display() {
        try {
            System.out.println("Thread-1 is waiting...");
            wait();   // Thread goes to WAITING state
            System.out.println("Thread-1 resumed after notify()");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void notifyThread() {
        System.out.println("Thread-2 is notifying...");
        notify();   // Wakes up waiting thread
    }
}

class MyThread1 extends Thread {
    SharedResource obj;

    MyThread1(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display();
    }
}

class MyThread2 extends Thread {
    SharedResource obj;

    MyThread2(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        obj.notifyThread();
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();

        try {
            Thread.sleep(1000); // Ensure t1 enters wait()
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();

        try {
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread ends");
    }
}

