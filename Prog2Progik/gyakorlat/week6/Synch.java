class CallMe{
    /*synchronized*/ void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.print("]");
    }
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe target,String msg){
        this.target= target;
        this.msg= msg;
        t = new Thread(this);
    }

    public void run(){
        synchronized(target){target.call(msg);}
    }
}

class Synch{
    public static void main(String args[]){
        CallMe cm = new CallMe();

        Caller c1 = new Caller(cm, "Hello");
        Caller c2 = new Caller(cm, "synchronized");
        Caller c3 = new Caller(cm, "World");

        c1.t.start();
        c2.t.start();
        c3.t.start();

        try{
        c1.t.join(); //bevárja a main amire végeznek a threadek
        c2.t.join();
        c3.t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}