import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main extends JFrame {
    private JPanel jforma;
    private JTextField nameField;
    private JTextField passwordField;
    private JTextField emailField;
    private JButton ready;
    private JLabel password;
    private JLabel email;
    private JLabel name;
    private JTextArea resultArea;

    public Main() {
        setContentPane(jforma);
        setTitle("Trip");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

       ready.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String name = nameField.getText();
               String email = emailField.getText();
               String password = passwordField.getText();
           }
       });

    }

    public static void main(String[] args) {
        new Main();

        Trip.Start();
    }
}