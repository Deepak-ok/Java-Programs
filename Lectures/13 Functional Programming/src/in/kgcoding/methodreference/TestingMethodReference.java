package in.kgcoding.methodreference;


import java.util.List;
import java.util.function.BinaryOperator;

import static java.lang.IO.println;

public class TestingMethodReference {
    static void main() {
        List<Integer> numbers= List.of(1,2,3,4,5);


        int newSum2=numbers.stream()
                .reduce(0,(a,b)-> a+b );
        System.out.printf("\n Sum Using reduce is %d",newSum2);

        numbers.stream()
                .filter(num-> num%2 ==1)
                .forEach(num-> System.out.println(num));

        numbers.stream()
                .filter(num-> num%2 ==1)
                .forEach(System.out::println);

//        int max=numbers.stream()
//                .reduce(0,(a,b)-> a>b ? a : b );
//        System.out.printf("\n max Using reduce is %d",max);
    }
}

