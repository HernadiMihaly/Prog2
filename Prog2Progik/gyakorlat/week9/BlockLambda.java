interface NumericFunc{
    int func(int n);
}

interface StringFunc{
    String func(String str);
}

class BlockLambda{
    public static void main(String[] args){

        NumericFunc factorial= (n)->{
            int result=1;
            for(int i=1; i<=n; i++)
                result=result*i;
            return result;
        };

        System.out.println("The factorial of 7 is: " + factorial.func(7));

        StringFunc st;
        st= (str)-> {
            String result="";
            int i;
            for (i=str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Reverse: " + st.func("macska"));
    }
}