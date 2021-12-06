class NonGen{
    Object ob;

    NonGen(Object o){
        ob= o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of ob is: " + ob.getClass().getName());
    }
}

class NonGenDemo{
    public static void main(String[] args){
        NonGen i0b = new NonGen(88);

        i0b.showType();

        int v= (Integer) i0b.getOb();

        System.out.println("Value of v is: " + v);

        NonGen s0b= new NonGen("NonGen string");

        String str = (String) s0b.getOb();

        System.out.println("Value of str is: " + str);
        
        i0b=s0b;

        int k= (Integer) i0b.getOb();

    }
}