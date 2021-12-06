class NewThread implements Runnable {
    Thread t;
    String name;

    NewThread(String name){
        this.name= name;
        t= new Thread(this,name);
        System.out.println("Child thread " + t);
    }

    public void run(){
        try{
        for (int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(name + "interrupted" + e);
        }
        System.out.println(name + "ended");
    }
}

class MultiThreadDemo{
    public static void main(String args[]){
        
        NewThread nt1 = new NewThread("1");
        NewThread nt2 = new NewThread("2");
        NewThread nt3 = new NewThread("3");
        nt1.t.start(); //elindítja a runját az osztálynak
        nt2.t.start();
        nt3.t.start();

        System.out.println("is 1 alive?: " + nt1.t.isAlive());
        System.out.println("is 2 alive?: " + nt2.t.isAlive());
        System.out.println("is 3 alive?: " + nt3.t.isAlive());
        try{
        nt1.t.join(); //bevárja a main amire végeznek a threadek
        nt2.t.join();
        nt3.t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("is 1 alive?: " + nt1.t.isAlive());
        System.out.println("is 2 alive?: " + nt2.t.isAlive());
        System.out.println("is 3 alive?: " + nt3.t.isAlive());

        System.out.println("Main ended");

        
    }
}