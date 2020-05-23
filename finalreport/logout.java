/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;

import static java.lang.System.exit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SAKTHI
 */
public class logout {
    JFrame f1;
    logout()
    {
        f1=new JFrame();
                        JOptionPane pane=new JOptionPane("Did you like to Exit?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
                JDialog dialog=pane.createDialog(f1,"delete");
                dialog.setVisible(true);
        //final JOptionPane optionPane=new JOptionPane("Did u like to exit?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
       System.exit(0);
    }
    
    public static void main(String[] args){
        new logout();
    }
    
}
