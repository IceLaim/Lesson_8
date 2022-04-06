package com.geekbrains.Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork8  extends JFrame {
    private int counter = 0;

    public HomeWork8() {

        setTitle("Счётчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 250);

        Font font = new Font("Times New Roman", Font.BOLD, 40);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView, BorderLayout.CENTER);

        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);
        JButton inctenmentButton = new JButton("+10");
        add(inctenmentButton, BorderLayout.SOUTH);
        JButton dectenmentButton = new JButton("-10");
        add(dectenmentButton, BorderLayout.SOUTH);
        JButton clearButton = new JButton("CLEAR");
        add(clearButton, BorderLayout.NORTH);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == inctenmentButton) {
                    counter += 10;
                } else if (e.getSource() == dectenmentButton) {
                    counter -= 10;
                } else if (e.getSource() == clearButton) {
                    counter = 0;
                }
                refreshCounterView(counterView);
            }
        };

        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        inctenmentButton.addActionListener(actionListener);
        dectenmentButton.addActionListener(actionListener);
        clearButton.addActionListener(actionListener);
        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new HomeWork8();
    }
}
