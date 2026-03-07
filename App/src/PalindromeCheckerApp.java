import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
//version 7.0
//author:AGENT47MARINE
//Use Case 7: Deque-Based Optimized Palindrome Checker

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

        String str3 = "noon";

        Stack<Character> stack = new Stack<>();
        for (char c : str3.toCharArray()){
            stack.push(c);

        }
        boolean isPalindrome3 = true;
        for (char c : str3.toCharArray()){
            if (c != stack.pop()) {
                isPalindrome3 = false;
                break;
            }
        }
        System.out.println("Is '" + str3 + "' a palindrome? " + isPalindrome3);

        String str4 = "civic";
        boolean isPalindrome4 = true;
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack1 = new Stack<>();
        for (char c : str4.toCharArray()) {
            stack1.push(c);
            queue.add(c);
        }
        while (!stack1.isEmpty()) {
            if (!stack1.pop().equals(queue.remove())) {
                isPalindrome4 = false;
                break;
            }
        }
        System.out.println(str4 + "  "+"Result: " + isPalindrome4);
                // UC7: Deque-Based Optimized Palindrome Checker
        String inputUC7 = "level";
        Deque<Character> dequeUC7 = new LinkedList<>();
        for (int i = 0; i < inputUC7.length(); i++) {
            dequeUC7.addLast(inputUC7.charAt(i));
        }
        boolean isPalUC7 = true;
        while (dequeUC7.size() > 1) {
            char frontChar = dequeUC7.removeFirst();
            char rearChar = dequeUC7.removeLast();
            if (frontChar != rearChar) {
                isPalUC7 = false;
                break;
            }
        }
        System.out.println("UC7 (Deque Optimized): Is '" + inputUC7 + "' a palindrome? " + isPalUC7);
    }
}

