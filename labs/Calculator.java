import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator implements ActionListener{
	JFrame fcal;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton bplus,bminus,bmul,bdiv,bpoint,beql,bclr;
	JPanel pButtons;
	JTextField tans;
	JLabel mycal;
	String value="";
	public Calculator()
	{
		initGUI();
	}
	
	public void initGUI()
	{
		fcal=new JFrame();
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		
		
		bplus= new JButton("+");
		bminus= new JButton("-");
		bmul= new JButton("*");
		bdiv= new JButton("/");
		bpoint= new JButton(".");
		beql= new JButton("=");
		bclr= new JButton("C");
		
		tans=new JTextField();
		mycal=new JLabel("My Calculator");
		
		pButtons=new JPanel(new GridLayout(4,4));  //also we can set layout by pButtons.setLayout(new GridLayout(4,4))
		
		pButtons.add(b1);
		pButtons.add(b2);
		pButtons.add(b3);
		pButtons.add(bclr);
		pButtons.add(b4);
		pButtons.add(b5);
		pButtons.add(b6);
		pButtons.add(bmul);
		pButtons.add(b7);
		pButtons.add(b8);
		pButtons.add(b9);
		pButtons.add(bminus);
		pButtons.add(b0);
		pButtons.add(bpoint);
		pButtons.add(bplus);
		pButtons.add(beql);
		
		
		Container c=fcal.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(tans,BorderLayout.NORTH);
		c.add(mycal,BorderLayout.SOUTH);
		c.add(pButtons,BorderLayout.CENTER);
		
		fcal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fcal.setSize(300,300);
		fcal.setVisible(true);
		
		 b0.addActionListener(this);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 bplus.addActionListener(this);
		 bminus.addActionListener(this);
		 bmul.addActionListener(this);
		 beql.addActionListener(this);
		 bclr.addActionListener(this);
		 bpoint.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent a)
	{

			if(a.getSource()==b0){
				value+=0;
				tans.setText(value);
			}
			if(a.getSource()==b1){
				value+=1;
			tans.setText(value);
			}
			if(a.getSource()==b2){
				value+=2;
			tans.setText(value);
			}
			if(a.getSource()==b3){
				value+=3;
			tans.setText(value);
			}
			if(a.getSource()==b4){
				value+=4;
				tans.setText(value);
			}
			if(a.getSource()==b5){
				value+=5;
			tans.setText(value);
			}
			if(a.getSource()==b6){
				value+=6;
			    tans.setText(value);
			}
			if(a.getSource()==b7){
				value+=7;
				tans.setText(value);
			}
			if(a.getSource()==b8){
				value+=8;
				tans.setText(value);
				}
			if(a.getSource()==b9){
				value+=9;
				tans.setText(value);
			}
			
			if(a.getSource()==bplus){
				value+='+';
				tans.setText(value);
			}
			if(a.getSource()==bmul){
				value+='*';
				tans.setText(value);
			}
			if(a.getSource()==bdiv){
				value+='/';
				tans.setText(value);
			}
			if(a.getSource()==bminus){
				value+='-';
				tans.setText(value);
			}
			if(a.getSource()==bpoint){
				value+='.';
				tans.setText(value);
			}
			
			
			
			if(a.getSource()==beql){
				
					String global = tans.getText();
					
					
					ScriptEngineManager mgr = new ScriptEngineManager();
				    ScriptEngine engine = mgr.getEngineByName("JavaScript");
				    try {
						String s = engine.eval(global).toString();
						tans.setText(s);
						
						
					} catch (ScriptException e1) {
						e1.printStackTrace();
					}
				    
			}
			if(a.getSource()==bclr){
				value="";
				tans.setText(value);
			}

	}
	
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
	}
}