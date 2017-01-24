package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        FileOutputStream os = new FileOutputStream(new File(reader.readLine()));

        while (fis.available() > 0)
        {
            byte mass[] = new byte[fis.available()];
            int count=fis.read(mass);
            for (int i = 0; i < mass.length/2; i++)
            {
                byte tmp = mass[i];
                mass[i] = mass[mass.length-i-1];
                mass[mass.length-i-1] = tmp;
            }
            os.write(mass,0,count);
        }
        reader.close();
        fis.close();
        os.close();

    }
}
