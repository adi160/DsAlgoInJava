package String;

/**
 * Author : Aditya
 * Created on : 12:44 AM , 30/07/21
 */

public class Palindrome {

    public boolean isPalindrome(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start < end){
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome("madam")){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
