class NonGen{
    int num;

    NonGen(int ob){
        num= ob;
    }

    int getnum(){
        return num;
    }
}

class Gen<T> extends NonGen{
    T ob;

    Gen(int x, T ob){
        super(x);
        this.ob=ob;
    }

    T getob() {
        return ob;
        }
}

class Gen2<T,V> extends Gen<T>{
    V ob2;

    Gen2(int x, T o, V o2){
        super(x,o);
        ob2= o2;
    }

    V getob2() {
        return ob2;
        }
}

class HierDemo2{
    public static void main(String args[]){
        Gen2<Integer, String> x=
        new Gen2<Integer, String>(100,50,"Some value");

        System.out.println(x.getob());
        System.out.println(x.getob2()); 
    }
}