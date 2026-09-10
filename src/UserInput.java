import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter your name:");
        String name= input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.println(name+" please tell em your age.");
        int age =input.nextInt();
        System.out.println("your age is "+ age);
    }
}
