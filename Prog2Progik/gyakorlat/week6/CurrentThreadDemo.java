class CurrentThreadDemo{
    public static void main(String[] args){
        //a main szál
        Thread t = Thread.currentThread(); //jelenlegi szál(main)

        System.out.println("Curr thread: " + t); 

        t.setName("My first thread"); //NÉV BEÁLLÍTÁSA

        System.out.println("After change: " + t);

        try{
            for(int i=5; i>0; i--){
                System.out.println(i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e){ //ha megszakítjuk
            System.out.println("Main thread interrupted");
        }
    }
}