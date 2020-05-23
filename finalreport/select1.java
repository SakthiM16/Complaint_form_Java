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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author SAKTHI
 */
public class select1 extends JFrame implements ActionListener{
     JFrame f1;
    JTextField t1;
    JLabel l1;
    JButton b1,b2;
    JTextArea a1;
    select1()
    {
        
        f1=new JFrame("SELECT COMPLAINTS");
        
         a1=new JTextArea();
        a1.setEditable(false);
        a1.setBackground(Color.black);
        a1.setBounds(5,5,600,600);
        f1.add(a1);
       
        l1=new JLabel("ROLL NUMBER");
        l1.setBounds(80,100,200,30);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("arial",Font.BOLD,15));
        a1.add(l1);
       // f1.add(l1);
        
        
        
        
        t1=new JTextField("");
        t1.setBounds(200,100,200,30);
        a1.add(t1);
        //f1.add(t1);
        
        b1=new JButton("select");
        b1.setBounds(150,200,100,30);
        b1.setBackground(Color.yellow);
        b1.setFont(new Font("arial",Font.BOLD,15));
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                   

		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
                //connection to string
                //db name complain
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/complain","root", "");

                     String a1=t1.getText();
                    int rollno=Integer.parseInt(a1);
	
                                                                    Statement stmt = con.createStatement(); 
                    
			
			// SELECT query 
			String q1 = "select * from complainreport WHERE RollNumber = '" + rollno + "'";
                                                                    ResultSet rs = stmt.executeQuery(q1); 
			if (rs.next()) 
			{ 
				System.out.println("Firstname:     " + rs.getString(1)); 
				System.out.println("LastName:   " + rs.getString(2)); 
				System.out.println("RollNumber:    " + rs.getInt(3));
                                                                                          System.out.println("Gender:   " + rs.getString(4)); 
				System.out.println("Phoneno:   " + rs.getInt(5)); 
				System.out.println("Department:  " + rs.getString(6));
                                                                                           System.out.println("Complaint:   " + rs.getString(7)); 
				System.out.println("dd/mon/yyyy:   " + rs.getDate(8)); 
				System.out.println("Reason:  " + rs.getString(9));
                                                                                            
			} 
			else
			{ 
				System.out.println("No such user id is already registered"); 
			} 
			con.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
	
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a1.add(b1);
        b1=new JButton("DELETE");
        b1.setBounds(150,200,100,30);
        f1.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(450,500,100,30);
        b2.setBackground(Color.cyan);
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new viewal();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a1.add(b2);
        
        b2=new JButton("Back");
        b2.setBounds(450,500,100,30);
        b2.setBackground(Color.cyan);
        a1.add(b2);
        
        
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setSize(600,600);
    }
    
    public static void main(String[] main){
        new delete();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}


