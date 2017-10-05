package lab2;

import javax.swing.*;

public class Command2 {
	public static void main(String[] args){
		
		String name,score,  message;
		int result;
		JFrame mywindows = new JFrame();
		mywindows.setSize(300, 200);
		mywindows.setTitle("My First Java Program");
		mywindows.setVisible(true);
		
		name = JOptionPane.showInputDialog(mywindows,"What is your name?");
		score = JOptionPane.showInputDialog(mywindows,"What is your score?");
		
		result = Integer.parseInt(score);
		
		if (result > 85)
			message = name + " will get grade A!";
			else if (result > 75)
			message = name + " will get grade B!";
			else if (result > 65)
			message = name + " will get grade C!";
			else if (result > 55)
			message = name + " will get grade D!";
			else
			message = name +" will get grade F!";
			JOptionPane.showMessageDialog(mywindows, message);
			System.exit(0);
		
	}

}
