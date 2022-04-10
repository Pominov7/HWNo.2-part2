package com.company;

import java.util.Scanner;

public class SecondToHMS {
    public static void main(String[] args) {
        // 1. ввод данных и объявление переменой sec
        Scanner in = new Scanner(System.in);
        //26373514 секунд до Нового года на часах у Деда Мороза, вводим
        System.out.print("Введите кол-во секунд: ");
        int sec = in.nextInt();
        in.close();// закрываем сканер по окончанию чтения

        // 2. решение
        int days = sec / (3600 * 24);//вычисляем дни до нового года
        int hour = sec / 3600 % 60;//вычисляем часы до нового года
        int min = sec / 60 % 60;//вычисляем минуты до нового года
        int second = sec % 60;//вычисляем секунды до нового года

        // 3. вывод ответа
        System.out.print("До нового года осталось:" + days + " дней,");
        System.out.print(hour + " часов, ");
        System.out.print(min + " минут, ");
        System.out.print(second + " секунды ");

    }
}
