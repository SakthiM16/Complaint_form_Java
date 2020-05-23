/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalreport;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JFrame;


/**
 *
 * @author SAKTHI
 */
public class viewall extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JFrame f1;
    JTextArea a1;
    viewall()
    {
        f1=new JFrame("VIEW EVERYTHING");
        
        a1=new JTextArea();
        a1.setBounds(5,5,700,650);
        a1.setBackground(Color.black);
        a1.setEditable(false);
        f1.add(a1);
        
        b1=new JButton("VIEW COMPLAINTS");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
          
         b1.setBackground(Color.orange);
        b1.setBounds(200,160,200,50);
          a1.add(b1);
        
        b2=new JButton("DELETE COMPLAINTS");
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new delete();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        b2.setBounds(200,220,200,50);
         b2.setBackground(Color.orange);
           a1.add(b2);
           
           b3=new JButton("SELECT COMPLAINT");
          b3.setBounds(200,280,200,50);
             b3.setBackground(Color.orange);
          a1.add(b3);
             b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
 new select1();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
               
           });
            
           
           b3=new JButton("SELECT COMPLAINT");
          b3.setBounds(200,280,200,50);
             b3.setBackground(Color.orange);
          a1.add(b3);
             b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // new select1();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
               
           });
             b4=new JButton("Back");
             b4.setBounds(500,200,100,30);
             b4.setBackground(Color.pink);
             b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new login();
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                 
             });
             a1.add(b4);
             
             b4=new JButton("Back");
             b4.setBounds(500,200,100,30);
             b4.setBackground(Color.pink);
             b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new login();
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                 
             });
             f1.add(b4);
                  
             
             
           
         f1.setVisible(true);
        f1.setLayout(null);
        f1.setSize(700,700);
    }
    public static void main(String[] args){
        new viewall();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
