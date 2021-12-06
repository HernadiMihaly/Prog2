class NewThread implements Runnable{ //runnable interfaceből örökli a thread dolgait
    Thread t; //thread objektum

    NewThread(){ //konstruktor
        t= new Thread(this,"DemoThread"); //this: ez adja meg a kontextust, hogy ez az objektum egy szál lesz
        System.out.println("Child thread " + t);
    }

    public static NewThread createAndStart(){
        NewThread mynewth= new NewThread();
        mynewth.t.start();
        return mynewth;
    }

    public void run(){ //itt adjuk meg h mit csináljon a thread
        try {
            for (int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child thread interrupted" + e);
        }
        System.out.println("Child thread exiting");
    }
}

class ThreadFactoryDemo{
    public static void main(String args[]){
        NewThread nt= NewThread.createAndStart();

        try {
            for(int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("MAIN thread interrupted" + e);
        }
        System.out.println("Main thread exiting");
    }
}