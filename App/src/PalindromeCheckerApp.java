import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
//version 11.0
//author:AGENT47MARINE
//Use Case 11: Object-Oriented Palindrome Service (Encapsulation)
// UC11: Object-Oriented Palindrome Service
class PalindromeService {
    /**
     * Encapsulates the palindrome check logic.
     * Demonstrates Single Responsibility Principle.
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Internal Data Structure: Stack
        Stack<Character> stack = new Stack<>();
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleanInput.equals(reversed.toString());
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args){
        static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    // Method to reverse linked list (UC8)
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
        // Method for UC9 Recursive Palindrome Check
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    
    // Method for UC10: Case-Insensitive & Space-Ignored Palindrome
    public static boolean isPalindromeIgnoreCaseSpace(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
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
        // UC8: Linked List Based Palindrome Checker
        String inputUC8 = "madam";
        Node head = new Node(inputUC8.charAt(0));
        Node current = head;
        for (int i = 1; i < inputUC8.length(); i++) {
            current.next = new Node(inputUC8.charAt(i));
            current = current.next;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalUC8 = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalUC8 = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        System.out.println("UC8 (Linked List): Is '" + inputUC8 + "' a palindrome? " + isPalUC8);
        // UC9: Recursive Palindrome Checker
        String inputUC9 = "refer";
        boolean isPalUC9 = isPalindromeRecursive(inputUC9, 0, inputUC9.length() - 1);
        System.out.println("UC9 (Recursive): Is '" + inputUC9 + "' a palindrome? " + isPalUC9);

      // UC10: Case-Insensitive & Space-Ignored Palindrome
        String inputUC10 = "A man a plan a canal Panama";
        boolean isPalUC10 = isPalindromeIgnoreCaseSpace(inputUC10);
        System.out.println("UC10 (Ignore Case & Space): Is '" + inputUC10 + "' a palindrome? " + isPalUC10);

        // UC11: Object-Oriented Service Implementation
        String inputUC11 = "Was it a car or a cat I saw";
        PalindromeService service = new PalindromeService();
        boolean isPalUC11 = service.checkPalindrome(inputUC11);
        System.out.println("UC11 (OOPS Service): Is '" + inputUC11 + "' a palindrome? " + isPalUC11);
    }

}

