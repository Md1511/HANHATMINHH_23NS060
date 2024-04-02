package Lambdas_Expresstion;

import javax.swing.*;
import java.awt.*;

public class Lambdas {
    public static void main(String[] args) {
        Frame frame = new Frame("Event Handling Example");

        Button button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);

        // Sử dụng lambda expression để xử lý sự kiện khi nút được nhấn
        button.addActionListener(e -> {
            System.out.println("Button clicked");
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
