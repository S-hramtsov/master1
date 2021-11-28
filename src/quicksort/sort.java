package quicksort;

import java.util.Arrays;

public class sort {
    public static void QuickSort (int[] array, int low, int high) {
        if (array.length == 0)
            return; // завершаем выполнение, если длинна массива равна 0

        if (low >= high)
            return; // завершаем по окончанию деления

        // выбираем опорный элемент
        int centre = low + (high - low) / 2;
        int dot = array[centre];

        //делим на подмассивы
        int a = low, b = high;
        while (a <= b) {
            while (array[a] < dot) {
                a ++;
            }
            while (array[b] > dot) {
                b --;
            }
            if (a <= b) {   // алгоритм смены места чисел
                int change = array[a];
                array[a] = array[b];
                array[b] = change;
                a ++;
                b --;
            }
        }
        //вызов рекурсии для сортировки левой и правой части
        if (low < b)
            QuickSort(array, low, b);
        if (high > a)
            QuickSort(array, a, high);
    }

    // теперь выводим массив в методе
    public static void main(String[] args) {
        int[] centre = new int[99];
        for (int x = 0; x < centre.length; x++) {
            centre[x] = (int) (Math.random() * 99);
        }
        System.out.print("беспорядочный массив: \n" + Arrays.toString(centre));
        int low = 0;
        int high = centre.length - 1;
        QuickSort(centre, low, high);
        System.out.println("\nОтсортированный массив: \n" + Arrays.toString(centre));
    }
}