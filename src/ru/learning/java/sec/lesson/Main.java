package ru.learning.java.sec.lesson;

import java.security.KeyStore;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("TASK 1");
        //changenum();
        System.out.println();

        System.out.println("TASK 2");
        //massx3();
        System.out.println();

        System.out.println("TASK 3");
        //mulby2();
        System.out.println();

        System.out.println("TASK 4");
        //square();
        System.out.println();

        System.out.println("TASK 5");
        //minandmax();
        System.out.println();

        System.out.println("TASK 6");
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 40, 5 };
        System.out.println(CheckBalance(mass));
        System.out.println();

        System.out.println("TASK 7");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }

    public static boolean negorpos(int x1) {


        if (x1 >= 0) {
            return false;
        } else {
           return true;
        }
    }

    public static void changenum() {
        int[] binar = {1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0};
        int i;
        for (i = 0; i != binar.length; i++) {
            if (binar[i] == 0) {
                binar[i] = 1;
            } else {
                binar[i] = 0;
            }
            System.out.println("binar [" + i + "] = " + binar[i]);
        }
    }

    public static void massx3() {
        int[] mass = new int[8];
        int i;
        for (i = 0; i != mass.length; i++) {
            mass[i] = i;
            mass[i] = mass[i] * 3;
            System.out.println("mass [" + i + "] = " + mass[i]);
        }
    }

    public static void mulby2() {
        int[] mul = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for (i = 0; i != mul.length; i++) {
            if (mul[i] < 6) {
                mul[i] = mul[i] * 2;
            }
            System.out.println("mul [" + i + "] = " + mul[i]);
        }
    }

    public static void square() {
        int[][] arrarr = new int[5][5];
        int num = 3;
        int i;
        int j;
        for (i = 0; i != 5; i++) {
            for (j = 0; j != 5; j++) {
                arrarr[i][j] = num;
                num++;
            }
        }

        for (i = 0; i != 5; i++) {
            for (j = 0; j != 5; j++) {
        if (i == j) {
            arrarr [i][j] = 1;
        }
            System.out.println("arr [" + i + "] [ " + j + " ] = " + arrarr[i][j]);
            }
        }
    }

    public static void minandmax() {
        int[] mass = {3, 9, 8, 20, 0, 1, 4, 7, -3, 78, 5};
        int i;
        int min = 0;
        int max = 0;
        for (i = 0; i != mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min ) {
                min = mass[i];
            }
        }
        for (i = 0; i != mass.length; i++) {
            System.out.println("mass [" + i + "] = " + mass[i]);
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    static boolean CheckBalance (int [] IArray) {
        int sum1 = 0;
        int sum2 = 0;
        int i;
        boolean check;
        for (i = 0; i <= 8; i++) {
            sum1 = IArray[i] + sum1;
        }
        for (i = 9; i != IArray.length; i++) {
            sum2 = IArray[i] + sum2;
        }
        if (sum1 == sum2) {
            check = true;
        }
        else {
            check = false;
        }
        return check;
    }  // Код придумал сам, посмотрел видео по Синтаксису. Момент с передвижной границей не учел

    //Сам не догадался, смотрел видео

    static void RightShift (int[] InputArray) {
        int buffer = InputArray[0];
        InputArray [0] = InputArray[InputArray.length - 1];

        for (int j = 1; j < InputArray.length - 1; j++) {
            InputArray [InputArray.length - j] = InputArray [InputArray.length - j - 1];
        }
        InputArray [1] = buffer;
    }

    static void leftShift (int[] InputArray) {
        int buffer = InputArray[InputArray.length - 1];
        InputArray[InputArray.length - 1] = InputArray [0];

        for (int j = 1; j < InputArray.length - 1; j++) {
            InputArray [j-1] = InputArray [j];
        }
        InputArray [InputArray.length - 2] = buffer;
    }
    static void shiftArray(int[] array, int shift) {
        if (negorpos(shift)) {
            for (int i = 0; i > shift; i--) {
                leftShift(array);
            }
        } else {
            for (int i = 0; i < shift; i++) {
                RightShift(array);
            }
        }
    }
}
