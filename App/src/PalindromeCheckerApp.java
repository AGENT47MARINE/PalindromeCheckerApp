//version 3.0
//author:AGENT47MARINE
//useCase 3:Palindrome Check Using String Reverse
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
        String reversed ="";
        for (int i = str2.length() - 1; i >= 0; i--) {
            reversed += str2.charAt(i);
        }
        if (str2.equals(reversed)) {
            System.out.println("The word '" + str2 + "' is a palindrome.");
        } else {
            System.out.println("The word '" + str2 + "' is not a palindrome.");
        }
    }
}

