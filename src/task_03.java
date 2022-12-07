//Реализовать простой калькулятор

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Калькулятор принимает 1-ое число, 2-ое число, знак операции (+ - * /),
        float a = getFloat("Input first number: ");
        float b = getFloat("Input second number: ");
        while (true) {
            System.out.print("Input sign (+, -, *, /): ");
            switch (input.nextLine()) {
                case ("+"):
                    System.out.println(a + " + " + b + " = " + (a + b));
                    return;
                case ("-"):
                    System.out.println(a + " - " + b + " = " + (a - b));
                    return;
                case ("*"):
                    System.out.println(a + " * " + b + " = " + (a * b));
                    return;
                case ("/"):
                    System.out.println(a + " / " + b + " = " + (a / b));
                    return;
                default:
                    System.out.println("Input error. Try again.");
            }
        }
//        input.close();
    }

    public static float getFloat(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        while (!input.hasNextFloat()) {
            System.out.println("Input error. Try again.");
            System.out.print(prompt);
            input.next();
        }
        return input.nextFloat();
    }
}

