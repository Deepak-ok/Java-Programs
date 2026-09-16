import java.util.Scanner;

class Search2DArray {
     static void main() {
         Scanner input= new Scanner(System.in);
         System.out.println("Welcome to 2D Search");
         int[][] numArr=ArrayUtility.input2DArray();
         System.out.println("Now Enter The number you want to search");
         int num= input.nextInt();
         boolean isFound=search(numArr,num);
         if (isFound){
             System.out.println("Your number is found");
         } else {
             System.out.println("Your Number is Not found");
         }

     }

     public static boolean search(int[][] numArr , int num){
         int i=0;
         while (i< numArr.length){
             int j=0;
             while (j< numArr[i].length){
                 if(numArr[i][j] == num){
                     return true;
                 }
                 j++;
             }
             i++;
         }
        return false;
     }
}
