package ru.geekbrains.lesson5;

import java.io.File;
import java.io.FileInputStream;

public class Tree {
    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent); // рисуем отступ
        if (isLast) {
            System.out.print("└");
            indent += "  ";
        }
        else {
            System.out.print("├");
            indent += "│  ";
        }
        System.out.println(file.getName());
        File[] files = file.listFiles(); //метод listFiles вернет список sub-файлов
        if (files == null)
            return;

        int subDirTotal = 0;
        for ( int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
                subDirTotal++;
        }

        int subDirCounter = 0;
        for ( int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                print(files[i], indent, subDirCounter == subDirTotal - 1);
                subDirCounter++;
            }
        }
    }
}
