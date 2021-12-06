interface MyNumber{
    double getValue();
}

interface NumericTest {
    boolean test(int n);
}

class LambdaExpDemo{
    public static void main(String[] args){
        MyNumber mynumb;

        mynumb= ()-> 123.45;

        System.out.println("A fixed value: " + mynumb.getValue());

        mynumb= () -> Math.random()*100;

        System.out.println("A fixed value: " + mynumb.getValue());
    
        NumericTest isEven = (n) -> (n%2)==0;

        if(isEven.test(6)){
            System.out.println("6 is even");
        }
        if(!isEven.test(9)){
            System.out.println("9 is not even");
        }

        NumericTest isNonNegative= (int n)->n >= 0;
    }
}