import java.util.Scanner;

public class HW1and2 {
    public static void main(String[] args) {

        System.out.println("" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Поехали!!!\n");

        System.out.println("" +
                "____888888______________________________\n" +
                "____888888______________________________\n" +
                "___8888888888___________________________\n" +
                "__888888888888__________________________\n" +
                "__8888111188888_________________________\n" +
                "_888881111188888___11___________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111118888_11____________________\n" +
                "_8888881111118888_11___11__8888888______\n" +
                "_8888881111118888__1__11__88888888888___\n" +
                "_8888888111111888____11__8888888888888__\n" +
                "__888888111111888_111___88888888888888__\n" +
                "__8888888111118881111__888881111118888__\n" +
                "___888888811188881111_8888811111111888__\n" +
                "____8888888188881111188888111111118888__\n" +
                "_____88888888888111118888111111118888___\n" +
                "______888888888111118888811111188888____\n" +
                "______8888888881111188888888888888______\n" +
                "_____888888888811111888888888888________\n" +
                "____88888888888111118888888888__________\n" +
                "___88881111888811111888888888___________\n" +
                "__8888111111888111118888888888__________\n" +
                "_888881111118881111188811118888_________\n" +
                "_8888881111888811111881111118888________\n" +
                "_8888888118888811111888111188888________\n" +
                "__888888888888_1111888881188888_________\n" +
                "___8888888888___111_8888888888__________\n" +
                "____88888888_____1___88888888___________\n" +
                "_____888888___________888888____________\n" +
                "_______________________8888_____________\n");

        //    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
        //    и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и
        //    остато от деления. Также сделать проверку на четность этих переменных и вывести результат.
        int a = 10;
        int b = 20;
        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A / B = " + ((double)a / b));
        System.out.println("A % B = " + (a % b));

        //Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
        // половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
        //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными
        //Вывести на экран кому сколько пиастров полагается.
        //Дополнительное задание со звездочкой
        //Попробовать придумать как программа может проверить правильность дележа.

        int TotalTreassure;
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats the Treassure ammount \n");
        TotalTreassure = sc.nextInt();
        System.out.println("The treasure amount is $" + TotalTreassure);

        double half = TotalTreassure / 2;
        System.out.println("The captains share is $" + half);
        System.out.println("How many crew members in the ship? ");
        int TotalTeamMembers = sc.nextInt();
        double PerPerson = half / TotalTeamMembers;
        System.out.println("There are total of " + TotalTeamMembers + " crew members in the ship");
        System.out.println("The total treasure amount that goes to the crew is $" + half + "\n" +
                "which equals to $" + PerPerson + " per person");
        double CalculationChecker = (PerPerson * TotalTeamMembers) + half;
        System.out.println(CalculationChecker + " is the total");

//      Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом)
        String Smailik = "\uD83D\uDE01";
        System.out.println(Smailik);


    }
}
