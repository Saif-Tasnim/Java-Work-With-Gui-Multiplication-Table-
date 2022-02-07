package Multiplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {
    Container container;
    JLabel img, text;
    JButton clear;
    JTextArea ta;
    JTextField tf;
    ImageIcon image = new ImageIcon("C:/Users/ABCD/OneDrive/Desktop/6-Times-Table-Chart-OSMO(resize)).png");
    Font font = new Font("Times New Roman", Font.BOLD, 22);


    MultiplicationTable() {
        setDefaultCloseOperation(3);
        setBounds(20, 20, 1000, 1000);
        setTitle("Multiplication Table");

// Container
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.cyan);


// Image Section
        img = new JLabel(image);
        img.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());


        // J Label
        text = new JLabel("Enter A Number : ");
        text.setBounds(40, 450, 200, 80);
        text.setFont(font);


        // Text Field
        tf = new JTextField();
        tf.setBounds(240, 480, 100, 30);
        tf.setFont(font);
        tf.setToolTipText("Enter a valid Intezar");
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.MAGENTA);


//Button Side
        clear = new JButton("Clear");
        clear.setBounds(240, 540, 120, 30);
        clear.setBackground(Color.YELLOW);
        clear.setForeground(Color.BLACK);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        clear.setCursor(cursor);
        clear.setFont(font);

// TextArea
        ta = new JTextArea();
        ta.setBounds(630, 240, 300, 350);
        ta.setBackground(Color.cyan);
        ta.setFont(font);
        ta.setVisible(false);


// Action Listener TextFiled
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(tf.getText());
                    ta.setText("  Multiplication Of  " + num + "\n\n");
                    for (int i = 1; i <= 10; i++) {
                        int multiply = i * num;

                        ta.append("     " + String.valueOf(num) + " X " + String.valueOf(i) + " = " + String.valueOf(multiply) + "\n");
                    }

                    ta.setVisible(true);
                } catch (Exception ex) {
                    ta.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Enter a Valid Integer");
                }
            }
        });


        // Action Listener Button

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ta.setVisible(false);
            }
        });


// add components to container
        container.add(img);
        container.add(text);
        container.add(tf);
        container.add(ta);
        container.add(clear);


        double i = image.getIconWidth();
        double j = image.getIconHeight();

        System.out.println(i);
        System.out.println(j);


    }

    public static void main(String[] args) {
        MultiplicationTable multi = new MultiplicationTable();
        multi.setVisible(true);

    }
}
