package com.practice;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5;
	JRadioButton rb1,rb2,rb3,rb4,rb5;
	JButton next,lifeline,submit;
	
	ButtonGroup options;
	String q[][]=new String[10][5];
	String pa[][]=new String[10][2];
	String qa[][]=new String[10][2];
	public static int count=0;
	public static int timer=15;
	public static int ans_given=0;
	public static int score=0;
	String username;
	
	Quiz(String username)
	{
		this.username=username;
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setBounds(200,150,1000,500);	
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/practice/images/quiztime2.jpg"));
		

		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,200);
		add(l1);
		
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
    	qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
		
		
		
        l2=new JLabel(" ");
		l2.setBounds(100,250,400,50);
		add(l2);   
		
		
		
		rb1=new JRadioButton("");
		rb1.setBounds(100,320,300,30);
		add(rb1);
		
		
		rb2=new JRadioButton("");
		rb2.setBounds(100,340,300,30);
		add(rb2);
		
		rb3=new JRadioButton("");
		rb3.setBounds(100,360,300,30);
		add(rb3);
		
		rb4=new JRadioButton("");
		rb4.setBounds(100,380,300,30);
		add(rb4);
		
		
		
		options=new ButtonGroup();
		

		options.add(rb1);
		options.add(rb2);
		options.add(rb3);
		options.add(rb4);
		
		
		
		next=new JButton("NEXT");
		next.setBounds(700,300,100,30);
		next.setBackground(Color.BLUE);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		lifeline=new JButton("LIFELINE");
		lifeline.setBounds(700,350,100,30);
		lifeline.setBackground(Color.BLUE);
		lifeline.setForeground(Color.WHITE);
		lifeline.addActionListener(this);
		add(lifeline);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(700,400,100,30);
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setEnabled(false);
		add(submit);
	
		
		
		
		
		setVisible(true);
		
		start(0);
		
	}
	
	
	
	

	public static void main(String[] args) 
	{
		new Quiz("").setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		
		//.......next code goes here................................
		
		if(ae.getSource()==next)
		{
			repaint();                      //to start the questions again and again,repaint function calls paint func internally
			rb1.setEnabled(true);
			rb2.setEnabled(true);    //code so that when we move to next question all the options should be visible
			rb3.setEnabled(true);
			rb4.setEnabled(true);
			ans_given=1;                    //,,,,,,,,,,,,,,,,,//
			
			if(options.getSelection()==null)     //check if any option is selected or not
			{                                      //no option selected. store empty string
				pa[count][0]="";    
				
			}
			else
			{
				pa[count][0]=options.getSelection().getActionCommand(); 
				//answer selected, then select the value from the radiobutton
				
			}
			
			
			
			if(count==8)
			{
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			
			count++;
			start(count);//........................//
			
		}
		
		//..................................lifeline code goes here.........................//
		
		
		else if(ae.getSource()==lifeline)
		{
			if(count==2 || count==4 || count==6 || count==8 || count==9)
			{
				rb2.setEnabled(false);
				rb3.setEnabled(false);
			}
			else
			{
				rb1.setEnabled(false);
				rb4.setEnabled(false);
			}
			lifeline.setEnabled(false);
			 
		}
		
		// .......................submit code goes here ....................//
		else if(ae.getSource()==submit)
		{
			ans_given=1;
			
			if(options.getSelection()==null)
			{
				pa[count][0]="";
				//new MyScore(username,score).setVisible(true);
			}
			else
			{
				pa[count][0]=options.getSelection().getActionCommand();
				//new MyScore(username,score).setVisible(true);
			}
			
			for(int i=0;i<pa.length;i++)               //we are checking score for the last question only
			{
				if(pa[i][0].equals(qa[i][1]))
				{
					score+=5;
				}
				else
				{
					score+=0;
				}
			}
			this.setVisible(false);
			
			new MyScore(username,score).setVisible(true);
			
		}
		
	}
	
	
	//.......................PAINT method goes here.............................
	
	
	public void paint(Graphics g)
	{
		super.paint(g);                                   //first time parents constructor gets called
		
		String time="Time Left: "+timer+" seconds";
		g.setFont(new Font("Tahoma",Font.BOLD,18));
		g.setColor(Color.MAGENTA);
		
		if(timer>0)
		{
			g.drawString(time,700,250);	
			
			
		}
		
		else
		{   String time2="Time's Up!!";
			g.drawString(time2,700,250);
			
			//g.setColor(Color.BLUE);
		}
		
		timer--;
		
		
		try{
			Thread.sleep(1000);      //to set the timer interval for 1 sec
			repaint();                  //to start the timer counter
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(ans_given==1)      //when the person has answered and goes to next question
		{
		    ans_given=0;
			timer=15;
			
		}
		else if(timer<0)     //when timer up ,user could not answer  
		{
			timer=15;
			
			rb1.setEnabled(true);
			rb2.setEnabled(true);    //after times up all options will be visible again for the next question
			rb3.setEnabled(true);
			rb4.setEnabled(true);
			
			if(count==8)
			{
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			if(count==9)
			{
				if(options.getSelection()==null)          //no option selected,exam is over automatically
				{
					pa[count][0]="";
				 //	new MyScore(username,score).setVisible(true);
				}
				else
				{
					pa[count][0]=options.getSelection().getActionCommand();
					//new MyScore(username,score).setVisible(true);
				}
				
				for(int i=0;i<pa.length;i++)               //we are checking score after the last question only
				{
					if(pa[i][0].equals(qa[i][1]))
					{
						score+=5;
					}
					else
					{
						score+=0;
					}
				}
				this.setVisible(false);
				new MyScore(username,score).setVisible(true);
				
			}
			else                     //check for other questions, not the 10th question
			{                  //here we are just checking whther the guy has answered or not counting score only after the 10 th question
				
				
				if(options.getSelection()==null)
				{
					pa[count][0]="";
				}
				else
				{
					pa[count][0]=options.getSelection().getActionCommand();
				} 
				count++;
				start(count);                   //calling start function
			}
			
			
		}
	}
	//.............................definition of start goes here............
	
	
	public void start(int count)
	{
		l2.setText(" "+(count+1)+"."+q[count][0]);
		rb1.setLabel(q[count][1]);
		rb1.setActionCommand(q[count][1]);             //we are setting first options' value in rb1(radiobutton 1 and so on and so forth....)
		rb2.setLabel(q[count][2]);
		rb2.setActionCommand(q[count][2]);
		rb3.setLabel(q[count][3]);
		rb3.setActionCommand(q[count][3]);
		rb4.setLabel(q[count][4]);
		rb4.setActionCommand(q[count][4]);
		options.clearSelection();
		
		
	}
	
	
	
	
	

}
