/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreport;
import java.awt.Color;
import static java.awt.Color.pink;
import java.awt.Font;
import javax.swing.*;  
import java.awt.event.*;  

/**
 *
 * @author SAKTHI
 */
public class Finalreport extends JFrame implements ActionListener{
    
    JFrame f;
    JLabel l1;
JMenuBar mb;  
JTextArea a1,a2,a3;
JMenu m1,m2,m3,m4,m5;  
JMenuItem i7,i1,i2,i3,i4,i5,i6;  
JTextArea ta;  
      
Finalreport()
{
    f=new JFrame();  
  a1=new JTextArea();
  a1.setBounds(5,50,700,700);
  a1.setEditable(false);
a1.setBackground(Color.black);
f.add(a1);
  mb=new JMenuBar();  
mb.setBounds(5,5,700,40);
mb.setBackground(Color.orange);

l1=new JLabel("STUDENT COMPLAINT FORM");
l1.setBounds(120,190,500,50);
l1.setFont(new Font("cambria",Font.BOLD,30));
l1.setForeground(Color.orange);
a1.add(l1);
f.add(a1);

a2=new JTextArea();
a2.setBounds(5,150,700,30);
a2.setEditable(false);
a2.setBackground(Color.pink);
a1.add(a2);

a3=new JTextArea();
a3.setBounds(5,250,700,30);
a3.setEditable(false);
a3.setBackground(Color.cyan);
a1.add(a3);

i1=new JMenuItem("Admin Login");
// JOptionPane optionPane=new JOptionPane("Did u like to exit?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);

i1.setBackground(Color.LIGHT_GRAY);
 i1.setFont(new Font("cambria",Font.BOLD,15));
i2=new JMenuItem("Student Complaint"); 
i2.setBackground(Color.cyan);
i2.setFont(new Font("cambria",Font.BOLD,15));
i3=new JMenuItem("Contact Us");
i3.setBackground(Color.LIGHT_GRAY);
i3.setFont(new Font("cambria",Font.BOLD,15));
m1=new JMenu("Home");  
 m1.setFont(new Font("cambria",Font.BOLD,15));
m2=new JMenu("About Us");  
 m2.setFont(new Font("cambria",Font.BOLD,15));
m4=new JMenu("LogOut");
 m4.setFont(new Font("cambria",Font.BOLD,15));
 i7=new JMenuItem("Logout");
 i7.setBackground(Color.cyan);
 m4.add(i7);
 i7.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            new logout();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
 });
 
i4=new JMenuItem("History");
m2.add(i4);
i4.setBackground(Color.LIGHT_GRAY);
i4.setFont(new Font("cambria",Font.BOLD,15));
i4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            new aboutus();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
});

i5=new JMenuItem("Events");
m2.add(i5);
i5.setBackground(Color.cyan);
i5.setFont(new Font("cambria",Font.BOLD,15));
i5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
        new events();

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
});
 
i7=new JMenuItem("Feedback");
m2.add(i7);
i7.setBackground(Color.LIGHT_GRAY);
i7.setFont(new Font("cambria",Font.BOLD,15));
i7.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            new feedback();
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
});


m1.add(i1);m1.add(i2);m1.add(i3); 
mb.add(m1);mb.add(m2);mb.add(m4);  
m1.addActionListener(this);  
m2.addActionListener(this);
m4.addActionListener(this);
i1.addActionListener(new ActionListener(){
    @Override
        public void actionPerformed(ActionEvent ae) {
            
            new login();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }  );

i2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           new complainreport();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    } );
i3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
                new adminlogin1();

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
});  
//ta=new JTextArea();  
//ta.setBounds(5,30,700,700);  
  
f.add(mb);

//f.add(ta);
f.setLayout(null);  
f.setSize(700,700);  
f.setVisible(true); 
f.setDefaultCloseOperation(EXIT_ON_CLOSE);

 



}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Finalreport f;
        new Finalreport() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        } ;
    };

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

