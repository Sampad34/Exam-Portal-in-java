package com.practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyScore extends JFrame implements ActionListener
{
	JLabel label1,label2,label3;
	JButton button;
   MyScore(String username,int score)
	  {
		  setLayout(null);
		   getContentPane().setBackground(Color.WHITE);
		    setBounds(200,150,1000,500);
		    
		    setVisible(true);
		    
		    
		    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/practice/images/quiztime.jpg"));
			Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			label1=new JLabel(i3);
			label1.setBounds(0,0,500,500);
			add(label1);
			
			
			
			
			label2=new JLabel("Thank you "+username+" for playing the quiz");
			
			label2.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
			
			
			label2.setBounds(600,50,600,100);
			
			label2.setForeground(Color.BLUE);
			add(label2);
			
			
			
			label3=new JLabel("Your score is "+score);
			
			label3.setFont(new Font("Jokerman",Font.BOLD,25));
			
			
			label3.setBounds(600,150,500,50);
			
			label3.setForeground(Color.BLUE);
			add(label3);
			
			
			button=new JButton("Play again");
			button.setBounds(600,300,100,50);
			button.setBackground(Color.BLUE);
			button.setForeground(Color.WHITE);
			button.addActionListener(this);
			add(button);
			
		    
		    
		    
	  }

	public static void main(String[] args)
	{
		new MyScore("",0).setVisible(true);
		new BrightMinds().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		this.setVisible(false);
		new BrightMinds().setVisible(true);
		
		
	}

}
