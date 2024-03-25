package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

//Easy:
// Output and Calculations
//Problem 1: Write a program that prints 'Hello, World!' to the console.
//Problem 2: Write a program that prints your name and age via scanner. It should be in the format "name, age".
//Problem 3: Write a program to calculate the area of a circle given its radius. Formula is A = πr^2.
//Problem 4: Write a program to convert temperature from Celsius to Fahrenheit (or vice versa).
// Conditionals
//Problem 5: FizzBuzz Sum: Calculate the sum of 1 to 100, replacing multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
//Problem 6: Write a program to determine if a given number is even or odd.
//Problem 7:  Write a program to find the largest of three numbers.
// Loops
//Problem 8: Write a program to print numbers from 1 to 100 (or a different range).
//Problem 9:  Write a program to calculate the factorial of a number.
//Problem 10: Write a program to generate the first 15 numbers of the Fibonacci Sequence.
// Arrays and Input
//Problem 11: List Addition:  Write a program that takes two lists of numbers and creates a new list containing the sum of corresponding elements from the input lists.
//Problem 12: Element Removal  Write a program that takes a list of numbers and a target value, and removes all occurrences of the target value from the list.
//Problem 13: Take User Input: Write a program that takes a name as input and prints "Hello, [name]!".
//Problem 14: Write a program to find the maximum (or minimum) value in an array.
//Problem 15: Write a program to calculate the average of the numbers in an array.
public class EasyTest {

    @Test
    public void testProblem1() {
        //Problem 1: Write a program that prints 'Hello, World!' to the console.
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Problem1.printHelloWorld();
        assertTrue(outContent.toString().equals("Hello, World!") || outContent.toString().equals("Hello, World!\n"));
    }
    @Test
    public void testProblem2() {
        //Problem 2: Write a program that prints your name and age via scanner. It should be in the format "name, age".
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String simulatedInput = "Test\n99\n";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);
        Problem2.printUserNameAndAge();
        assertFalse(outContent.toString().trim().isEmpty());
    }
    @Test
    public void testProblem3() {
        //Problem 3: Write a program to calculate the area of a circle given its radius. Formula is A = πr^2.
        assertEquals(12.566370614359172, Problem3.calculateCircleArea(2));
        assertEquals(28.274333882308138, Problem3.calculateCircleArea(3));
        assertEquals(50.26548245743669, Problem3.calculateCircleArea(4));
        //edge cases
        assertEquals(0.0, Problem3.calculateCircleArea(0));
        assertEquals(3.141592653589793, Problem3.calculateCircleArea(1));
    }
    @Test
    public void testProblem4() {
        //Problem 4: Write a program to convert temperature from Celsius to Fahrenheit (or vice versa). formula is C = (F-32)*5/9 or F = (C*9/5)+32
        assertEquals(32.0, Problem4.convertTemperature(0, 'C'));
        assertEquals(212.0, Problem4.convertTemperature(100, 'C'));
        assertEquals(0.0, Problem4.convertTemperature(32, 'F'));
        assertEquals(100.0, Problem4.convertTemperature(212, 'F'));
    }
    @Test
    public void testProblem5() {
        //Problem 5: FizzBuzz Sum: Calculate the sum of 1 to 100, without counting numbers that are multiples of 3 AND 5, ex: 15
        assertEquals(2632, Problem5.fizzBuzzSum());
    }
    @Test
    public void testProblem6() {
        //Problem 6: Write a program to determine if a given number is even or odd.
        assertTrue(Problem6.isEven(2));
        assertFalse(Problem6.isEven(3));
        assertTrue(Problem6.isEven(0));
        assertFalse(Problem6.isEven(1));
    }
    @Test public void testProblem7() {
        //Problem 7:  Write a program to find the largest of three numbers.
        assertEquals(3, Problem7.findLargest(1, 2, 3));
        assertEquals(3, Problem7.findLargest(3, 2, 1));
        assertEquals(3, Problem7.findLargest(2, 3, 1));
        assertEquals(3, Problem7.findLargest(1, 3, 2));
        assertEquals(3, Problem7.findLargest(3, 3, 3));
    }
    @Test public void testProblem8() {
        //Problem 8: Write a program to print numbers from 1 to 100).
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Problem8.printNumbers(1, 100);
        assertTrue(outContent.toString().contains("1"));
        assertTrue(outContent.toString().contains("100"));
    }
    @Test public void testProblem9() {
        //Problem 9:  Write a program to calculate the factorial of a number.
        assertEquals(120, Problem9.calculateFactorial(5));
        assertEquals(1, Problem9.calculateFactorial(1));
        assertEquals(2, Problem9.calculateFactorial(2));
        assertEquals(6, Problem9.calculateFactorial(3));
    }
    @Test public void testProblem10() {
        //Problem 10: Write a program to generate the first 15 numbers of the Fibonacci Sequence.
        assertEquals(1, Problem10.fibonacci(1));
        assertEquals(1, Problem10.fibonacci(2));
        assertEquals(2, Problem10.fibonacci(3));
        assertEquals(3, Problem10.fibonacci(4));
        assertEquals(5, Problem10.fibonacci(5));
        assertEquals(8, Problem10.fibonacci(6));
        assertEquals(13, Problem10.fibonacci(7));
        assertEquals(21, Problem10.fibonacci(8));
        assertEquals(34, Problem10.fibonacci(9));
        assertEquals(55, Problem10.fibonacci(10));
        assertEquals(89, Problem10.fibonacci(11));
        assertEquals(144, Problem10.fibonacci(12));
        assertEquals(233, Problem10.fibonacci(13));
        assertEquals(377, Problem10.fibonacci(14));
        assertEquals(610, Problem10.fibonacci(15));
    }
    @Test public void testProblem11() {
        //Problem 11: List Addition:  Write a program that takes two lists of numbers and creates a new list containing the sum of corresponding elements from the input lists.
        assertArrayEquals(new int[]{2, 4, 6}, Problem11.addLists(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{3, 5, 7}, Problem11.addLists(new int[]{1, 2, 3}, new int[]{2, 3, 4}));
        assertArrayEquals(new int[]{4, 6, 8}, Problem11.addLists(new int[]{2, 3, 4}, new int[]{2, 3, 4}));
    }
    @Test public void testProblem12() {
        //Problem 12: Element Removal  Write a program that takes a list of numbers and a target value, and removes all occurrences of the target value from the list.
        assertArrayEquals(new int[]{1, 2, 4}, Problem12.removeElement(new int[]{1, 2, 3, 4, 3}, 3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 3}, Problem12.removeElement(new int[]{1, 2, 3, 4, 3}, 5));
        assertArrayEquals(new int[]{1, 2, 3, 4, 3}, Problem12.removeElement(new int[]{1, 2, 3, 4, 3}, 0));
        assertArrayEquals(new int[]{1, 3, 4, 3}, Problem12.removeElement(new int[]{1, 2, 3, 4, 3}, 2));
    }
}
