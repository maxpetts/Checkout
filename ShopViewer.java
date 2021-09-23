package eeub35.bangor.ac.uk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopViewer extends JFrame {

	private JPanel contentPane;
	private Shop shop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopViewer frame = new ShopViewer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShopViewer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Shop panel = new Shop();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel row5 = new JPanel();
		FlowLayout fl_row5 = (FlowLayout) row5.getLayout();
		contentPane.add(row5, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Add Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		row5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Step Time");
		row5.add(btnNewButton_1);
	}

}
