/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author SAKTHI
 */
public class events extends JFrame implements ActionListener{
    JFrame j1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextArea a1;
    
    events()
    {
        j1=new JFrame("Departments");
        
        a1=new JTextArea();
        a1.setEditable(false);
        a1.setBackground(Color.orange);
        a1.setBounds(5,5,600,600);
        j1.add(a1);
        
        l1=new JLabel("DEPARTMENTS IN CIT");
        l1.setBounds(20,30,600,30);
         l1.setForeground(Color.black);
        a1.add(l1);
        l1.setFont(new Font("times",Font.BOLD,20));
        
        
        l2=new JLabel("Electrical Engineering");
        l2.setBounds(40,60,600,20);
        l2.setForeground(Color.black);
        a1.add(l2);
        
        
        
        l3=new JLabel("Civil Engineering");
        l3.setBounds(40,80,600,20);
        l3.setForeground(Color.black);
        a1.add(l3);
        
        l3=new JLabel("Civil Engineering");
        l3.setBounds(40,80,600,20);
        j1.add(l3);
        
        
        l4=new JLabel("Mechanical Engineering");
        l4.setBounds(40,100,600,20);
        l1.setForeground(Color.black);
        a1.add(l4);
        
        l4=new JLabel("Mechanical Engineering");
        j1.add(l4);
        
        l5=new JLabel("Electronic and Commuication Engineering");
        l5.setBounds(40,120,600,20);
        l5.setForeground(Color.black);
        a1.add(l5);
        
        
        
        l6=new JLabel("Computer Science and Engineering");
        l6.setBounds(40,140,600,20);
        l6.setForeground(Color.black);
        a1.add(l6);
        
        
        l7=new JLabel("Information Technology");
        l7.setBounds(40,160,600,20);
        l7.setForeground(Color.black);
        a1.add(l7);
        
        l7=new JLabel("Information Technology");
        l7.setBounds(40,160,600,20);
        j1.add(l7);
        
        l8=new JLabel("Chemical  Technology");
        l8.setBounds(40,180,600,20);
        l8.setForeground(Color.black);
        a1.add(l8);
        
        l8=new JLabel("Chemical  Technology");
        l8.setBounds(40,180,600,20);
        j1.add(l8);
        
        l9=new JLabel("Computing(M.Sc five year integrated programmes");
        l9.setBounds(40,200,600,20);
        l9.setForeground(Color.black);
        a1.add(l9);
        
        l9=new JLabel("Computing(M.Sc five year integrated programmes");
        l9.setBounds(40,200,600,20);
        j1.add(l9);
        
        
        l10=new JLabel("Computer Applications(MCA)");
        l10.setBounds(40,220,600,20);
        l10.setForeground(Color.black);
        a1.add(l10);
        
        l10=new JLabel("Computer Applications(MCA)");
        l10.setBounds(40,220,600,20);
        
        j1.add(l10);
        
        l11=new JLabel("Mathematics");
        l11.setBounds(40,240,600,20);
        l11.setForeground(Color.black);
        a1.add(l11);
        
        l11=new JLabel("Mathematics");
        l11.setBounds(40,240,600,20);
        j1.add(l11);
        
        l12=new JLabel("Physics");
        l12.setBounds(40,260,600,20);
        l12.setForeground(Color.black);
        a1.add(l12);
        
        
        l12=new JLabel("Physics");
        l12.setBounds(40,260,600,20);
        j1.add(l12);
        
        
        
        j1.setVisible(true);
        j1.setLayout(null);
        j1.setSize(600,600);
        j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args){
        new events();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
