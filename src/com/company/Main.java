package com.company;

import java.util.Scanner;

public class Main {
    /* task69
     * Начав тренировки, лыжник в первый день пробежал 10 км. Каждый следующий день он увеличивал пробег на 10 % от пробега предыдущего дня. Определить:
а) пробег лыжника за второй, третий, …, десятый день тренировок;
б) суммарный путь лыжника за первые 7 дней тренировок;
в) в какой день он пробежит больше 20 км;
г) в какой день суммарный пробег за все дни превысит 100 км.
     */
    public static void main(String[] args) {
        double firstDay = 10;

        for (int i = 2; i <= 10; i++) {
            firstDay *= 1.1;
            System.out.print("Number of day: " + i + " ,Distance:" + firstDay + "\n");
        }
    }
}

class B {
    public static void main(String[] args) {
        b();
        /*
         * суммарный путь лыжника за первые 7 дней тренировок;
         */
    }


    private static void b() {
        double sum = 10;
        double firstDay = 10;
        for (int i = 2; i <= 7; i++) {
            firstDay *= 1.1;
            sum += firstDay;
            System.out.print("Number of day: " + i + " ,Distance:" + firstDay + "\n");

        }
    }


}
class C {
    public static void main(String[] args) {
        c();
        /*в) в какой день он пробежит больше 20 км;*/
    }
    private static void c() {

        int inWhichDay =1;
        double firstDay = 10;
        while (firstDay<20) {
            firstDay *= 1.1;
            inWhichDay += 1;
        }
        System.out.print("\nDay:  " + inWhichDay);


    }
}

class D {
    public static void main(String[] args) {
        d();
        /*г) в какой день суммарный пробег за все дни превысит 100 км.*/
    }
    private static void d() {

        double sum = 10;
        int day = 1;
        double firstDay = 10;
        while (sum <= 100) {
            firstDay *= 1.1;
            sum += firstDay;
            day += 1;
        }
        System.out.print("\nDay:  " + day);
    }
}



class task119 {
    public static void main(String[] args) {
        Task119();
        /*Найти сумму всех n-значных чисел, кратных k (1 ≤ n ≤ 4).*/

    }
    private static void Task119() {
        Scanner console = new Scanner(System.in);
        System.out.println("Input n from 1 to 4 = ");
        int n = console.nextInt();

        if(n < 1 || n > 4) {
            System.out.println("n should be within the following range: [1;4] ");
        }
        else {
            System.out.println("k = ");
            int k = console.nextInt();
            int sum = 0 ;
            for (int i  =(int) Math.pow(10,n -1 ); i<(int)Math.pow(10,n);i++) {
                if (i % k == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
class task94 {
    public static void main(String[] args) {
        Task94();
        /*Известна масса каждого предмета из некоторого набора предметов. Определить среднюю массу.*/

    }

    private static void Task94() {
        Scanner console = new Scanner(System.in);
        double sum = 0.0;
        double average = 0;
        int n;
        System.out.println("\nInput n : " );
        n = console.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter weight of item : " + i);
            double cur;
            cur = console.nextInt();
            sum += cur;
            average = sum/n;
        }
        System.out.println("\nSum = \n" + sum);
        System.out.println("\nAverage = \n" + average);
    }
}
class task144 {
    public static void main(String[] args) {
        Task144();
        /*Составить программу-генератор чисел Пифагора, то есть чисел, удовлетворяющих условию а2 + b2 = с2.
         * Определить количество различных троек таких чисел для с < 25.
         */

    }
    private static void Task144() {
        int lineOfSearch = 25;
        boolean foundCheck = false;
        for (int i = 1; i <= lineOfSearch; i++) {   // c
            for (int j = 1; j <= lineOfSearch; j++) {    // a
                for (int k = 1; k <= lineOfSearch; k++) {     //b
                    if (i*i == j*j + k*k) {
                        System.out.println(i + "^2 = " + j + "^2 + " + k + "^2");
                        foundCheck = true;
                        break;
                    }
                }
                if (foundCheck)
                    break;
            }
            foundCheck = false;
        }
    }
}

class task44 {
    public static void main(String[] args) {
        Task44();
        /*
         * Даны натуральные числа n и k. Вычислить: sqrt(k+sqrt(2k+...+sqrt(k(n-1)+sqrt(kn))))
         */

    }

    private static void Task44() {
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input n and k = ");
        int n = in.nextInt(), k = in.nextInt();
        double sum = 0;
        func(counter, n, k, sum);
    }

    public static void func(int counter, int n, int k, double sum) {
        sum = Math.sqrt(sum + ((double) k * n));
        n--;
        if (n >= 1) {
            counter++;
            func(counter, n, k, sum);
        } else
            System.out.println("Sum of sqrt -> " + sum);
    }
}