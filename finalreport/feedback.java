/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;
  import javax.swing.*;    
import java.awt.*;  
import java.awt.event.*;  

/**
 *
 * @author SAKTHI
 */
public class feedback extends JFrame implements ActionListener{
    JFrame f;
    JButton b,b1;
    JTextArea ta;
    JLabel l1;
    feedback(){
  f=new JFrame("Feedback");  
  l1=new JLabel("YOU CAN CHOOSE ANY COLOR FOR BACKGROUND:)");
  l1.setBounds(10,50,400,30);
  f.add(l1);
    b=new JButton("Choose your Color");  
    b.setBounds(200,90,200,30);  
    b.addActionListener(this);  
    b1=new JButton("SUBMIT");
    b1.setBounds(30,400,100,30);
    b1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
           String user;
        //String pass;
        if(ae.getSource()==b1)
        {
            user=ta.getText();
            
            if(user.equals(""))
            {
                JOptionPane.showMessageDialog(b1,"Feedback confirmed");
              
            }
            
            else
            {
                JOptionPane.showMessageDialog(b1,"Feedback confirmed");
            }
           
           
        }

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
        
    });
    f.add(b1);
    
    
    ta=new JTextArea();  
    ta.setBounds(10,150,400,200);
    f.add(b);f.add(ta);  
    f.setLayout(null);  
    f.setSize(600,600);  
    f.setVisible(true);  

}
    public void actionPerformed(ActionEvent e){  
    Color c=JColorChooser.showDialog(this,"Choose",Color.CYAN);  
    ta.setBackground(c);  
    }
    public static void main(String[] args) {  
    new feedback();  
}  
}