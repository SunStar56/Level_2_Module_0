package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	ArrayList<String> guest;
	String format;
	String placeholder;
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.createUI();
	}
	void createUI(){
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Add Name");
		button2 = new JButton("View Names");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		button2.addActionListener(this);
		guest = new ArrayList<String>();
		format = "";
		
	}// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			placeholder=(JOptionPane.showInputDialog("Enter a name :"));
			guest.add(format);
		}
		else if (e.getSource()==button2) {
			for (String s : guest) {
				int i = 1;
				format+=("Guest " + i + " : " + s + "\n");
				i++;
			}
			JOptionPane.showMessageDialog(null, format);
		}
		
	}
}
