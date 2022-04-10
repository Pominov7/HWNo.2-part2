package com.company;

import java.util.Scanner;

public class Firstname {
    public static void main(String[] args) {
        // 1. ввод данных и объявление переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество первоклассников в школе: ");
        int n = in.nextInt();
        System.out.print("Введите сколько процентов учеников имеют вес меньше 30 кг: ");
        int percent = in.nextInt();
        in.close();
        int pie = 1;

        // 2. решение
        //вычисляем сколько пакетов молока необходимо для n-го кол-ва первоклассников
        double packageMilk = Math.ceil((n * 0.2) / 0.9);
        //вычисляем сколько пирожков необходимо для n-го кол-ва первоклассников
        int sumPie = n * (pie + pie);

        // 3. вывод ответа в соответствии с выполненными условиями
        if (percent == 100) {
            //если введенный процент равен 100%, то выводим следующее:
            System.out.println(Math.round(packageMilk) + " пакета молока и " + sumPie + " пирожков");
            //если введенный процент равен 60%, то выводим следующее:
        } else if (percent == 60) {
            System.out.print(Math.round(Math.ceil((packageMilk * 60)) / 100) + " пакетов молока и ");
            System.out.print(((sumPie * 60 / 100) + (n * 40 / 100) + " пирожков"));
            //если введенный процент равен 1%, то выводим следующее:
        } else if (percent == 1 && n >= 100) {
            System.out.print(Math.round(Math.ceil(packageMilk / 100)) + " пакета молока и ");
            System.out.print(n / 100 + n + " пирожков");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}