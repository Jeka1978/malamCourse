package basic_java.inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame() throws HeadlessException {

        JButton button = new JButton("click me");
        getContentPane().add(button, BorderLayout.NORTH);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(12);
            }
        };

        button.addActionListener(listener);


        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new ColorFrame();
    }
}
