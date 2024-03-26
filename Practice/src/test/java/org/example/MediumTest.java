package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
public class MediumTest {
    @Test
    public void testMediumProblem1() {
        //Problem 1: Write a program that reverses a string without using any built-in reverse methods.
        assertEquals("cba", MediumProblem1.reverseString("abc"));
        assertEquals("edcba", MediumProblem1.reverseString("abcde"));
        assertEquals("zyxwvutsrqponmlkjihgfedcba", MediumProblem1.reverseString("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("", MediumProblem1.reverseString(""));
        assertEquals("a", MediumProblem1.reverseString("a"));
    }

    @Test
    public void testMediumProblem2() {
        //Problem 2: Write a program that checks if a string is a palindrome.
        assertTrue(MediumProblem2.isPalindrome("racecar"));
        assertTrue(MediumProblem2.isPalindrome("abccba"));
        assertTrue(MediumProblem2.isPalindrome("a"));
        assertFalse(MediumProblem2.isPalindrome("hello"));
    }

    @Test
    public void testMediumProblem3() {
        //Problem 3: Write a program that finds the longest substring without repeating characters.
        assertEquals("abc", MediumProblem3.longestSubstring("abcabcbb"));
        assertEquals("b", MediumProblem3.longestSubstring("bbbbb"));
        assertEquals("wke", MediumProblem3.longestSubstring("pwwkew"));
        assertEquals("a", MediumProblem3.longestSubstring("a"));
        assertEquals("", MediumProblem3.longestSubstring(""));
    }

    @Test
    public void testMediumProblem4() {
        //Problem 4: Write a program to implement Merge sort.
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, MediumProblem4.mergeSort(new int[]{10,9,8,7,6,5,4,3,2,1}));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, MediumProblem4.mergeSort(new int[]{1,2,3,4,5,6,7,8,9,10}));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, MediumProblem4.mergeSort(new int[]{1,10,2,9,3,8,4,7,5,6}));
    }

    @Test
    public void testMediumProblem5() {
        //Problem 5: Write a program to search for a number in a sorted array (Binary Search).
        assertEquals(0, MediumProblem5.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));
        assertEquals(9, MediumProblem5.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));
        assertEquals(4, MediumProblem5.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
        assertEquals(-1, MediumProblem5.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 11));
    }

    @Test
    public void testMediumProblem6() {
        //Problem 6: Write a program that implements a basic stack with push, pop, and peek methods.
        MediumProblem6.Stack stack = new MediumProblem6.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        stack.push(4);
        assertEquals(4, stack.peek());
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
    }

    @Test
    public void testMediumProblem7() {
        //Problem 7: Write a program that implements a basic queue with enqueue, dequeue, and peek methods.
        MediumProblem7.Queue queue = new MediumProblem7.Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        queue.enqueue(4);
        assertEquals(4, queue.peek());
        queue.enqueue(5);
        assertEquals(4, queue.peek());
        assertEquals(4, queue.dequeue());
        assertEquals(5, queue.dequeue());
    }

    @Test
    public void testMediumProblem8() {
        //Problem 8: Write a program for basic tree traversal (e.g., pre-order, in-order, post-order) on a simple binary tree.
        MediumProblem8.TreeNode root = new MediumProblem8.TreeNode(1);
        root.left = new MediumProblem8.TreeNode(2);
        root.right = new MediumProblem8.TreeNode(3);
        root.left.left = new MediumProblem8.TreeNode(4);
        root.left.right = new MediumProblem8.TreeNode(5);
        root.right.left = new MediumProblem8.TreeNode(6);
        root.right.right = new MediumProblem8.TreeNode(7);
        assertEquals("1245367", MediumProblem8.preOrder(root));
        assertEquals("4251637", MediumProblem8.inOrder(root));
        assertEquals("4526731", MediumProblem8.postOrder(root));
    }

    @Test
    public void testMediumProblem9() {
        //Problem 9: Write a program that calculates the nth Fibonacci number using recursion.
        assertEquals(0, MediumProblem9.fibonacci(0));
        assertEquals(1, MediumProblem9.fibonacci(1));
        assertEquals(1, MediumProblem9.fibonacci(2));
        assertEquals(2, MediumProblem9.fibonacci(3));
        assertEquals(3, MediumProblem9.fibonacci(4));
        assertEquals(5, MediumProblem9.fibonacci(5));
        assertEquals(8, MediumProblem9.fibonacci(6));
        assertEquals(13, MediumProblem9.fibonacci(7));
        assertEquals(21, MediumProblem9.fibonacci(8));
        assertEquals(34, MediumProblem9.fibonacci(9));
        assertEquals(55, MediumProblem9.fibonacci(10));
        assertEquals(89, MediumProblem9.fibonacci(11));
        assertEquals(144, MediumProblem9.fibonacci(12));
        assertEquals(233, MediumProblem9.fibonacci(13));
        assertEquals(377, MediumProblem9.fibonacci(14));
        assertEquals(610, MediumProblem9.fibonacci(15));
    }

    @Test
    public void testMediumProblem10() {
        //Problem 10: Write a recursive function that sums the digits of a number. ex: 123 -> 1+2+3 = 6
        assertEquals(6, MediumProblem10.sumDigits(123));
        assertEquals(1, MediumProblem10.sumDigits(1));
        assertEquals(0, MediumProblem10.sumDigits(0));
        assertEquals(10, MediumProblem10.sumDigits(19));
        assertEquals(10, MediumProblem10.sumDigits(91));
        assertEquals(10, MediumProblem10.sumDigits(109));
    }

    @Test
    public void testMediumProblem11() {
        //Problem 11: Write a recursive function to determine if a string is a palindrome.
        assertTrue(MediumProblem11.isPalindrome("racecar"));
        assertTrue(MediumProblem11.isPalindrome("abccba"));
        assertTrue(MediumProblem11.isPalindrome("a"));
        assertFalse(MediumProblem11.isPalindrome("hello"));
    }
}
