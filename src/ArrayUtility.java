import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter no. of Elements :");
        int size=input.nextInt();
        int[] nums=new int[size];
        int i=0;
        while (i<size){
            System.out.print("Enter elements Number "+i+":");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArr){
        int i=0;
    while(i<numArr.length){
        System.out.print(numArr[i]+" ");
        i++;
    }
//        System.out.println();
    }
}
