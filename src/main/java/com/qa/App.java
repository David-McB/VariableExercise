package com.qa;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


//    exercise1();
        App app = new App();
        app.exercise2();
    }

    private void test() {
//        String firstName, lastName;
//        firstName = "David";
//        lastName = "McBride";
//
//        String name = firstName + " " + lastName;
//
//        System.out.println(name);

//        int num1, num2;
//        num1 = 5;
//        num2 = 8;
//        System.out.println(num1 + num2);
//        float result = (float)num1 / (float)num2;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        String outName = "Your full name is ";

        for (String name : names) {
            outName += name + " ";
        }

        System.out.println(outName.trim());


//        System.out.println("Your full name is " + names[0] + " " + names[names.length-1]);

        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter a second number");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers entered is " + (num1 + num2));
    }

    public static void loops() {
        boolean isRaining = true;
        boolean armsHurt = true;

        while (isRaining) {
            System.out.println("Hold up umbrella");

            if (armsHurt) {
                System.out.println("My arms are too tired, I'd rather get rained on");
                break;
            }
        }

        int i = 0;

        while (i < 10) {

            System.out.println("1 = " + i);


        }
    }

    public static void exercise1() {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("=============================");

        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

//          i and j example
        for (int k = 0, l = 10; k < l; k++, l--) {
            System.out.println("k = " + k + ", " + "l = " + l);
        }

        System.out.println("=============================");

        int k = 0, l = 10;
        while (k<l) {
            System.out.println("k = " + k + ", " + "l = " + l);
            k++;
            l--;
        }

//        sum example
        int sum = 0;
        for (int m = 0; m < 10; sum += m, m++) {}
        System.out.println(sum);

        sum = 0;
        while (i < 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    private void exercise2() {
        int x = 10;
        while (x > 0) {
            System.out.print(x-- + " ");
        }
        System.out.println("We have lift off");

        x = 10;
        while (x > 0) {
            System.out.println("x is " + x);
            x--;
        }

        int sum = 0;
        for (int i = 0; i < 10; sum += i++) {
            System.out.println("Sum is " + sum);
        }
}
}

