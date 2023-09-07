public class Main {
    public static void main(String[] args) {
        System.out.println("Cyles Part 1");


        System.out.println("Task 1");
        /**
         * Выводим последовательность чисел от 1 до 10
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        /**
         * Выводим последовательность чисел от 10 до 1
         */
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);        }

        System.out.println("Task 3");
        /**
         * Выводим последовательность четных чисел в диапазоне
         * от 0 до 17. 0 также является четным числом (по правилам математики)
         */
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }

        System.out.println("Task 4");
        /**
         * Выводим все числа от 10 до - 10 (от бОльшего к меньшему)
         */
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        /**
         * Выводим все високосные года с 1904 по 2096 год в заданном формате.
         */
        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Task 6");
        /**
         * Выводим последовательность чисел с шагом 7
         * в диапазоне от 7 до 98
         * Так как в задании числа выведены в строчку, выведем тоже в строчку
         */
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println(" "); // чтоб переключило Task 7 на след.строку
        System.out.println("Task 7");
        /**
         * Выводим последовательность чисел (прогрессию)
         * от 1 до 512. Число, на которое умножаем 2
         * Результат выводим в строчку
         */
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println("Task 8");
        /**
         * Посчитать сумму годовых накоплений, при откладывании 29000 в месяц.
         * Вывесвести сумму в нужном формате
         */
        int deposit = 29000;
        int totalDeposit = 0;
        for (int i = 1; i <= 12; i ++) {
            totalDeposit = totalDeposit + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей.");
        }

        System.out.println("Task 9");
        /**
         * Посчитать сумму вклада, при условии, что ставка 12 процентов в год (1 процент в месяц)
         * Результат вывести в нужном формате.
         * Логику задаем следующую: человек сделал вклад, это нулевая дата.
         * Уже в конце первого месяца будут начислены проценты на первоначальный вклад.
         * А далее, проценты будут насчитываться на каждый последующий транш.
         */

        int dep = 29000;
        int totalDep = 0;
        for (int i = 1; i <= 12; i ++) {
            totalDep = totalDep + dep;
            totalDep = totalDep + totalDep/100;
            System.out.println("Через месяц " + i + ", сумма накоплений равна " + totalDep + " рублей.");
        }

        System.out.println("Task 10");
        /**
         * Выводим таблицу умножения. Двойку умножаем от 1 до 10
         */
        int base = 2; // базовое число
        int result = 0; // результирующее число
        for (int i = 1; i <= 10; i++) {
            result = base * i;
            System.out.println(base + " * " + i + " = " + result);
        }
    }
}