import java.util.*;
import java.util.stream.*;

class StreamDemo{
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(10);
        myList.add(3);
        myList.add(24);
        myList.add(30);
        myList.add(2);

        System.out.println("Originals list: "+myList);

        Stream<Integer> myStream = myList.stream();
        Stream<Integer> myStream2 = myList.stream();

        Optional<Integer> minval = myStream.min(Integer::compare);
        Optional<Integer> maxval= myStream2.max(Integer::compare);

        System.out.println(minval.get());
        System.out.println(maxval.get());

        Stream<Integer> myStream3 = myList.stream().sorted();
        myStream3.forEach((n) -> System.out.print(n+" "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n)->(n%2)==1);
        oddVals.forEach((n) -> System.out.print(n+" "));
        System.out.println();

        oddVals = myList.stream()
            .filter((n)->n%2==0)
            .filter((n)->(n>5));

        oddVals.forEach((n)->System.out.print(n+" "));
    }
}