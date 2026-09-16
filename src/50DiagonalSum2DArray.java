 class DiagonalSum2DArray {
     static void main() {
         System.out.println("WELCOME TO DIAGONAL Sum");
         int[][] numArr=ArrayUtility.input2DArray();
         System.out.println("Array Length;"+ numArr.length);
         long sum= sumOfDiagonals(numArr);
         System.out.println("Sum of Diagonals is: "+ sum);
     }

     public static long sumOfDiagonals(int[][] numArr){
     long leftSum=sumOfLeftDiagonals(numArr);
     long rightSum=sumOfRightDiagonals(numArr);
     long sum= leftSum + rightSum;
     if (numArr.length % 2 !=0){
         int ind= numArr.length/2;
         sum -= numArr[ind][ind];
     }
         return sum;
     }

     public static long sumOfLeftDiagonals(int[][] numArr){
    long sum=0;
    int i=0;
    while (i < numArr.length){
        sum+=numArr[i][i];
        i++;
    }
         return sum;
     }

     public static long sumOfRightDiagonals(int[][] numArr){
       long sum=0;
       int i=0;
       while (i< numArr.length){
           int col=numArr.length-1-i;
           sum+=numArr[i][col];

           i++;
       }
         return sum;
     }
}

