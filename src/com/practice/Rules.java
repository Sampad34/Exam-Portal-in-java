package com.practice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	
	
	JButton b1,b2;
	JLabel l1,l2;
	String username;
	
	Rules(String username)    //coding of frame goes here 
	{
		this.username=username;
		
		setBounds(200,150,1000,500);       //dleft,dup,width,height
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		
		
	    l1=new JLabel("Hello " +username+" Welcome to Bright minds");
		l1.setBounds(100,100,800,100);
         l1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		
		l1.setForeground(Color.BLUE);
		add(l1);
		
		
		 l2=new JLabel();
		
		l2.setBounds(100,200,400,300);
		
		l2.setText( "<html>"+
                           "1. Dont copy from others." + "<br><br>" +
                           "2. There are 10 questions in total." + "<br><br>" +
                           "3. You will get -5 penalty for one wrong answer and +5 marks for one right answer." +"<br><br>" +
                     "<html>" );
		
		
		
		l2.setFont(new Font("Tahoma",Font.BOLD,20));
		l2.setForeground(Color.BLACK);
		add(l2);
		
		
	   b1=new JButton("Back");
		b1.setBounds(100,600,80,30);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Start");
		b2.setBounds(400,600,80,30);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		
		setVisible(true);
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		new Rules("");
		
	}






	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1)
		{
			this.setVisible(false);
			new BrightMinds();
		}
		else
		{
			this.setVisible(false);
			new Quiz(username).setVisible(true);
		}
		
	}

}
