package in.kgcoding.enums;

public class TestingEnums {
    static void main() {
        TrafficLight color=TrafficLight.RED;
        color =TrafficLight.GREEN;

        Grade grade=Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }

    }
}
