package Array;

import java.sql.Array;

/**
 * Author : Aditya
 * Created on : 11:53 PM , 29/07/21
 */

public class ReverseAnArray {

    public void reverseAnArray(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        ReverseAnArray obj = new ReverseAnArray();
        System.out.print("Actual Array - ");
        obj.printArray(arr);
        System.out.print("Reversed Array - ");
        obj.reverseAnArray(arr);
        obj.printArray(arr);
    }
}
