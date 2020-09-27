import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InitialSnakeGameFrame extends JFrame{
	private JTextField txtnull;
	private JButton btnr, btnl, btnu, btnd;
	
	public InitialSnakeGameFrame()
	{
		this.setSize(400, 300);
		this.setTitle("Initial Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addaccount();
	}
	
	public void addaccount()
	{
		txtnull=new JTextField("Snake           ::");
		txtnull.setBounds(10, 10, 80, 20);
		this.add(txtnull);
		
		btnu=new JButton("^");
		btnu.setBounds(120, 120, 105, 25);
		btnu.addActionListener(new InitialSnakeGameHandler());
		this.add(btnu);
		
		btnl=new JButton("<");
		btnl.setBounds(50, 150, 105, 25);
		btnl.addActionListener(new InitialSnakeGameHandler());
		this.add(btnl);
		
		btnr=new JButton(">");
		btnr.setBounds(205, 150, 105, 25);
		btnr.addActionListener(new InitialSnakeGameHandler());
		this.add(btnr);
		
		btnd=new JButton("v");
		btnd.setBounds(120, 180, 105, 25);
		btnd.addActionListener(new InitialSnakeGameHandler());
		this.add(btnd);	
	}
	
	public class InitialSnakeGameHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnu)
			{
				up_click();
			}
			else if(e.getSource()==btnl)
			{
				left_click();
			}
			else if(e.getSource()==btnr)
			{
				right_click();
			}
			else if(e.getSource()==btnd)
			{
				down_click();
			}
			
		}
		public void up_click()
		{
			if(txtnull.getY()-15<0)
			{
				txtnull.setBounds(txtnull.getX()-15, 300, txtnull.getWidth(),txtnull. getHeight());
			}
			else
				txtnull.setBounds(txtnull.getX(), txtnull.getY()-15, txtnull.getWidth(),txtnull. getHeight());
		}
		
		public void left_click()
		{
			if(txtnull.getX()-15<0)
			{
				txtnull.setBounds(400-15-txtnull.getWidth(), txtnull.getY()-15, txtnull.getWidth(), txtnull.getHeight());
			}
			else
				txtnull.setBounds(txtnull.getX()-15, txtnull.getY(), txtnull.getWidth(), txtnull.getHeight());
		}
		
		public void right_click()
		{
			if(txtnull.getX()+15+txtnull.getWidth()>400)
			{
				txtnull.setBounds(0, txtnull.getY()+15, txtnull.getWidth(), txtnull.getHeight());
			}
			else
				txtnull.setBounds(txtnull.getX()+15, txtnull.getY(), txtnull.getWidth(), txtnull.getHeight());
		}
		
		public void down_click()
		{
			if(txtnull.getY()+15+txtnull.getHeight()>300)
			{
				txtnull.setBounds(txtnull.getX()+15, 0, txtnull.getWidth(), txtnull.getHeight());
			}
			else
				txtnull.setBounds(txtnull.getX(), txtnull.getY()+15, txtnull.getWidth(), txtnull.getHeight());
		}
		
	}

}
