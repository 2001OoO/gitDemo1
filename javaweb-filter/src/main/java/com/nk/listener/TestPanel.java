package com.nk.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.setLayout(null);

        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.red);

        panel.setBounds(50,50,300,300);
        panel.setBackground(Color.black);

        frame.add(panel);

        frame.setVisible(true);

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("打开窗口");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭ing");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("关闭ed");
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
