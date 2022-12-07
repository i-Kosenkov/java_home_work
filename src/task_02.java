//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class task_02 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);

        //Заполняем список числами, сразу исключая числа кратные 2
        for (int i = 2; i <= 1000; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }
        //Что-то типа рекурсии, вызываем метод сдвигая каждый раз индекс значения в списке
        for (int n = 1; n <= arr.size(); n++) {
            simple_number(arr, n);
        }
        System.out.println(arr);
    }

    static List<Integer> simple_number(List<Integer> arr, int n) {
        //Проходим по списку удаляя значения кратные значению в списке arr[n]
        for (int j = n + 1; j < arr.size(); j++) {
            if (arr.get(j) % arr.get(n) == 0) {
                arr.remove(j);
            }
        }
        return arr;
    }
}
