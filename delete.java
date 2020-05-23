/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author SAKTHI
 */
public class delete extends JFrame implements ActionListener {
    JFrame f1;
    JTextField t1;
    JLabel l1;
    JButton b1,b2;
    JTextArea a1;
    Dialog d;
    delete()
    {
        f1=new JFrame("DELETE COMPLAINTS");
        a1=new JTextArea();
        a1.setEditable(false);
        a1.setBounds(5,5,600,600);
        a1.setBackground(Color.orange);
       
        f1.add(a1);
        
        l1=new JLabel("ROLL NUMBER");
        l1.setBounds(100,100,200,30);
        l1.setForeground(Color.black);
        a1.add(l1);
        
        t1=new JTextField("");
        t1.setBounds(200,100,200,30);
        t1.setForeground(Color.black);
        a1.add(t1);
        
        b1=new JButton("delete");
        b1.setBounds(150,200,100,30);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
              //  int rollno=Integer.parseInt("RollNumber");
		
		try
		{ 
                     Class.forName("com.mysql.jdbc.Driver"); 
                //connection to string
                //db name complain
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/complain","root", "");

			
                    Statement stmt = con.createStatement(); 
                    String a=t1.getText();
                    int rollno=Integer.parseInt(a);
			//int rollno=Integer.parseInt("RollNumber");
			// Deleting from database 
			String q1 = "DELETE from complainreport WHERE RollNumber = '" + rollno+ "'";
				
					
			int x = stmt.executeUpdate(q1); 
			
			if (x > 0)	
                            JOptionPane.showMessageDialog(null,"deleted successfully");
				//System.out.println("One User Successfully Deleted");			
			else
				System.out.println("ERROR OCCURED :("); 
			
			con.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		}


           
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a1.add(b1);
        
        b1=new JButton("DELETE");
        b1.setBounds(150,200,100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.orange);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                               JOptionPane pane=new JOptionPane("Did you like to delete?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
                JDialog dialog=pane.createDialog(f1,"delete");
                dialog.setVisible(true);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a1.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(470,500,100,30);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                new viewal();
                f1.dispose();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        b2.setBackground(Color.black);
        b2.setForeground(Color.orange);
        a1.add(b2);
        
        b2=new JButton("Back");
      //  b2.setBounds(470,500,100,30);
        f1.add(b2);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setSize(600,600);
        
    }
    
    public static void main(String[] main){
        new delete();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
