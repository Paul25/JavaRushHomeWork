package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        int countSpace = 0;
        int countSymbols = 0;
        double result = 0.0;
        if(args.length>0){
            FileInputStream fis=new FileInputStream(args[0]);
            while(fis.available()>0){
                countSymbols++;
                int value=fis.read();
                if(value==Integer.valueOf(' ')){
                    countSpace++;
                }
            }
            fis.close();
        }
        if(countSymbols==0){

        }
        else{
            result=(double) countSpace/countSymbols * 100;
        }
        System.out.printf("%.2f", result);
    }
}
