import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JTable;


public class info {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info window = new info();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setText("\u0E40\u0E21\u0E19\u0E39 : \u0E1C\u0E31\u0E14\u0E01\u0E23\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E30 | \u0E1E\u0E25\u0E31\u0E07\u0E07\u0E32\u0E19 (cal) : 440\r\n\u0E1C\u0E31\u0E14\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E16\u0E37\u0E2D\u0E40\u0E1B\u0E47\u0E19\u0E2B\u0E19\u0E36\u0E48\u0E07\u0E43\u0E19\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E1F\u0E32\u0E2A\u0E15\u0E4C\u0E1F\u0E39\u0E4A\u0E14\u0E2B\u0E23\u0E37\u0E2D\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E08\u0E32\u0E19\u0E14\u0E48\u0E27\u0E19\u0E22\u0E2D\u0E14\u0E2E\u0E34\u0E15\u0E02\u0E2D\u0E07\u0E04\u0E19\u0E44\u0E17\u0E22 \u0E43\u0E1A\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32 (Holy basil) \u0E21\u0E35\u0E1B\u0E23\u0E30\u0E42\u0E22\u0E0A\u0E19\u0E4C \u0E21\u0E32\u0E01\u0E21\u0E32\u0E22 \u0E21\u0E35\u0E40\u0E1A\u0E15\u0E49\u0E32\u0E41\u0E04\u0E42\u0E23\u0E17\u0E35\u0E19, \u0E40\u0E2B\u0E25\u0E47\u0E01, \u0E1F\u0E2D\u0E2A\u0E1F\u0E2D\u0E23\u0E31\u0E2A \u0E41\u0E25\u0E30\u0E27\u0E34\u0E15\u0E32\u0E21\u0E35\u0E19\u0E0B\u0E35\u0E2A\u0E39\u0E07 \u0E21\u0E35\u0E2A\u0E23\u0E23\u0E1E\u0E04\u0E38\u0E13\u0E0A\u0E48\u0E27\u0E22\u0E44\u0E25\u0E48\u0E25\u0E21\u0E43\u0E19\u0E01\u0E23\u0E30\u0E40\u0E1E\u0E32\u0E30 \u0E41\u0E01\u0E49\u0E17\u0E49\u0E2D\u0E07\u0E2D\u0E37\u0E48\u0E14 \u0E08\u0E38\u0E01\u0E40\u0E2A\u0E35\u0E22\u0E14 \u0E01\u0E25\u0E34\u0E48\u0E19\u0E43\u0E1A\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E21\u0E35\u0E25\u0E31\u0E01\u0E29\u0E13\u0E30\u0E40\u0E09\u0E1E\u0E32\u0E30 \u0E19\u0E34\u0E22\u0E21\u0E19\u0E33\u0E21\u0E32\u0E1B\u0E23\u0E30\u0E01\u0E2D\u0E1A\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E14\u0E31\u0E1A\u0E04\u0E32\u0E27\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2A\u0E31\u0E15\u0E27\u0E4C \u0E2A\u0E33\u0E2B\u0E23\u0E31\u0E1A\u0E40\u0E21\u0E19\u0E39\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32 \u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E40\u0E1B\u0E25\u0E35\u0E48\u0E22\u0E19\u0E27\u0E31\u0E15\u0E16\u0E38\u0E14\u0E34\u0E1A \u0E44\u0E14\u0E49\u0E2B\u0E25\u0E32\u0E22\u0E2D\u0E22\u0E48\u0E32\u0E07 \u0E2D\u0E32\u0E08\u0E40\u0E1B\u0E47\u0E19\u0E2B\u0E21\u0E39, \u0E44\u0E01\u0E48, \u0E01\u0E38\u0E49\u0E07, \u0E2B\u0E21\u0E36\u0E01 \u0E40\u0E1B\u0E47\u0E19\u0E15\u0E49\u0E19 \u0E40\u0E2A\u0E23\u0E34\u0E1F\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E01\u0E31\u0E1A\u0E02\u0E49\u0E32\u0E27\u0E2A\u0E27\u0E22\u0E23\u0E49\u0E2D\u0E19\u0E46 \u0E41\u0E25\u0E30\u0E44\u0E02\u0E48\u0E14\u0E32\u0E27 \u0E2D\u0E23\u0E48\u0E2D\u0E22\u0E22\u0E34\u0E48\u0E07\u0E19\u0E31\u0E01\r\n\r\n\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E23\u0E38\u0E07 + \u0E2A\u0E48\u0E27\u0E19\u0E1C\u0E2A\u0E21\r\n* \u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2A\u0E31\u0E15\u0E27\u0E4C\u0E17\u0E35\u0E48\u0E40\u0E23\u0E32\u0E0A\u0E2D\u0E1A 450 \u0E01\u0E23\u0E31\u0E21 (\u0E2B\u0E31\u0E48\u0E19\u0E40\u0E1B\u0E47\u0E19\u0E0A\u0E34\u0E49\u0E19\u0E40\u0E25\u0E47\u0E01\u0E46 \u0E1E\u0E2D\u0E14\u0E35\u0E33\u0E04\u0E33)\r\n* \u0E01\u0E23\u0E30\u0E40\u0E17\u0E35\u0E22\u0E21 5 \u0E01\u0E25\u0E35\u0E1A (\u0E2A\u0E31\u0E1A\u0E43\u0E2B\u0E49\u0E25\u0E30\u0E40\u0E2D\u0E35\u0E22\u0E14)\r\n* \u0E2B\u0E31\u0E27\u0E2B\u0E2D\u0E21\u0E43\u0E2B\u0E0D\u0E48 1/2 \u0E16\u0E49\u0E27\u0E22\u0E15\u0E27\u0E07 (\u0E2B\u0E31\u0E48\u0E19\u0E40\u0E1B\u0E47\u0E19\u0E0A\u0E34\u0E49\u0E19\u0E1A\u0E32\u0E07\u0E46)\r\n* \u0E19\u0E49\u0E33\u0E21\u0E31\u0E19\u0E1E\u0E37\u0E0A 2 \u0E0A\u0E49\u0E2D\u0E19\u0E42\u0E15\u0E4A\u0E30\r\n* \u0E0B\u0E34\u0E2D\u0E34\u0E4A\u0E27\u0E14\u0E33 2 \u0E0A\u0E49\u0E2D\u0E19\u0E0A\u0E32 \r\n* \u0E19\u0E49\u0E33\u0E1B\u0E25\u0E32 2 \u0E0A\u0E49\u0E2D\u0E19\u0E42\u0E15\u0E4A\u0E30\r\n* \u0E43\u0E1A\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32 1 \u0E16\u0E49\u0E27\u0E22\u0E15\u0E27\u0E07\r\n* \u0E1E\u0E23\u0E34\u0E01 7 \u0E40\u0E21\u0E47\u0E14 (\u0E17\u0E38\u0E1A\u0E1E\u0E2D\u0E41\u0E2B\u0E25\u0E01\u0E41\u0E25\u0E30\u0E2A\u0E31\u0E1A\u0E2B\u0E22\u0E32\u0E1A\u0E46)\r\n* \u0E1E\u0E23\u0E34\u0E01\u0E44\u0E17\u0E22\u0E1B\u0E48\u0E19\r\n\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E2B\u0E15\u0E38 : \u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E43\u0E2A\u0E48\u0E1C\u0E31\u0E01\u0E2D\u0E37\u0E48\u0E19\u0E46\u0E25\u0E07\u0E44\u0E1B\u0E1C\u0E31\u0E14\u0E23\u0E48\u0E27\u0E21\u0E14\u0E49\u0E27\u0E22\u0E40\u0E0A\u0E48\u0E19 \u0E41\u0E04\u0E23\u0E2D\u0E17, \u0E16\u0E31\u0E48\u0E27\u0E1D\u0E31\u0E01, \u0E02\u0E49\u0E32\u0E27\u0E42\u0E1E\u0E14\u0E2D\u0E48\u0E2D\u0E19 \u0E40\u0E1B\u0E47\u0E19\u0E15\u0E49\u0E19\r\n\r\n \u0E27\u0E34\u0E18\u0E35\u0E17\u0E33\r\n1. \u0E15\u0E31\u0E49\u0E07\u0E19\u0E49\u0E33\u0E21\u0E31\u0E19\u0E43\u0E19\u0E01\u0E23\u0E30\u0E17\u0E30\u0E08\u0E19\u0E23\u0E49\u0E2D\u0E19 \u0E08\u0E32\u0E01\u0E19\u0E31\u0E49\u0E19\u0E43\u0E2A\u0E48\u0E01\u0E23\u0E30\u0E40\u0E17\u0E35\u0E22\u0E21\u0E41\u0E25\u0E30\u0E1C\u0E31\u0E14 5-10 \u0E27\u0E34\u0E19\u0E32\u0E17\u0E35 \u0E43\u0E2A\u0E48\u0E2B\u0E2D\u0E21\u0E43\u0E2B\u0E0D\u0E48 \u0E41\u0E25\u0E30\u0E1C\u0E31\u0E14\u0E15\u0E48\u0E2D\u0E44\u0E1B\u0E2D\u0E35\u0E01\u0E2A\u0E31\u0E01\u0E1E\u0E31\u0E01\u0E08\u0E19\u0E01\u0E25\u0E34\u0E48\u0E19\u0E40\u0E23\u0E34\u0E48\u0E21\u0E2B\u0E2D\u0E21 \u0E43\u0E2A\u0E48\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2A\u0E31\u0E15\u0E27\u0E4C\u0E25\u0E07\u0E15\u0E48\u0E2D\u0E41\u0E25\u0E30\u0E1C\u0E31\u0E14\u0E08\u0E19\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2A\u0E31\u0E15\u0E27\u0E4C\u0E2A\u0E38\u0E01\u0E17\u0E31\u0E48\u0E27\r\n2. \u0E43\u0E2A\u0E48\u0E1E\u0E23\u0E34\u0E01\u0E41\u0E25\u0E30\u0E0B\u0E34\u0E2D\u0E34\u0E4A\u0E27\u0E14\u0E33\u0E25\u0E07\u0E44\u0E1B\u0E43\u0E19\u0E01\u0E23\u0E30\u0E17\u0E30 \u0E1C\u0E31\u0E14\u0E15\u0E48\u0E2D\u0E44\u0E1B\u0E2D\u0E35\u0E01 15-20 \u0E27\u0E34\u0E19\u0E32\u0E17\u0E35\r\n3. \u0E1B\u0E23\u0E38\u0E07\u0E23\u0E2A\u0E14\u0E49\u0E27\u0E22\u0E19\u0E49\u0E33\u0E1B\u0E25\u0E32 \u0E41\u0E25\u0E30\u0E43\u0E2A\u0E48\u0E43\u0E1A\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E25\u0E07\u0E44\u0E1B\u0E43\u0E19\u0E01\u0E23\u0E30\u0E17\u0E30 \u0E1B\u0E34\u0E14\u0E44\u0E1F\u0E08\u0E32\u0E01\u0E19\u0E31\u0E49\u0E19\u0E1C\u0E31\u0E14\u0E43\u0E2B\u0E49\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E1C\u0E2A\u0E21\u0E01\u0E31\u0E1A\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2A\u0E31\u0E15\u0E27\u0E4C\u0E08\u0E19\u0E17\u0E31\u0E48\u0E27\r\n4. \u0E15\u0E31\u0E01\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E43\u0E2A\u0E48\u0E08\u0E32\u0E19 \u0E42\u0E23\u0E22\u0E2B\u0E19\u0E49\u0E32\u0E14\u0E49\u0E27\u0E22\u0E1E\u0E23\u0E34\u0E01\u0E44\u0E17\u0E22 \u0E40\u0E2A\u0E34\u0E23\u0E1F\u0E17\u0E31\u0E19\u0E17\u0E35\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E02\u0E49\u0E32\u0E27\u0E2A\u0E27\u0E22\u0E23\u0E49\u0E2D\u0E19\u0E46 \u0E43\u0E19\u0E1A\u0E32\u0E07\u0E04\u0E23\u0E31\u0E49\u0E07\u0E44\u0E02\u0E48\u0E40\u0E08\u0E35\u0E22\u0E27\u0E2B\u0E23\u0E37\u0E2D\u0E44\u0E02\u0E48\u0E14\u0E32\u0E27\u0E21\u0E31\u0E01\u0E08\u0E30\u0E40\u0E2A\u0E34\u0E23\u0E1F\u0E23\u0E48\u0E27\u0E21\u0E14\u0E49\u0E27\u0E22");
		textArea.setBounds(0, 0, 429, 285);
		frame.getContentPane().add(textArea);
	}
}
