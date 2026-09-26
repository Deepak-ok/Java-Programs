package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    static void main() {
        List<String> fruits=List.of("apple","banana","mango","cherry","date");

//        System.out.println("Printing fruits using normally");
//        System.out.println(fruits.size());
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        System.out.println("Printing fruits using streams");

        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Printing fruits using filter");  //but filter kewal boolean return krta koi value nhi
        fruits.stream()
                .filter(fruit-> fruit.endsWith("a"))
                .forEach(fruit-> System.out.println(fruit));
    }
}
