import java.util.Scanner;

class OccurrencesArray {
   public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to array occurences ");
        int[] numArr=ArrayUtility.inputArray();
        System.out.print("Now Enterr the number you want to find\n");
        int num =input.nextInt();
        int occurrences=noOfOccurrences(numArr,num);
       System.out.print("Your Element was Found "+ occurrences+" times");
   }

   public static  int  noOfOccurrences(int[] numArr, int num){
      int occ=0;
      int i=0;
      while (i<numArr.length){
         if (numArr[i]==num){
             occ++;
         }
          i++;
      }
       return occ;
   }
}
