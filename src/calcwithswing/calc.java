package calcwithswing;

import javax.swing.*;
import java.awt.event.*;

public class calc implements ActionListener{
	
   JButton b1, b2, b3, b4;
   JTextField tf1, tf2, tf3;
   
   calc(){
	   
	   JFrame f = new JFrame();
	   //u
	   tf1 = new JTextField();
	   tf1.setBounds(70, 50, 150, 40);
	   tf2 = new JTextField();
	   tf2.setBounds(70, 100, 150, 40);
	   tf3 = new JTextField();
	   tf3.setBounds(70, 150, 150, 40);
	   tf3.setEditable(false);
	   b1 = new JButton("+");
	   b1.setBounds(30, 210, 50, 50);
	   b2 = new JButton("-");
	   b2.setBounds(100, 210, 50, 50);
	   b3 = new JButton("x");
	   b3.setBounds(170, 210, 50, 50);
	   b4 = new JButton("/");
	   b4.setBounds(240, 210, 50, 50);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   f.add(tf1);
	   f.add(tf2);
	   f.add(tf3);
	   f.add(b1);
	   f.add(b2);
	   f.add(b3);
	   f.add(b4);
	   f.setSize(400, 400);
	   f.setLayout(null);
	   f.setVisible(true);
	  
   }
   public void actionPerformed(ActionEvent e) {  
       String s1=tf1.getText();  
       String s2=tf2.getText();  
       int a=Integer.parseInt(s1);  
       int b=Integer.parseInt(s2);  
       int c=0;  
       if(e.getSource()==b1){  
           c=a+b;  
       }else if(e.getSource()==b2){  
           c=a-b;  
       }  
       else if(e.getSource()==b3)
       {
    	   c = a*b;
       }
       else if(e.getSource()==b4)
       {
    	   if(b==0) 
    		   c=0;
    	   else
    		   c = a/b;
       }
       String result=String.valueOf(c);  
       tf3.setText(result);  
   }  
public static void main(String[] args) {  
   new calc();  
}
}