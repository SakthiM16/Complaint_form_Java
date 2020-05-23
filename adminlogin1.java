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
public class adminlogin1 extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JFrame f2;
    JTextArea a1;
    JButton b1;
    
    adminlogin1()
    {
        f2=new JFrame("contact us");
        a1=new JTextArea();
        a1.setEditable(false);
        a1.setBounds(5,5,700,700);
        a1.setBackground(Color.black);
        f2.add(a1);
        
        l1=new JLabel("Lets's do something amazing");
        l1.setFont(new Font("algerian",Font.BOLD,30));
        l1.setBounds(10,60,700,30);
           l1.setForeground(Color.cyan);
        a1.add(l1);
        // f2=new JFrame("contact us");
       l1=new JLabel("Lets's do something amazing");
        //l1.setBounds(30,30,700,30);
      //  l1.setFont(new Font("algerian",Font.BOLD,30));
        a1.add(l1);
        
        l2=new JLabel("Office phno");
        l2.setBounds(40,150,300,20);
        l2.setFont(new Font("gunplay",Font.BOLD,15));
          l2.setForeground(Color.pink);
        a1.add(l2);
        l2=new JLabel("");
        a1.add(l2);
         //l2.setBounds(40,90,300,10);
 
           l3=new JLabel("9874563210");
        l3.setBounds(150,150,300,20);
        l3.setFont(new Font("gunplay",Font.BOLD,15));
        l3.setForeground(Color.pink);
        a1.add(l3);
        l3=new JLabel("");
        a1.add(l3);
        
        
        l4=new JLabel("Mailid");
        l4.setBounds(40,190,300,20);
        l4.setFont(new Font("gunplay",Font.BOLD,15));
        l4.setForeground(Color.pink);
        a1.add(l4);
        l4=new JLabel("");
        a1.add(l4);
      
        l5=new JLabel("sjack@.50@gmail.com");
        l5.setBounds(150,190,300,20);
        l5.setFont(new Font("gunplay",Font.BOLD,15));
        l5.setForeground(Color.pink);
        a1.add(l5);
        l5=new JLabel("");
        a1.add(l5);
        
        
        l6=new JLabel("Contact no");
        l6.setBounds(40,230,300,20);
        l6.setFont(new Font("gunplay",Font.BOLD,15));
        l6.setForeground(Color.pink);
        a1.add(l6);
        l6=new JLabel("");
        a1.add(l6);
        
        l7=new JLabel("3256987415");
        l7.setBounds(150,230,300,20);
        l7.setFont(new Font("gunplay",Font.BOLD,15));
        l7.setForeground(Color.pink);
        a1.add(l7);
        l7=new JLabel("");
        a1.add(l7);
        
        l8=new JLabel("Mailid");
        l8.setBounds(40,270,300,20);
        l8.setFont(new Font("gunplay",Font.BOLD,15));
        l8.setForeground(Color.pink);
        a1.add(l8);
        l8=new JLabel("");
        a1.add(l8);
      
      
        l10=new JLabel("jellyfish@gmail.com");
        l10.setBounds(150,270,370,20);
        l10.setFont(new Font("gunplay",Font.BOLD,15));
        l10.setForeground(Color.pink);
        a1.add(l10);
        l10=new JLabel("");
        a1.add(l10);
      
        l10=new JLabel("");
        l10.setBounds(150,200,370,20);
        l10.setFont(new Font("gunplay",Font.BOLD,15));
        l10.setForeground(Color.pink);
        f2.add(l10);
        l10=new JLabel("");
        f2.add(l10);
      
        b1=new JButton("Back");
        b1.setBounds(550,600,100,30);
        b1.setBackground(Color.cyan);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Finalreport();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a1.add(b1);
  
        
        f2.setVisible(true);
        f2.setSize(700,700);
        f2.setLayout(null);
    }

public static void main(String[] args)
{
    new adminlogin1();
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}