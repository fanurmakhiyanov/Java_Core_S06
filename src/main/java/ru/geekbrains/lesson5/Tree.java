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
    }
}
