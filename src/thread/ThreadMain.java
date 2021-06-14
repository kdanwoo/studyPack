package thread;

import java.io.InterruptedIOException;

public class ThreadMain {

    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        Worker w[] = new Worker[200];

    }
}
class MyObject{
    public synchronized void foo(int x){
        try{
            System.out.println(x + " start");
            wait(1);
            System.out.println(x + " end");
        }catch (InterruptedException e){

        }
    }
}
class Worker extends Thread{
    private MyObject object;
    private int x;

    Worker(MyObject myObject, int x){
        this.object = myObject;
        this.x = x;
    }

    public void run(){
        object.foo(x);
    }
}
