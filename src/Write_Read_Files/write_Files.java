package Write_Read_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class write_Files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("E:\\Ky2\\JAVA_practice\\Notepad\\MVC_Chuan.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.print("Nhap text vao Document: ");
            String text = sc.next();


            bufferedWriter.write(text);
            System.out.println("Them vao thanh cong");

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        BufferedWriter bufferedWriter = new BufferedWriter(file);
//        System.out.print("Nhap text vao Document: ");
//        String text = sc.next();


    }
}
