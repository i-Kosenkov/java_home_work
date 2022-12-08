//Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input example (8? + ?3 = 99)\nYou can use +,-,* or /\nDon't forget to put a space");
        String[] arr = input.nextLine().split(" ");
        String[] new_arr = new String[arr.length];
        //В цикле используем второй массив для записи нового уравнения
        //Числа подбираются рандомно от 0 до 9 для каждого ? разное значение
        //Рандом дает возможность получать разные решения, перебор по порядку дает всегда одно и то же решение
        int count = 0;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains("?")) {
                    new_arr[i] = arr[i].replace("?", Integer.toString((int) (Math.random() * 10)));
                } else {
                    new_arr[i] = arr[i];
                }
            }
            switch (arr[1]) {
                case ("+"):
                    if (Integer.parseInt(new_arr[0]) + Integer.parseInt(new_arr[2]) == Integer.parseInt(new_arr[new_arr.length - 1])) {
                        System.out.println(String.join(" ", new_arr));
                        return;
                    }
                case ("-"):
                    if (Integer.parseInt(new_arr[0]) - Integer.parseInt(new_arr[2]) == Integer.parseInt(new_arr[new_arr.length - 1])) {
                        System.out.println(String.join(" ", new_arr));
                        return;
                    }
                case ("*"):
                    if (Integer.parseInt(new_arr[0]) * Integer.parseInt(new_arr[2]) == Integer.parseInt(new_arr[new_arr.length - 1])) {
                        System.out.println(String.join(" ", new_arr));
                        return;
                    }
                case ("/"):
                    if (Float.parseFloat(new_arr[0]) / Float.parseFloat(new_arr[2]) == Float.parseFloat(new_arr[new_arr.length - 1])) {
                        System.out.println(String.join(" ", new_arr));
                        return;
                    }
            }
            ++count;
            if (count == 10000000){
                System.out.println("Sorry men, i can't find decision ¯\\_(ツ)_/¯");
                return;
            }
        }
    }
}