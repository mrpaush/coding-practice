package org.example;
import java.util.Scanner;
import java.lang.Math;

//Easy:
public class Easy {
    public static void main(String[] args) {
        //Problem1.printHelloWorld();
        //Problem2.printUserNameAndAge();
    }
}
// Output and Calculations
//Problem 1: Write a program that prints 'Hello, World!' to the console.
class Problem1 {
    public static void printHelloWorld() {
        System.out.print("Hello, World!");
    }
}
//Problem 2: Write a program that prints your name and age via scanner. It should be in the format "name, age".
class Problem2 {
    public static void printUserNameAndAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println(name + ", " + age);
    }
}
//Problem 3: Write a program to calculate the area of a circle given its radius. Formula is A = πr^2.
class Problem3 {
    public static double calculateCircleArea(int r) {
        double pi = Math.PI;
        return pi*(r*r);
    }
}
//Problem 4: Write a program to convert temperature from Celsius to Fahrenheit (or vice versa). formula is C = (F-32)*5/9 or F = (C*9/5)+32
class Problem4 {
    public static double convertTemperature(int i, char c) {
        if (c == 'C') {
           return (i*(9.0/5.0))+32;
        }
        else {
           return (i-32)*(5.0/9.0);
        }
    }
}
// Conditionals
//Problem 5: FizzBuzz Sum: Calculate the sum of 1 to 100, without counting numbers that are multiples of 3 AND 5, ex: 15.
class Problem5 {
    public static int fizzBuzzSum() {
        int ans = 0;
        for(int i = 1; i <= 100; i++) {
            if(i%3 != 0 && i%5 != 0) {
                ans += i;
            }
        }
        return ans;
    }
        }
//Problem 6: Write a program to determine if a given number is even or odd.
class Problem6 {
    public static boolean isEven(int i) {
        return i%2==0;
    }
}
//Problem 7:  Write a program to find the largest of three numbers.
class Problem7 {
    public static int findLargest(int z, int x, int c) {
        if (z >= x && z >= c) return z;
        if (x >= z && x >= c) return x;
        else
            return c;
    }
}
// Loops
//Problem 8: Write a program to print numbers from 1 to 100.
class Problem8 {
    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
//Problem 9:  Write a program to calculate the factorial of a number.
class Problem9 {
    public static int calculateFactorial(int i) {
        if (i == 1) return 1;
        return i * calculateFactorial(i-1);
    }
}
//Problem 10: Write a program to generate the first 15 numbers of the Fibonacci Sequence.
class Problem10 {
    public static int fibonacci(int i) {
        return i <= 0 ? 0 : i == 1 ? 1 : fibonacci(i-1) + fibonacci(i-2);
    }
}
// Arrays and Input
//Problem 11: List Addition:  Write a program that takes two lists of numbers and creates a new list containing the sum of corresponding elements from the input lists.
class Problem11 {
    public static int[] addLists(int[] a, int[] b) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[i]+b[i];
        }
        return ans;
    }
}
//Problem 12: Element Removal  Write a program that takes a list of numbers and a target value, and removes all occurrences of the target value from the list.
class Problem12 {
    public static int[] removeElement(int[] a, int target) {

    }
}
//Problem 13: Take User Input: Write a program that takes a name as input and prints "Hello, [name]!".
//Problem 14: Write a program to find the maximum (or minimum) value in an array.
//Problem 15: Write a program to calculate the average of the numbers in an array.