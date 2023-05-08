package com.company;

import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        // Указываем путь к директории с файлами
        File directory = new File("C:/Users/user/Desktop/files");

        // Получаем список файлов в директории
        File[] files = directory.listFiles();

        // Проходим по списку файлов
        for (File file : files) {
            if (file.isFile()) {
                String oldName = file.getName();
                // Удаляем префикс "[SW.BAND] " из имени файла
                String newName = oldName.replace("[SW.BAND] ", "");
                // Переименовываем файл
                file.renameTo(new File(directory, newName));
            }
        }
        System.out.println("Files have been renamed successfully.");
    }
}

