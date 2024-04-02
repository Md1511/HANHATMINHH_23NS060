package Write_Read_Files;

import java.io.*;

public class read_Files {
    public static void main(String[] args) {
        File file1 = new File("E:\\Ky2\\JAVA_practice\\Notepad\\MVC_Chuan.txt");
        try {
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
//    File file = new File("E:\\Ky2\\JAVA_practice\\Notepad\\MVC_Chuan.txt");
//
//    FileReader fileReader;
//
//    {
//        try {
//            fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while((line = bufferedReader.readLine()) != null )
//            {
//                System.out.println(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
