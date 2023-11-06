package org.example;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {


        WorkData parsData = new WorkData(); // Создается объект класса WorkData
        String newFileName = null; // Инициализация переменной
        WriteFile writeFile = new WriteFile(); // Создается объект класса WriteFile

        HashMap<String, Object> data = parsData.parsPersonData(); // Инициализация словаря
        while (data.size() != 6) {
            try {
                throw new ExceptionData();
            } catch (ExceptionData e) {
                data = parsData.parsPersonData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл

    }


}
