package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        reader.close();
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        while (fis.available() > 0)
        {
            byte mas[] = new byte[fis.available()];
            fis.read(mas);
            fos.write(numbers(mas));

        }
        fis.close();
        fos.close();
    }

    static byte[] numbers(byte mas[])
    {
        StringBuilder stringBuilder = new StringBuilder();
        String volume[] = new String(mas).split(" ");
        byte result[];
        long array[] = new long[volume.length];
        for (int i = 0; i < volume.length; i++)
        {
            array[i] = Math.round(Double.valueOf(volume[i]));
        }
        for (long val : array)
        {
            stringBuilder.append(val);
            stringBuilder.append(" ");
        }
        result=stringBuilder.toString().getBytes();
        return result;
    }
}
