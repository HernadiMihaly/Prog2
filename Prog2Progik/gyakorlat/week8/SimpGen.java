class Gen<T, V>{
    T ob1;
    V ob2;

    Gen(T o1, V o2){ 
        ob1= o1;
        ob2= o2;
        }

    T getOb1() {return ob1;}
    V getOb2() {return ob2;}

    void showType(){
        System.out.println("Type of ob1 is " + ob1.getClass().getName());
        System.out.println("Type of ob2 is " + ob2.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args){
        Gen<Integer, String> complex0b = new Gen<Integer, String>(88, "string type");
        
        complex0b.showType();

        int i = complex0b.getOb1();

        String k= complex0b.getOb2();

        System.out.println("value of i: " + i);
        System.out.println("value of st is: " + k);

    }
}