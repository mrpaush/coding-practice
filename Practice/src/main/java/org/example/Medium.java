package org.example;
import java.util.*;

//Medium:
public class Medium {
    public static void main(String[] args) {
        //
    }
}
// String Manipulation
//Problem 1: Write a program that reverses a string without using any built-in reverse methods.
class MediumProblem1 {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
//Problem 2: Write a program that checks if a string is a palindrome. (No recursion)
class MediumProblem2 {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
//Problem 3: Write a program that finds the longest substring without repeating characters.
class MediumProblem3 {
    public static String longestSubstring(String s) {
        //hash map
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        int maxStart = 0;
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, end);
            if (end - start + 1 > max) {
                max = end - start + 1;
                maxStart = start;
            }
            end++;
        }
        return s.substring(maxStart, maxStart + max);
    }
}
// Array Manipulation
//Problem 4: Write a program to implement Merge sort.
class MediumProblem4 {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
//Problem 5: Write a program to search for a number in a sorted array (Binary Search).
class MediumProblem5 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
// Data Structures
//Problem 6: Write a program that implements a basic stack with push, pop, and peek methods.
class MediumProblem6 {
    public static class Stack {
        private List<Integer> stack;

        public Stack() {
            this.stack = new ArrayList<>();
        }

        public void push(int i) {
            stack.add(i);
        }

        public int pop() {
            if (!stack.isEmpty()) {
                return stack.remove(stack.size() - 1);
            } else {
                throw new EmptyStackException();
            }
        }

        public int peek() {
            if (!stack.isEmpty()) {
                return stack.get(stack.size() - 1);
            } else {
                throw new EmptyStackException();
            }
        }
    }
}
//Problem 7: Write a program that implements a basic queue with enqueue, dequeue, and peek methods.
class MediumProblem7 {
    public static class Queue {
        private List<Integer> queue;

        public Queue() {
            this.queue = new ArrayList<>();
        }

        public void enqueue(int i) {
            queue.add(i);
        }

        public int dequeue() {
            if (!queue.isEmpty()) {
                return queue.remove(0);
            } else {
                throw new NoSuchElementException();
            }
        }

        public int peek() {
            if (!queue.isEmpty()) {
                return queue.get(0);
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
//Problem 8: Write a program for basic tree traversal (e.g., pre-order, in-order, post-order) on a simple binary tree.
class MediumProblem8 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static String preOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString();
    }

    private static void preOrder(TreeNode root, StringBuilder sb) {
        if (root != null) {
            sb.append(root.val);
            preOrder(root.left, sb);
            preOrder(root.right, sb);
        }
    }

    public static String inOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        inOrder(root, sb);
        return sb.toString();
    }

    private static void inOrder(TreeNode root, StringBuilder sb) {
        if (root != null) {
            inOrder(root.left, sb);
            sb.append(root.val);
            inOrder(root.right, sb);
        }
    }

    public static String postOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        postOrder(root, sb);
        return sb.toString();
    }

    private static void postOrder(TreeNode root, StringBuilder sb) {
        if (root != null) {
            postOrder(root.left, sb);
            postOrder(root.right, sb);
            sb.append(root.val);
        }
    }
}
// Recursion
//Problem 9: Write a program that calculates the nth Fibonacci number using recursion in one line.
class MediumProblem9 {
    public static int fibonacci(int i) {
        return i == 1 ? 1 : i == 0 ? 0 : fibonacci(i-1) + fibonacci(i-2);
    }
}
//Problem 10: Write a recursive function that sums the digits of a number in one line. ex: 123 -> 1+2+3 = 6
class MediumProblem10 {
    public static int sumDigits(int i) {
        return i < 10 ? i : sumDigits(i%10) + sumDigits(i/10);
    }
}
//Problem 11: Write a recursive function to determine if a string is a palindrome in one line.
class MediumProblem11 {
    public static boolean isPalindrome(String s) {
        return s.length() < 2 || (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1)));
    }
}