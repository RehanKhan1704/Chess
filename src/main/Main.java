package main;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(700,1000));

        frame.setLocationRelativeTo(null);
        Board n;
        n = new Board();
        frame.add(n);
        frame.setVisible(true);


    }
}