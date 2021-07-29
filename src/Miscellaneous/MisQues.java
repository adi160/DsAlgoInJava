package Miscellaneous;

/**
 * Author : Aditya
 * Created on : 1:02 AM , 30/07/21
 */

public class MisQues {

    int x,y;

    public void oddEven(int n){

        // (n & 1) == 0 --> Even
        // (n & 1) == 1 --> Odd

        if((n & 1) == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

    public void swapTwoNum(MisQues misQues){
        misQues.x = misQues.x ^ misQues.y;
        misQues.y = misQues.x ^ misQues.y;
        misQues.x = misQues.x ^ misQues.y;
    }

    public static void main(String[] args) {
        MisQues misQues = new MisQues();
//        misQues.oddEven(18);
//        misQues.x = 10;
//        misQues.y = 20;
//        System.out.println("Before Swap- " + "X = "+ misQues.x + " and Y = "+ misQues.y);
//        misQues.swapTwoNum(misQues);
//        System.out.println("After Swap- " + "X = "+ misQues.x + " and Y = "+ misQues.y);
    }
}
