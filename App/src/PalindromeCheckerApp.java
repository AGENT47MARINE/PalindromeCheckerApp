//version 2.0
//author:AGENT47MARINE
//useCase 2:Hardcoded Palindrome Result
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
    }

    }
}
