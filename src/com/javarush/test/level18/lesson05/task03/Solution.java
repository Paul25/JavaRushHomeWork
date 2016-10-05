package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis1 = new FileInputStream(new File(reader.readLine()));
        FileOutputStream fos = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream fos2 = new FileOutputStream(new File(reader.readLine()));

        while (fis1.available() > 0)
        {
            if (fis1.available() % 2 == 0)
            {
                byte mas1[] = new byte[fis1.available() / 2];
                byte mas2[] = new byte[fis1.available() / 2];
                int count1 = fis1.read(mas1);
                int count2 = fis1.read(mas2);
                fos.write(mas1, 0, count1);
                fos2.write(mas2, 0, count2);
            } else
            {
                byte mas1[] = new byte[fis1.available() / 2 + 1];
                byte mas2[] = new byte[fis1.available() / 2];
                int count1 = fis1.read(mas1);
                int count2 = fis1.read(mas2);
                fos.write(mas1, 0, count1);
                fos2.write(mas2, 0, count2);

            }
        }
        reader.close();
        fis1.close();
        fos.close();
        fos2.close();

    }
}
