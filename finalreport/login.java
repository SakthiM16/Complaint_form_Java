/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author SAKTHI
 */
public class login extends JFrame implements ActionListener{
  JFrame f1;
  JButton b1,b2,b3,b4,b5;
  JTextField t1,t2,t3,t4;
  JLabel l1,l2,l3,l4,bg;
  JTextArea a1,a2;
  JPasswordField p1;
  JCheckBox c1;
  login()
  {
      f1=new JFrame("ADMIN LOGIN");
      
        
      a1=new JTextArea();
      a1.setBounds(5,10,700,700);
      f1.add(a1);
      a1.setBackground(Color.BLACK);
      a1.setEditable(false);
      
      l1=new JLabel("ADMIN LOGIN");
      l1.setBounds(150,40,400,20);
      l1.setFont(new Font("cambria",Font.BOLD,25));
      a1.add(l1);
      l1.setForeground(Color.orange);
      
      
      l2=new JLabel("Username");
      l2.setBounds(100,150,200,30);
      l2.setForeground(Color.orange);
    
     // l2.setToolTipText("Enter your name");
      l2.setFont(new Font("cambria",Font.BOLD,15));
      a1.add(l2);
      
    
      t1=new JTextField();
      t1.setBounds(200,150,200,30);
      t1.setFont(new Font("cambria",Font.BOLD,15));
      a1.add(t1);
      
      l3=new JLabel("Password");
      l3.setBounds(100,210,200,30);
      l3.setFont(new Font("cambria",Font.BOLD,15));
      a1.add(l3);
      l3.setForeground(Color.orange);
      
      p1=new JPasswordField();
      p1.setBounds(200,210,200,30);
     // p1.setToolTipText("enter password");
      p1.setFont(new Font("cambria",Font.BOLD,15));
      a1.add(p1);
      
      b1=new JButton("Login");
      b1.setBackground(Color.orange);
      b1.setBounds(130,260,100,30);
      b1.setFont(new Font("cambria",Font.BOLD,15));
      a1.add(b1);
      b1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            String user;
        String pass;
        if(ae.getSource()==b1)
        {
            user=t1.getText();
            pass=p1.getText();
            if(user.equals("admin")&&pass.equals("admin"))
            {
                JOptionPane.showMessageDialog(b1,"Login Successful");
                 new viewal().setVisible(true);
            }
            
            else
            {
                JOptionPane.showMessageDialog(b1,"invalid username or password");
            }
           
           
        }
            
              
         
      

              
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
          
      });
      
      
          
      b2=new JButton("Clear");
      b2.setBounds(250,260,100,30);
      b2.setBackground(Color.orange);
      a1.add(b2);
      
      b2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            t1.setText("");
            p1.setText("");
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      
  });
      
      b4=new JButton();
      b4.setText("<<--BACK");
      b4.setBounds(450,550,100,30);
      b4.setBackground(Color.cyan);
      a1.add(b4);
      b4.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
              new Finalreport() {
                  @Override
                  public void actionPerformed(ActionEvent ae) {
                      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  }
              };
//              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
     
          
          
      });
      
      
      b4=new JButton();
      //b4.setText("<<--BACK");
      f1.add(b4);
  
      
      
      f1.setVisible(true);
      f1.setLayout(null);
      f1.setSize(700,700);
    //  f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
      

      
  }
  public static void main(String[] args) throws Exception{
      
      new login();
      
  }


  
    
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
   


    


