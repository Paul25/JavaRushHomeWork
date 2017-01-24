package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();
        FileOutputStream os = new FileOutputStream(new File(file1));
        FileInputStream fis2 = new FileInputStream(new File(file2));
        FileInputStream fis3 = new FileInputStream(new File(file3));
        byte mass[] = new byte[fis2.available()];
        fis2.read(mass);
        byte mass2[]=new byte[fis3.available()];
        fis3.read(mass2);
        os.write(mass);
        os.write(mass2);
        os.close();
        fis2.close();
        fis3.close();

    }
}
