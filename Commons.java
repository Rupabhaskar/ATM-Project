package atm;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
	public Component Frame() {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#97f098"));
		
		//------------------LOGO----------------------------------
		JLabel me=new JLabel("RupaBhaskar's ATM");
		me.setBounds(0, 30, 600, 120);
		me.setHorizontalAlignment(JLabel.CENTER);
		me.setFont(new Font("Times New Roman", Font.BOLD, 38));
		JLabel atm_man = new JLabel("MANAGEMENT SYSTEM");
		atm_man.setBounds(0, 140, 600, 20);
		atm_man.setHorizontalAlignment(JLabel.CENTER);
		atm_man.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(atm_man);
		frame.add(me);
		//-----------------------------------------------
		return frame;
	}
}