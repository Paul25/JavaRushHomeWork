package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

//        FileInputStream in=new FileInputStream(reader.readLine());
String s="exit";

        while (!(s.equals("exit")))
        {
            FileOutputStream out=new FileOutputStream(reader.readLine());
            System.out.println(out);
        }

    }
}
