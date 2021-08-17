package ru.geekbrains.lesson.eight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\WorkDir\\LessonEight\\src\\test");
        if (!file.exists()) {
            System.out.println("Директория не существует.");
            if (file.mkdirs()) {
                System.out.println("Директория успешно создана.");
            } else {
                System.out.println("Не удалось создать директорию.");
            }
        } else {
            System.out.println("Директория существует.");
        }

        try {
            FileInputStream fileOneStream = new FileInputStream("D:\\WorkDir\\LessonEight\\src\\test\\test_file1.txt");
            FileInputStream fileTwoStream = new FileInputStream("D:\\WorkDir\\LessonEight\\src\\test\\test_file2.txt");
            InputStreamReader fileOneRead = new InputStreamReader(fileOneStream, StandardCharsets.UTF_8);
            InputStreamReader fileTwoRead = new InputStreamReader(fileOneStream, StandardCharsets.UTF_8);


            int i = -1;

            while ((i = fileOneStream.read()) != -1) {
                System.out.print((char) i);
            }
            while ((i = fileTwoStream.read()) != -1) {
                System.out.print((char) i);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
            /**
            inputStreamReader.close();
            fileInputStream01.close();
            System.out.println("\n*** Чтение файла завершено. ***\n");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            FileOutputStream fileOutputStream01 = new FileOutputStream("C:\\sandbox\\sample_output.txt");
            byte[] buf = str01.getBytes(StandardCharsets.UTF_8);
            fileOutputStream01.write(buf, 0, buf.length);
            fileOutputStream01.close();
            System.out.println("Данные успешно записаны в файл (1)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}