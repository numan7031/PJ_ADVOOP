package lab2;

import javax.swing.*;

public class Command1 {
	public static void main(String[] args){
		
		String name,grade1,grade2,msg;
		int graduateYear;
		float GPA;
		JFrame mywindows = new JFrame();
		
		mywindows.setSize(300,200);
		mywindows.setTitle("MyPrograme");
		mywindows.setVisible(true);
		
		name = JOptionPane.showInputDialog(mywindows,"What isyour name?");
		grade1 = JOptionPane.showInputDialog(mywindows,"What is your grade [0-4] in Computer Programming?");
		grade2 = JOptionPane.showInputDialog(mywindows, "What is your grade [0-4] in Software Development?");
		
		GPA = (Float.parseFloat(grade1)+Float.parseFloat(grade2))/2;
		
		msg = name + " is expected to get grade"+ GPA +"in OOP";
		
		if(GPA<2.00)
			graduateYear = 5;
		else
			graduateYear = 4;
		
		msg = msg +" and graduate in the"+ graduateYear +"th year!!";
		JOptionPane.showMessageDialog(mywindows, msg);
		
		System.exit(0);
	}

}
