import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args) {
        
        // Create window (frame)
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button
        JButton button = new JButton("Click Me");

        // Add action when button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello! You clicked the button.");
            }
        });

        // Add button to the window
        frame.add(button);

        // Show the window
        frame.setVisible(true);
    }
}