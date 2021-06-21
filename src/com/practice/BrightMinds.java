package com.practice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BrightMinds extends JFrame implements ActionListener{
	
	JButton jb1,jb2;
	JTextField jt;
	JLabel jl1,jl2,jl3;
	
	
	
	
	BrightMinds()
	{
		setBounds(200,150,1000,500);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/practice/images/quiztime.jpg"));
		
		jl1=new JLabel(i1);
		
		jl1.setBounds(0,0,500,500);
		
		setVisible(true);
		add(jl1);
		
		
		jl2=new JLabel("Bright Minds Academy");
		
		jl2.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		
		
		jl2.setBounds(600,50,500,100);
		
		jl2.setForeground(Color.BLUE);
		add(jl2);
		
		
      jl3=new JLabel("Enter your Name");
		
		jl3.setBounds(780,200,300,50);
		
		jl3.setFont(new Font("Times New Roman",Font.BOLD,15));
		
		jl3.setForeground(Color.BLUE);
		add(jl3);
		
		 jt=new JTextField();
		
		jt.setBounds(650,300,400,50);
		
		jt.setFont(new Font("Times New Roman",Font.BOLD,18));
		add(jt);
		
		
		jb1=new JButton("Rules");
		jb1.setBounds(650,400,100,50);
		jb1.setBackground(Color.BLUE);
		jb1.setForeground(Color.WHITE);
		
		jb1.addActionListener(this);
		
		add(jb1);
		
		jb2=new JButton("Exit");
		jb2.setBounds(950,400,100,50);
		jb2.setBackground(Color.BLUE);
		jb2.setForeground(Color.WHITE);
		jb2.addActionListener(this);
		
		add(jb2);
		
		
		
		
		
	}
	
	
	public static void main(String args[])
	{
		
		new BrightMinds();
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jb1)
		{
			String name=jt.getText();
			
			new Rules(name);
			this.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
		
	}
	

}
