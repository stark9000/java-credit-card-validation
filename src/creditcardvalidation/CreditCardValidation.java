/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardvalidation;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author saliya
 */
public class CreditCardValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LookAndFeel W = new WindowsLookAndFeel();
                UIManager.setLookAndFeel(W);
            } catch (UnsupportedLookAndFeelException e) {
                JOptionPane.showMessageDialog(null, "critical error !");
                System.exit(0);
            }
            new ccv().setVisible(true);
        });
    }

}
