import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
	TextField display;
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,minus,mul,div,clear,equals;
	Calculator(){
		display=new TextField("0");
		display.setBounds(50,50,400,50);
		
		btn0=new Button("0");
		btn0.setBounds(50,400,80,80);
		btn0.addActionListener(this);
		
		btn1=new Button("1");
		btn1.setBounds(50,300,80,80);
		btn1.addActionListener(this);
		
		btn2=new Button("2");
		btn2.setBounds(150,300,80,80);
		btn2.addActionListener(this);
		
		btn3=new Button("3");
		btn3.setBounds(250,300,80,80);
		btn3.addActionListener(this);
		
		btn4=new Button("4");
		btn4.setBounds(50,200,80,80);
		btn4.addActionListener(this);
		
		btn5=new Button("5");
		btn5.setBounds(150,200,80,80);
		btn5.addActionListener(this);
		
		btn6=new Button("6");
		btn6.setBounds(250,200,80,80);
		btn6.addActionListener(this);
		
		btn7=new Button("7");
		btn7.setBounds(50,100,80,80);
		btn7.addActionListener(this);
		
		btn8=new Button("8");
		btn8.setBounds(150,100,80,80);
		btn8.addActionListener(this);
		
		btn9=new Button("9");
		btn9.setBounds(250,100,80,80);
		btn9.addActionListener(this);

		plus=new Button("+");
		plus.setBounds(350,300,80,80);
		plus.addActionListener(this);
		
		minus=new Button("-");
		minus.setBounds(350,200,80,80);
		minus.addActionListener(this);

		mul=new Button("*");
		mul.setBounds(350,100,80,80);
		mul.addActionListener(this);

		div=new Button("/");
		div.setBounds(350,400,80,80);
		div.addActionListener(this);

		equals=new Button("=");
		equals.setBounds(150,400,80,80);
		equals.addActionListener(this);

		clear=new Button("C");
		clear.setBounds(250,400,80,80);
		clear.addActionListener(this);
		
		add(display);
		add(btn0);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(plus);
		add(minus);
		add(mul);
		add(div);
		add(equals);
		add(clear);
		
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setTitle("Calculator");
	

	 addWindowListener(new WindowAdapter()  {
            
	            // Anonymous class to override windowClosing event 
	            public void windowClosing(WindowEvent e){ 
	                // Call dispodcse method 
	                dispose(); 
	            } 
	        }); 
	 
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn0)
		{
			String str1=display.getText();
			str1+="0";
			display.setText(str1);
		}
		if(e.getSource()==btn1)
		{
			String str1=display.getText();
			str1+="1";
			display.setText(str1);
		}
		if(e.getSource()==btn2)
		{
			String str1=display.getText();
			str1+="2";
			display.setText(str1);
		}
		if(e.getSource()==btn3)
		{
			String str1=display.getText();
			str1+="3";
			display.setText(str1);
		}
		if(e.getSource()==btn4)
		{
			String str1=display.getText();
			str1+="4";
			display.setText(str1);
		}
		if(e.getSource()==btn5)
		{
			String str1=display.getText();
			str1+="5";
			display.setText(str1);
		}
		if(e.getSource()==btn6)
		{
			String str1=display.getText();
			str1+="6";
			display.setText(str1);
		}
		if(e.getSource()==btn7)
		{
			String str1=display.getText();
			str1+="7";
			display.setText(str1);
		}
		if(e.getSource()==btn8)
		{
			String str1=display.getText();
			str1+="8";
			display.setText(str1);
		}
		if(e.getSource()==btn9)
		{
			String str1=display.getText();
			str1+="9";
			display.setText(str1);
		}
		if(e.getSource()==clear)
		{
			String str1="";
			display.setText(str1);
		}
		
		if(e.getSource()==plus)
		{
			String str1=display.getText();
			str1+="+";
			display.setText(str1);
		}
		if(e.getSource()==minus)
		{
			String str1=display.getText();
			str1+="-";
			display.setText(str1);
		}
		
		if(e.getSource()==mul)
		{
			String str1=display.getText();
			str1+="*";
			display.setText(str1);
		}
		
		if(e.getSource()==div)
		{
			String str1=display.getText();
			str1+="/";
			display.setText(str1);
		}
		if(e.getSource()==equals)
		{
			try {
			String str1=display.getText();
			
			int a,b,i;
			char operator = 0;
			
			
			String temp1="",temp2="";
			for( i=0;i<str1.length();i++)
			{
				if(Character.isDigit(str1.charAt(i))) {
					temp1+=str1.charAt(i);
				}
				else
				{
					operator=str1.charAt(i);
					break;
				}
			}
			temp2=str1.substring(i+1);
			a=Integer.parseInt(temp1);
			b=Integer.parseInt(temp2);
			int res=0;
			
				switch(operator)
				{
					case '+':
						res=a+b;
						break;
					case '-':
						res=a-b;
						break;
					case '*':
						res=a*b;
						break;
					case '/':
						res=a/b;
						break;	
				}
				display.setText(String.valueOf(res));
			}
			catch(Exception ex)
			{
				display.setText("Syntax Error");
			}
			
					
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
