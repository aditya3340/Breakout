package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GamePlay gamePlay = new GamePlay();
       //For Java frame
        JFrame obj = new JFrame();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BreakOut Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        obj.add(gamePlay);
    }
}
