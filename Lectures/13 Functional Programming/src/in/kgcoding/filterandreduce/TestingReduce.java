package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    static void main() {
        List<Integer> numbers= List.of(1,2,3,4,5);
        int sum=0;
        for (Integer number: numbers){
            sum+=number;
        }
        System.out.printf("\n sum using normal is %d",sum);

      int newSum=  numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.printf("\n Sum Using reduce is %d",newSum);
        //this both methods are same

        int newSum2=numbers.stream()
                .reduce(0,(a,b)-> a+b );
        System.out.printf("\n Sum Using reduce is %d",newSum2);

        int max=numbers.stream()
                .reduce(0,(a,b)-> a>b ? a : b );
        System.out.printf("\n max Using reduce is %d",max);
    }
}
