class AutoBox{
    static int m(Integer i){
        return i;
    }

    public static void main(String args[]){
        int a=6;
        double b= 1.5;

        double ab= 6*1.5;

        System.out.println(ab);

        Integer i0b= Integer.valueOf(a);
        Integer i0b2= Integer.valueOf(10);
        Integer i0b3= Integer.valueOf(100);


        System.out.println(i0b.intValue());
        System.out.println(i0b2.intValue());
        System.out.println(i0b3.intValue());
        System.out.println(m(10));


    }
}