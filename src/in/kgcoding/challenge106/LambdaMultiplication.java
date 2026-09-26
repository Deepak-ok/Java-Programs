package in.kgcoding.challenge106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> milti= (a,b)-> a*b;
       int result= milti.apply(4,5);
        System.out.println(result);
    }
}
