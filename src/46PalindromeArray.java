 class PalindromeArray {
     static void main() {
         System.out.println("Welcome to Palindrome Checker");
         int[] numArr=ArrayUtility.inputArray();
         boolean isPalin=isPalindrome(numArr);
         if (isPalin){
             System.out.println("Your Array IS Palinddrome");
         } else {
             System.out.println("Your Array Is not Palindrome");
         }
     }

     public static boolean isPalindrome(int[] numArr){
         int i=0;
         while (i< numArr.length/2){
             if(numArr[i] != numArr[(numArr.length-1)-i]){
                 return false;
             }
             i++;
         }
         return true;
     }
}
