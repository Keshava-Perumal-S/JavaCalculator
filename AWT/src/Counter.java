import java.awt.*;
import java.awt.event.*;    
public class Counter extends Frame{
	TextField display;
	Button increment,reset;
	Counter()
	{
		display=new TextField("0");
		display.setBounds(50,50,100,30);
		add(display);
		increment =new Button("Increment");
		increment.setBounds(100,100,100,50);
		add(increment);
		increment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stu
				int num=Integer.valueOf(display.getText());
				num++;
				display.setText(String.valueOf(num)); 
			}
		});
		Button decrement =new Button("decrement");
		decrement.setBounds(250,100,100,50);
		add(decrement);
		decrement.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stu
				int num=Integer.valueOf(display.getText());
				num--;
				if(num<0) display.setText("No Neg value");
				else
				display.setText(String.valueOf(num)); 
				
			}
			
		});
		
		
		
		reset=new Button("reset");
		reset.setBounds(200,200,50,50);
		add(reset);
		reset.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText("0");
			}
		});
		
		
		
		 addWindowListener(new WindowAdapter()  {
                 
		            // Anonymous class to override windowClosing event 
		            public void windowClosing(WindowEvent e){ 
		                // Call dispodcse method 
		                dispose(); 
		            } 
		        }); 
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		
		
		
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Counter();

	}

}
