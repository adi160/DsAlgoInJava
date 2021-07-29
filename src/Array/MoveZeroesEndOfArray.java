package Array;

/**
 * Author : Aditya
 * Created on : 12:23 AM , 30/07/21
 */

public class MoveZeroesEndOfArray {

    public void zeroesAtEndOfArray(int[] arr){
        int j = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,3,0,4,0,8,6,0};
        MoveZeroesEndOfArray moveZeroesEndOfArray = new MoveZeroesEndOfArray();
        ReverseAnArray reverseAnArray = new ReverseAnArray();
        moveZeroesEndOfArray.zeroesAtEndOfArray(arr);
        reverseAnArray.printArray(arr);
    }
}
