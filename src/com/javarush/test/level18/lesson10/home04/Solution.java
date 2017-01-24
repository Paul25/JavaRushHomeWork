package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte mass1[] = new byte[fis1.available()];
        byte mass2[] = new byte[fis2.available()];
        while (fis2.available() > 0)
        {
            fis2.read(mass2);
        }
        while (fis1.available() > 0)
        {
            fis1.read(mass1);
        }
        fis1.close();
        FileOutputStream fos = new FileOutputStream(file1);
        byte full[] = new byte[mass1.length + mass2.length];
        System.arraycopy(mass2, 0, full, 0, mass2.length);
        System.arraycopy(mass1, 0, full, mass2.length, mass1.length);
        fos.write(full);
        reader.close();

        fis2.close();
        fos.close();

    }
}
