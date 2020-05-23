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
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author SAKTHI
 */
public class aboutus {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JTextArea a1,a2,a3,a4,a5,a6;
    JButton b1;
    aboutus()
    {
        f=new JFrame();
        a5=new JTextArea();
        a5.setBounds(5,5,900,700);
        a5.setEditable(false);
        a5.setBackground(Color.black);
        f.add(a5);
        
      l1=new JLabel("History");
      l1.setBounds(20,40,250,30);
      l1.setForeground(Color.cyan);
      a5.add(l1);
      l1.setFont(new Font("algerian",Font.BOLD,20));
      l1=new JLabel("History");
      f.add(l1);
      
      l2=new JLabel("Coimbatore Institute of Technology was founded by Rangaswamy(VRET) in year 1956.");
      l2.setBounds(40, 70, 600, 20);
      l2.setForeground(Color.pink);
      a5.add(l2);
     l2=new JLabel("Coimbatore Institute of Technology was founded by Rangaswamy(VRET) in year 1956.");
      //l2.setBounds(40, 70, 250, 20);
      f.add(l2);
      
      l3=new JLabel("The aim of VRET is to disseminate knowledge in fields of science,engineering and technology to student community.");
      l3.setBounds(40,90,800,20);
      l3.setForeground(Color.pink);
      a5.add(l3);
      l3=new JLabel("The aim of VRET is to disseminate knowledge in fields of science,engineering and technology to student community.");
      //l3.setBounds(40,90,600,20);
      f.add(l3);
      
      l4=new JLabel("The philantropic founders envisioned a unique professional learning order with special emphasis on industrial training.");
      l4.setBounds(40,110,800,20);
      
      l4.setForeground(Color.pink);
      a5.add(l4);
      
      l4=new JLabel("The philantropic founders envisioned a unique professional learning order with special emphasis on industrial training.");
      //l4.setBounds(40,110,800,20);
      f.add(l4);
      
      l5=new JLabel("CIT was affiliated to madras university from 1956 to 1980.");
      l5.setBounds(40,130,800,20);
      l5.setForeground(Color.pink);
      a5.add(l5);
      l5=new JLabel("CIT was affiliated to madras university from 1956 to 1980.");
      //l5.setBounds(40,130,800,20);
      f.add(l5);
      
      l6=new JLabel("In year 1980,the institute got affiliated to Bharathiar University and to Anna Univerity in 2001.");
      l6.setBounds(40,150,800,20);
      l6.setForeground(Color.pink);
      a5.add(l6);
      
      
      l6=new JLabel("In year 1980,the institute got affiliated to Bharathiar University and to Anna Univerity in 2001.");
      //l6.setBounds(40,150,800,20);
      f.add(l6);
      
      l7=new JLabel("CIT is a Government aided institution,recognized by AICTE.");
      l7.setBounds(40,170,800,20);
      l7.setForeground(Color.pink);
      a5.add(l7);
      
      l7=new JLabel("CIT is a Government aided institution,recognized by AICTE.");
      //l7.setBounds(40,170,800,20);
      f.add(l7);
      
      l8=new JLabel("CIT offers 7 UG programmes, 9 PG Programmes, 3 Five Year Integrated M.Sc. Programmes in addition to Ph.D. Research Programmes.");
      l8.setBounds(40,190,800,20);
      l8.setForeground(Color.pink);
      a5.add(l8);
      
      
      l8=new JLabel("CIT offers 7 UG programmes, 9 PG Programmes, 3 Five Year Integrated M.Sc. Programmes in addition to Ph.D. Research Programmes.");
      //l8.setBounds(40,190,800,20);
      f.add(l8);
      
      l9=new JLabel("About Coimbatore Institute of Technology");
      l9.setBounds(20,220,800,30);
      l9.setForeground(Color.cyan);
      //l1.setFont(new Font("gigi",Font.BOLD,30));
      l9.setFont(new Font("algerian",Font.BOLD,20));
      a5.add(l9);
      
      l9=new JLabel("About Coimbatore Institute of Technology");
      l9.setBounds(20,220,800,30);
      l1.setFont(new Font("times",Font.BOLD,20));
      f.add(l9);
      
      l10=new JLabel("The Institute backed by World Class research and development attained autonomous attained autonomous status in 1987 and is affiliated to the Anna University.");
      l10.setBounds(40,250,800,30);
      l10.setForeground(Color.pink);
      a5.add(l10);
      
      l10=new JLabel("The Institute backed by World Class research and development attained autonomous attained autonomous status in 1987 and is affiliated to the Anna University.");
      l10.setBounds(40,250,800,30);
      f.add(l10);
      
      l11=new JLabel("The Institute has a strong academic-industrial interaction and a high quality of research and consultancy");
      l11.setBounds(40,270,800,30);
      l11.setForeground(Color.pink);
      a5.add(l11);
      l11=new JLabel("The Institute has a strong academic-industrial interaction and a high quality of research and consultancy");
      l11.setBounds(40,270,800,30);
      f.add(l11);
      
      b1=new JButton("BACK");
      b1.setBounds(600,500,100,50);
      b1.setBackground(Color.pink);
      a5.add(b1);
      b1.addActionListener(new ActionListener(){
          

            @Override
            public void actionPerformed(ActionEvent ae) {
new Finalreport();                
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
      });
      
      f.setVisible(true);
      f.setSize(900,700);
      f.setLayout(null);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    public static void main(String[] args){
        new aboutus();
    }
}
