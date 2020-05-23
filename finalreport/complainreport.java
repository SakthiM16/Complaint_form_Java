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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Calendar;

/**
 *
 * @author SAKTHI
 */
public class complainreport extends JFrame implements ActionListener {
    
     JFrame j1;   
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextArea a1,a2,a3,a4,a5;
    JComboBox c1,c2,cb1,cb2,cb3;
    
    JCheckBox k1,k2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
     ButtonGroup bg,bg1,bg2,bg3;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    Calendar ca1;
Connection con=null;    
     @SuppressWarnings("empty-statement")
    complainreport()
    {
        j1=new JFrame("student form");
        j1.setForeground(Color.cyan);
        
        a3=new JTextArea();
        a3.setEditable(false);
         a3.setBackground(Color.DARK_GRAY);
         a3.setBounds(5,5,900,1000);
        j1.add(a3);
        
        
        l1=new JLabel("STUDENT INFORMATION");
        l1.setForeground(Color.cyan);
        j1.setBackground(Color.pink);
     JOptionPane.showMessageDialog(j1,"YOU HAVE LOGGED INTO COMPLAINT FORM,YOU CAN PROCEED!!");
      //j1.addWindowListener((this);
        l1.setVerticalAlignment(SwingConstants.CENTER);
        l1.setFont(new Font("arial",Font.BOLD,20));
        l1.setBounds(50,10,400,40);
       a3.add(l1);

       l2=new JLabel("Firstname");
        l2.setBounds(50,60,300,40);
        l2.setFont(new Font("arial",Font.BOLD,18));
        l2.setForeground(Color.cyan);
        a3.add(l2);

        t1=new JTextField("");
        t1.setBounds(180,60,250,40);
        t1.setFont(new Font("arial",Font.BOLD,18));
        a3.add(t1);

        l3=new JLabel("Lastname");
        l3.setBounds(50,120,300,40);
        l3.setFont(new Font("arial",Font.BOLD,18));
        l3.setForeground(Color.cyan);
        a3.add(l3);

        t2=new JTextField("");
        t2.setBounds(180,120,250,40);
        t2.setFont(new Font("cambria",Font.BOLD,15));
        a3.add(t2);

        l4=new JLabel("Rollnumber");
        l4.setBounds(50,180,300,40);
        l4.setFont(new Font("arial",Font.BOLD,18));
        l4.setForeground(Color.cyan);
        a3.add(l4);

        t3=new JTextField("");
        t3.setBounds(180,180,250,40);
        t3.setFont(new Font("arial",Font.BOLD,18));
        //l2.setForeground(Color.cyan);
        a3.add(t3);

        l5=new JLabel("Gender");
        l5.setBounds(50,240,300,40);
        l5.setFont(new Font("arial",Font.BOLD,18));
        l5.setForeground(Color.cyan);
        a3.add(l5);

        r1=new JRadioButton("Male");
        r1.setBounds(180,240,100,40);
        r1.setFont(new Font("arial",Font.BOLD,18));
        r1.setForeground(Color.cyan);
        r1.setBackground(Color.black);
        a3.add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(280,240,100,40);
        r2.setFont(new Font("arial",Font.BOLD,18));
        r2.setForeground(Color.cyan);
        r2.setBackground(Color.black);
        a3.add(r2);

        bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);   
        
        /*t4=new JTextField("");
        t4.setBounds(180,240,250,40);
        j1.add(t4);*/
        l6=new JLabel("Phonenumber");
        l6.setBounds(50,300,300,40);
        l6.setFont(new Font("arial",Font.BOLD,18));
        l6.setForeground(Color.cyan);
        a3.add(l6);

        t5=new JTextField("");
        t5.setBounds(180,300,250,40);
        t5.setFont(new Font("arial",Font.BOLD,18));
        a3.add(t5);

        l7=new JLabel("Department");
        l7.setBounds(50,360,300,40);
        l7.setFont(new Font("arial",Font.BOLD,18));
        l7.setForeground(Color.cyan);
        a3.add(l7);

        String Dpmt[]={"Civil","Mechanical","Software","DataScience","Electronical","Architec"};
        c1=new JComboBox(Dpmt);
        c1.setBounds(180,360,250,40);//check this in website for actionlistener
        c1.setFont(new Font("arial",Font.BOLD,18));
        c1.setForeground(Color.black);
        a3.add(c1);

        
        l9=new JLabel("Nature of Complaint");
        l9.setBounds(50,540,200,40);
        l9.setFont(new Font("arial",Font.BOLD,18));
        l9.setBackground(Color.black);
        l9.setForeground(Color.cyan);
        a3.add(l9);
        
        r3=new JRadioButton("Academic");
        r3.setBounds(180,580,200,30);
        r3.setFont(new Font("arial",Font.BOLD,18));
        r3.setBackground(Color.black);
        r3.setForeground(Color.cyan);
        a3.add(r3);
        
        r4=new JRadioButton("Personnel(problem with staff,etc)");
        r4.setBounds(180,610,300,30);
        r4.setFont(new Font("arial",Font.BOLD,18));
        r4.setBackground(Color.black);
        r4.setForeground(Color.cyan);
        a3.add(r4);
        
        r5=new JRadioButton("Student Services(Student Accounts,Food services,Campus living"
                + "Financial Aid)");
        r5.setBounds(180,630,350,30);
        r5.setFont(new Font("arial",Font.BOLD,18));
        r5.setForeground(Color.cyan);
        r5.setBackground(Color.black);
        
        a3.add(r5);
        
        r6=new JRadioButton("Issue with Another Student");
        r6.setBounds(180,660,250,30);
        r6.setFont(new Font("arial",Font.BOLD,18));
        r6.setBackground(Color.black);
        r6.setForeground(Color.cyan);
        a3.add(r6);
        
        r7=new JRadioButton("Other");
        r7.setBounds(180,690,250,30);
        r7.setFont(new Font("arial",Font.BOLD,18));
        r7.setBackground(Color.black);
        r7.setForeground(Color.cyan);
        a3.add(r7);
        
        l11=new JLabel("If other provide a reason");
        l11.setForeground(Color.cyan);
        l11.setBackground(Color.black);
        l11.setBounds(50,710,250,30);
        
        l11.setFont(new Font("arial",Font.BOLD,18));
        a3.add(l11);
        
        a1=new JTextArea("");
        a1.setBounds(180,740,400,100);
        a1.setFont(new Font("arial",Font.BOLD,18));
        a3.add(a1);
        
         bg1=new ButtonGroup();    
        bg1.add(r3);bg1.add(r4);bg1.add(r5);bg1.add(r6); bg1.add(r7);  
        l10=new JLabel("Have you already spoken with someone regarding this complaint?");
        l10.setBounds(50,420,500,30);
        l10.setFont(new Font("arial",Font.BOLD,18));
        l10.setForeground(Color.cyan);
        a3.add(l10);
        
        r8=new JRadioButton("Yes");
        r8.setBounds(60,460,50,30);
        r8.setFont(new Font("arial",Font.BOLD,18));
        r8.setForeground(Color.cyan);
        r8.setBackground(Color.black);
       
        a3.add(r8);
        
        r9=new JRadioButton("No");
        r9.setBounds(140,460,50,30);
        r9.setFont(new Font("arial",Font.BOLD,18));
        r9.setBackground(Color.black);
        r9.setForeground(Color.cyan);
        a3.add(r9);
        
        /*bg3=new ButtonGroup();    
        bg3.add(r8);bg3.add(r9);   
        
        b8=new JButton("SEND MAIL");
        b8.setBounds(670,150,150,50);
        b8.setBackground(Color.cyan);
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        a3.add(b8);*/
        
        b1=new JButton("SAVE");
        b1.setBounds(670,200,150,50);
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.black);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter your Firstname");                       }
            else if(t2.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Enter your Latname");
            }
            else if(t3.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Enter your RollNumber");
            }
            else if(!r1.isSelected() && !r2.isSelected()){
                 JOptionPane.showMessageDialog(null,"Select your gender");
            }   
            else if(t5.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Give your phno");
            }
            else if(!r3.isSelected() && !r4.isSelected()&&!r5.isSelected() && !r6.isSelected()&&!r7.isSelected()){
                JOptionPane.showMessageDialog(null,"Select the type of complaint");
            }
            else if(!r8.isSelected() && !r9.isSelected()){
                JOptionPane.showMessageDialog(null,"Select yes or no");
            }
            else{
                
            
            /*    String fname="Firstname";
                String lname="Lastname";
                int rollno=Integer.parseInt("RollNumber");
                String gender="Gender";
                int phno=Integer.parseInt("Phoneno");
                String dept="Department";
                String complain="Complaint";
                String datein="dd/mon/yyyy";
                String nature="NatureofComplaint";
                String reason="Reason";*/
                
                try
	{ 
                    //String connectString="jdbc:mysql://localhost:3306/complain?zeroDateTimeBehavior=convertToNull ";
  
                    Class.forName("com.mysql.jdbc.Driver"); 
                //connection to string
                //db name complain
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/complain","root", "");
                     String sql="INSERT INTO `complainreport` (`Firstname`, `Lastname`, `RollNumber`, `Gender`, `Phoneno`, `Department`, `Complaint`, `yyyy-mon-dd`, `NatureofComplaint`, `Reason`)  "+
                             "VALUES (?, ?,?, ?, ?, ?, ?, ?, ?, ?)";
                     PreparedStatement pa=con.prepareStatement(sql);
                      pa.setString(1, t1.getText());
                      pa.setString(2, t2.getText());
                 
                       String s1=t3.getText();
                       int rollno=Integer.parseInt(s1);
                       pa.setInt(3, rollno); 
                 
                     String Gender;
                 if(r1.isSelected())
                 {
                     Gender="Male";
                 }else
                     Gender="Female";
                 
                 pa.setString(4, Gender);
                 pa.setString(5, t5.getText());
                 pa.setString(6, c1.getSelectedItem().toString());
                 String Complaint;
                   if(r8.isSelected())
                 {
                     Complaint="Yes";
                 }else
                     Complaint="No";
                 
                 pa.setString(7, Complaint);
                
                 pa.setString(8, cb3.getSelectedItem()+"-"+String.valueOf( cb2.getSelectedIndex()+1)+"-"+cb1.getSelectedItem());
                 //pa.setString(8, cb2.getSelectedItem().toString());
                 //pa.setString(8, cb3.getSelectedItem().toString());
                 
                 String NatureofComplain;
                 if(r3.isSelected()){
                     NatureofComplain="Academic";
                 }
                 else if(r4.isSelected())
                 {
                     NatureofComplain="Personnel(problem with staff,etc)";
                 }
                 else if(r5.isSelected()){
                     NatureofComplain="Student Services(Student Accounts,Food services,Campus living"
                + "Financial Aid)";
                     
            
                }
                 else if(r6.isSelected()){
                     NatureofComplain="Issue with Another Student";
                 }
                 else
                 {
                     NatureofComplain="Other";
                 }
                   
                 pa.setString(9, NatureofComplain);
                 pa.setString(10, a1.getText());
                 pa.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Data inserted successfully");

               //Connection con = DriverManager.getConnection("jdbc:mysql://localhost/complain","root", "");
                     
                        
                         System.out.print("Data is inserted successfully !");
                        con.close();   
                        
                        
	}       catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                               } catch (ClassNotFoundException ex) {
                    //Logger.getLogger(complainreport.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            }
            }
        });


                
     
        b1.setFont(new Font("cambria",Font.BOLD,15));
        a3.add(b1);
        
        b2=new JButton("CLEAR");
        b2.addActionListener(this);
        b2.setBounds(670,260,150,50);
        b2.setBackground(Color.cyan);
        
        b2.setFont(new Font("cambria",Font.BOLD,15));
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t5.setText("");
//                t6.setText("");
//                k1.setText("");
                a1.setText("");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        
        b5=new JButton("<<--GO BACK");
        b5.setBounds(700,880,150,50);
        b5.setBackground(Color.CYAN);
        a3.add(b5);
        b5.setFont(new Font("cambria",Font.BOLD,15));
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Finalreport();
                j1.dispose();
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        l11=new JLabel("Date of incident");
        l11.setBounds(50,500,200,30);
        l11.setForeground(Color.cyan);
        a3.add(l11);
        a3.setFont(new Font("arial",Font.BOLD,18));
        
        
        String[] option1={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
        "22","23","24","25","26","27","28","29","30","31"   };
        cb1=new JComboBox(option1);
       
       cb1.setBounds(310,500,70,30);
      a3.add(cb1);
      
      String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        cb2=new JComboBox(month);
        cb2.setBounds(250,500,70,30);
        a3.add(cb2);
        
        String[] year={"2015","2016","2017","2018","2019","2020"};
        cb3=new JComboBox(year);
        cb3.setBounds(200,500,50,30);
      //  cb3.setBounds(310,500,70,30);
         //int month=java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
        a3.add(cb3);
        a3.add(b1);
        a3.add(b2);
        j1.setLayout(null);
        j1.setSize(900,1000);
        j1.setVisible(true);
       j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        new complainreport();
  }


    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    

               

    
    

