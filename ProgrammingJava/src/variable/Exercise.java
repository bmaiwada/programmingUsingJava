package variable;

import java.util.Scanner;

public class Exercise {

    //1. Program to find ASCII code of a character
    public static void main(String[] args) {
        System.out.println("1. Program to find ASCII code of a character");
        char ch = 'P';
        int asciiCode = ch;
        int asciiValue = (int) ch;

        System.out.println("The Ascii value of " + ch + " is: " + asciiCode);
        System.out.println("The Ascii value of " + ch + " is: " + asciiValue);

        //2.  Program to multiply two numbers
        System.out.println("2. Program to multiply two numbers");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double m = sc.nextDouble();

        System.out.print("Enter the Second Number: ");
        double n = sc.nextDouble();

        double num = m*n;
        System.out.format("The product of the two numbers is: ", String.format("%.2f", num));

        //3. Find an area of triangle
        System.out.println("Find an area of triangle");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        double base = scan.nextDouble();

        System.out.print("Enter the Height: ");
        double height = scan.nextDouble();

        double areaOfTriangle = (base * height)/2;
        System.out.format("The area of triangle is: ", String.format("%.2 ", areaOfTriangle));


    }
}
