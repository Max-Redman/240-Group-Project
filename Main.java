import javax.swing.*;
import java.awt.event.*;



public class Main {




        public static void main(String[] args) {
            // create and set up the window.
            JFrame frame = new JFrame("Menu Example!");

            // make the program close when the window closes
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

            // add a button object
            JButton button = new JButton("Button 1");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello");
                }
            });
            frame.getContentPane().add(button);//frame is where the content goes

            JButton button2 = new JButton("Button 2");
            //button2.addActionListener(new ButtonListener(2));
            //frame.getContentPane().add(button2);


            // display the window.
            frame.pack();
            frame.setVisible(true);



        }

}