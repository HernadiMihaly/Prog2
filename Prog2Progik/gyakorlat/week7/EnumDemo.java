enum Apple{
    Jonathan, GoldenDel, RenDel, Winesap, Cortland

}

class EnumDemo{
    public static void main(String args[]){
        Apple ap;
        ap= Apple.Winesap;

        System.out.println("Value of ap: " + ap);

        ap= Apple.GoldenDel;

        System.out.println("Value of ap: " + ap);

        if(ap == Apple.GoldenDel){
            System.out.println("ap contains GoldenDel");
        }

        switch(ap){
            case Jonathan:
                System.out.println("Jonathan is red");
                break;

            case GoldenDel:
                System.out.println("GoldenDel is yellow");
                break;

            case RenDel:
                System.out.println("RenDel is red");
                break;

            case Winesap:
                System.out.println("Winesap is red");
                break;

            case Cortland:
                System.out.println("Cortland is red");
                break;
        }

        Apple allApples[] =  Apple.values();

        for (var a : allApples){
            System.out.println(a);
        }
    }
}