package views;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Teste extends JFrame{
    private JFormattedTextField formattedTextField1;
    private JPanel panel1;

    public Teste(String title){
        super(title);

        JFormattedTextField formattedTextField = new JFormattedTextField(new SimpleDateFormat("dd-MM-yyyy"));
    }
}
