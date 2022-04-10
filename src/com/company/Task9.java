package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // 1. ввод данных и объявление переменой num
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = in.nextDouble();// считали число
        in.close();// закрываем сканер по окончанию чтения

        // 2. решение
        long res = Math.round(num); //целая часть
        double fraction = num - res;//дробная часть
        // 3. вывод ответа в соответствии с выполненными условиями
        // Если дробная часть не 0, то введенное число имеет вещественную часть
        if (fraction != 0) {
            System.out.println("Имеет вещественную часть");
        // Если дробная часть есть, то введенное число имеет вещественную часть
        } else {
            System.out.println("Не имеет вещественную часть");
        }
    }
}
