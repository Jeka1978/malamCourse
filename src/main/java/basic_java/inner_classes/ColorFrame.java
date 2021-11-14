package basic_java.inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {


    public ColorFrame(final AtomicInteger atomicInteger) throws HeadlessException {






        JButton button = new JButton("click me");
        getContentPane().add(button, BorderLayout.NORTH);

        button.addActionListener(e -> {
            System.out.println(atomicInteger.incrementAndGet());
        });
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new ColorFrame(new AtomicInteger(10));
    }
}
