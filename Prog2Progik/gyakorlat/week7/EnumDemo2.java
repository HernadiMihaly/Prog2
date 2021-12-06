enum Apple{
    Jonathan(10), GoldenDel(-5), RenDel, Winesap(15), Cortland(150);

    private int price; //price lokális változó

    
    Apple(int price){ //konstruktor
        this.price= price;
    }

    Apple(){ //konstruktor
        this.price=-1;
    }
    

    public int getPrice(){
        return price;
    }

}

class EnumDemo{
    public static void main(String args[]){
        System.out.println("The price of Jonathan is: " + Apple.Jonathan.getPrice());
        for (var a : Apple.values()){
            System.out.println(a + " costs " + a.getPrice());
        }



    }
}