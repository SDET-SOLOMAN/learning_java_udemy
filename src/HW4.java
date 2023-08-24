import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {

        //        Задача №1
        // Необходимо вывести числа от 0 до 15.

        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        // Задача №2
        // Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести
        // результат возведения в степень.

        for (int i = 1; i < 1000; i *= 5) {
            System.out.println(i * 5);
        }

        // Задача №3
        // Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        // Реализовать 2 варианта:
        // использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        // без использования конструкции if (шаг цикла на ваше усмотрение).

        // # 1

        for (int i = 40; i < 61; i += 4) {
            System.out.println(i);
        }

        // # 2

        for (int i = 40; i < 61; i ++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }


        // Задача №4
        // Дан массив:

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        //необходимо вывести сумму всех значений массива.

        for (int k : array) {
            sum += k;
        }
        System.out.println(sum);

        // Задача №5
        // Дан массив:
        int[] ar = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int ma_X = ar[0];
        // необходимо вывести максимальное значение массива.
        for (int j : ar) {
            if (ma_X < j) {
                ma_X = j;
            }
        }
        System.out.println(ma_X);

        // Задача №6
        // Дан массив:
        int[] ar2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        int mi_N = ar2[0];
        // необходимо вывести максимальное значение массива.
        for (int k : ar2) {
            if (mi_N > k) {
                mi_N = k;
            }
        }
        System.out.println(mi_N);


        // Задача №7
        // Дан массив:
        int[] ar3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // необходимо вывести среднее арифметическое всех значений массива.
        double median_num = 0;

        for (int i = 0; i < ar3.length; i ++) {
            median_num += ar3[i];
        }
        System.out.println("The median is " + median_num / ar3.length);

        // Задача №8
        // Дан массив произвольных целых чисел.

        int[] ar4 = {-1, 2, -3, 4, 5, 6, -7, 8, -9};
        int positive_nums = 0;
        int negative_num = 0;
        // необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.
        for (int i = 0; i < ar3.length; i ++) {
            if (ar4[i] < 0) {
                negative_num += 1;
            } else {
                positive_nums += 1;
            }
        }
        System.out.println("The total num of positive nums is " + positive_nums + " and total num of negative is " + negative_num);

        //Задача №9
        // Дан массив произвольных целых чисел.
        // проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее
        // число больше предыдущего.
        int[] sorting_ar = {1, 2, 3, 4, 6, 7, 8};
        int num1 = sorting_ar[0];

        for (int i = 0; i < sorting_ar.length; i ++) {
            if (num1 != sorting_ar[i]) {
                System.out.println("This array is not sorted properly, this num is out of order: " + sorting_ar[i]);
                break;
            }
            num1 += 1;
        }

        // Задача №10

        // Дано положительное целое число n.
        // создать ряд из n чисел так, чтобы:
        // первые два элемента ряда равнялись 1
        // любой другой элемент ряда был суммой двух предыдущих.
        // Пример:
        // 1, 1, 2, 3, 5, 8, …

        // ver 1

        int[] fibOne = new int [20];
        for(int i = 0; i < fibOne.length; i ++){
            if(i == 0 || i == 1) {
                fibOne[i] = 1;
            } else {
                fibOne[i] = fibOne[i - 1] + fibOne[i - 2];
            }
        }

        // ver 2

        int fib1 = 0;
        int fib2 = 1;

        for(int i = 0; i < 19; i ++) {
            int temp = fib2;
            System.out.println(fib2);
            fib2 = fib1 + fib2;
            fib1 = temp;
        }
        System.out.println(fib2);
        System.out.println(Arrays.toString(fibOne));
    }
}

