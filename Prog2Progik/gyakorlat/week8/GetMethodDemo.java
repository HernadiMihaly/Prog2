class GetMethodDemo{

    static <T extends Comparable<T>, 
    V extends T> boolean isIn(T x, V[] v){
        for(int i=0; i<v.length; i++){
            if(x.equals(v[i])) return true;
        }
        return false;

    }

    public static void main(String[] args){
        Integer iNums[]= {1,2,3,4,5};

        if(isIn(2,iNums)){
            System.out.println("2 is in iNums");
        }

        String strNums[] = {"one", "two", "three", "four"};

        if(isIn("two", strNums)){
            System.out.println("two is in strNums");
        }

        if(isIn("seven", strNums)){
            System.out.println("seven is in strNums");
        }
        else System.out.println("seven is not in strNums");
    }
}