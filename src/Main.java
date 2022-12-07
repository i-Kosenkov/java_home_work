//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        if (input.hasNextFloat()) {
            float n = input.nextFloat();
            System.out.println("Triangular number = " + triangular(n));
            System.out.println("Factorial number = " + factorial(n));
        } else {
            System.out.println("Invalid input data. Try again.");
        }
        input.close();
    }

    static float triangular(float n) {
        return (1 + n) / 2 * n;
    }

    static float factorial(float n) {
        float result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}