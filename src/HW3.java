import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

    //        Задача №1

    // Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на
    // ваш выбор и вывести следующие строки:
    // a == b - если переменные равны
    // a < b - если переменная a меньше b
    // a > b - если переменная b меньше a

        Scanner sc = new Scanner(System.in);
        System.out.println("Whats the a: \n");
        int a = sc.nextInt();
        System.out.println("Whats the b: \n");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A is equal to B");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }


    // Задача №2

    // Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и
        // вывести следующие строки:

    // больше 10 - если переменная больше 10

        if (a > 10) {
            System.out.println("A is greater than 10");
        }
    // меньше 100 - если переменная меньше 100

        if (a < 100) {
            System.out.println("A is less than 100");
        }
    // результат деления на 2 больше 20 - если это соответствует истине

        if (a / 20 > 20) {
            System.out.println("Still greater than 20");
        }
    // значение переменной между 5 и 40 включительно - если это правда

        if ((a >= 5) && (a <= 40)) {
            System.out.println("Between 5 and 40");
        } else // значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
            {
            System.out.println("Higher than 40 or lower than 5");
        }

        //Экстра задача
        //
        //Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и
        // вывести следующие строки:
        //maybe a and b are even - если сумма переменных четная

        if ((a + b) % 2 == 0) {
            System.out.println("The sum of A + B is even");
        } //some variable is odd - если сумма переменных нечетная

        else if ((a + b) % 2 != 0) {
            System.out.println("The sum is not even");
        }
    }
}
