class Gen<T>{
    T ob;

    Gen(T o){ ob= o;}

    T getOb() {return ob;}

    void showType(){
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args){
        Gen<Integer> i0b;

        i0b = new Gen<Integer>(80);
        
        i0b.showType();

        int i = i0b.getOb();

        System.out.println("value of i: " + i);

        Gen<String> st;
        st= new Gen<String>("string type");

        st.showType();

        String k= st.getOb();

        System.out.println("value of st is: " + k);

        
    }
}