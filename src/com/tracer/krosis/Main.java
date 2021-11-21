package com.tracer.krosis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите год рождения ");
        int age = sc.nextInt();
        int x = 2021;
        System.out.println(" Ваш возвраст " + (x - age));
        System.out.println(" Введите месяц и день рождения ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        if (a == 1) {
            System.out.println("ваш месяц январь ");
            if (d <= 20) {
                System.out.println("ваш знак козерог ");
            } else {
                System.out.println("ваш знак водолнй ");
            }
        }
        if (a == 2) {
            System.out.println("ваш месяц февраль ");
            if (d <= 19) {
                System.out.println("ваш знак водолней ");
            } else {
                System.out.println("ваш знак рыба ");
            }
        }
        if (a == 3) {
            System.out.println("ваш месяц март ");
            if (d <= 20) {
                System.out.println("ваш знак рыба ");
            } else {
                System.out.println("ваш знак овен ");
            }
        }
        if (a == 4) {
            System.out.println("ваш месяц апрель ");
            if (d <= 20) {
                System.out.println("ваш знак овен ");
            } else {
                System.out.println("ваш знак телец ");
            }
        }
        if (a == 5) {
            System.out.println("ваш месяц май ");
            if (d <= 21) {
                System.out.println("ваш знак телец ");
            } else {
                System.out.println("ваш знак близнец ");
            }
        }
        if (a == 6) {
            System.out.println("ваш месяц июнь ");
            if (d <= 21) {
                System.out.println("ваш знак близнец ");
            } else {
                System.out.println("ваш знак рак ");
            }
        }
        if (a == 7) {
            System.out.println("ваш месяц июль ");
            if (d <= 22) {
                System.out.println("ваш знак рак ");
            } else {
                System.out.println("ваш знак лев ");
            }
        }
        if (a == 8) {
            System.out.println("ваш месяц август ");
            if (d <= 23) {
                System.out.println("ваш знак лев ");
            } else {
                System.out.println("ваш знак дева ");
            }
        }
        if (a == 9) {
            System.out.println("ваш месяц сентябрь ");
            if (d <= 23) {
                System.out.println("ваш знак дева ");
            } else {
                System.out.println("ваш знак весы ");
            }
        }
        if (a == 10) {
            System.out.println("ваш месяц октябрь ");
            if (d <= 23) {
                System.out.println("ваш знак весы ");
            } else {
                System.out.println("ваш знак скорпион ");
            }
        }
        if (a == 11) {
            System.out.println("ваш месяц ноябрь ");
            if (d <= 22) {
                System.out.println("ваш знак скорпионг ");
            } else {
                System.out.println("ваш знак козерог ");
            }
        }
        if (a == 12) {
            System.out.println("ваш месяц декабрь ");
            if (d <= 20) {
                System.out.println("ваш знак козерог ");
            } else {
                System.out.println("ваш знак водолнй ");
            }
        }

    }
}