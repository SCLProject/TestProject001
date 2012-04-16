package oit.is.sclab.testproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author masanori
 *
 */
@SuppressWarnings("serial")
public class TestClassMain extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JFrame thisFrame = this;
	JPanel mPanel;
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Test Projectです");
		TestClassMain tcMain = new TestClassMain();
		
		tcMain.setTitle("Test Window");
		tcMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tcMain.setSize(640,480);
		tcMain.setVisible(true);	

	}
	
	/**
	 * Constractor
	 */
	public TestClassMain(){
		
		super();
		mPanel = new JPanel();
		
		JButton mButton01 = new JButton();
		JButton mButton02 = new JButton();
		
		mButton01.setText("Button 01");
		mButton02.setText("Button 02");
		
		mButton01.setActionCommand("Button01");
		mButton02.setActionCommand("Button02");
		
		mButton01.addActionListener(this);
		mButton02.addActionListener(this);
		JButton mButton03 = new JButton();
		mButton03.addActionListener(this);
		mButton03.setText("Button03");
		mPanel.add(mButton01);
		mPanel.add(mButton02);
		mPanel.add(mButton03);
		
		
		
		
		this.setContentPane(mPanel);
		
		
		
		
		
		
		
		
		
	}
	




	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if("Button01".equals(e.getActionCommand())){
			
		}
		if("Button02".equals(e.getActionCommand())){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




















	
	
	
	
	
	

}
