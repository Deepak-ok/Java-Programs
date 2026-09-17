import java.util.Scanner;

class MinimumTernary {
     static void main() {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to finding minimum");
         System.out.print("please enter your first  number: ");
         int num1=input.nextInt();
         System.out.print("please enter your second  number: ");
         int num2=input.nextInt();
          MinimumTernary ternary=new MinimumTernary();
          int min=ternary.min(num1,num2);

         System.out.println("your minimum nunber is :"+min);
     }

     public int min(int num1, int num2){
         return  num1 < num2 ? num1 : num2;
     }
}
