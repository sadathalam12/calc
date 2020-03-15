
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
public class SubtractListener implements ActionListener {
 private Calculator calc; 
    private JTextField input; 
    private JTextField output;
    private JButton button; 
    public SubtractListener(Calculator calc, JTextField input, JTextField output, JButton button){
        this.calc = calc; 
        this.input = input; 
        this.output = output; 
        this.button = button; 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(output.getText()); 
        int y = Integer.parseInt(input.getText());
        if(y != (int)y){
            input.setText("0");
        }
        int difference= calc.subtract(x, y);
        output.setText(""+difference);
        input.setText("0");
       
    }
    
    }
    

