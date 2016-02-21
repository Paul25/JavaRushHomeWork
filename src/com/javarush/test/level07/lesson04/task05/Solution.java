package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] a = new int[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(r.readLine());
        }
        int[] b1 = new int[10];
        int[] b2 = new int[10];
        for (int j = 0; j < a.length / 2; j++)
        {
            b1[j] = a[j];
        }
        for (int m = 0; m < b2.length; m++)
        {

                    System.arraycopy(a, 10, b2, 0, 10);

            System.out.println(b2[m]);
        }
    }
}