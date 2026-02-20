//version 4.0
//author:AGENT47MARINE
//useCase 4: Character Array Based Palindrome Check
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");
        String str = "madam";

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }

        String str2 = "radar";
        String reversed = new StringBuilder(str2).reverse().toString();

        if (str2.equals(reversed)) {
            System.out.println("The word '" + str2 + "' is a palindrome.");
        } else {
            System.out.println("The word '" + str2 + "' is not a palindrome.");
        }

        char[] chars = str2.toCharArray();
        int start = 0;
        int end = str2.length() -1;

        boolean isPalindrome2= true;

        while(start < end){
            if (chars[start] == chars[end]){
                start++;
                end--;
                continue;
            }else{
                isPalindrome2 = false;
                break;
            }
    }
        System.out.println("Palindrome =" + isPalindrome2);
    }
}
