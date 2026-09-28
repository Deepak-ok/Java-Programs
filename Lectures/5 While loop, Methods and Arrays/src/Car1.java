 class Car1 {
    String color;
    float price;

    static {
        System.out.println("This is a Static Block");
    }

    {
        System.out.println("This is a Initialization Block");
        color = "Black";
        price = 50000;
    }

    Car1(String carColor, float currPrice) {
        color = carColor;
        price = currPrice;
    }

    Car1() { // Default constructor
        color = "Black";
        price = 50000;
    }

    public static void main(String[] args) {
        Car1 swift = new Car1();

        if (true) { // code block
            System.out.println("Code Block");
        }
    }
}



