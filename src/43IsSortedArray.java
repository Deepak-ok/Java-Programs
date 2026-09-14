import javax.xml.transform.Source;

class IsSortedArray {
     static void main() {
         System.out.println("Welcome tp Array Sorting Check Post\n");
         int[] numArr=ArrayUtility.inputArray();
         boolean isInc=isIncreasing(numArr);
         boolean IsDec=isDecreasing(numArr);

         if (isInc || IsDec){
             System.out.println("Your Array IS Sorted");
         } else {
             System.out.println("Your Array is not Sorted");
         }

     }

     public static boolean isDecreasing(int[] numArr){
         int i=1;
         while (i < numArr.length){
             if (numArr[i] < numArr[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }

     public static boolean isIncreasing(int[] numArr){
         int i=1;
         while (i < numArr.length){
             if (numArr[i] > numArr[i-1]){
                 return false;
             }
             i++;
         }
         return true;

     }

}
