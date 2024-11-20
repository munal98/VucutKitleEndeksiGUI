import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWeight;
	private JTextField txtHeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblWeight = new JLabel("Enter your weight (kgs):");
		GridBagConstraints gbc_lblWeight = new GridBagConstraints();
		gbc_lblWeight.anchor = GridBagConstraints.EAST;
		gbc_lblWeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeight.gridx = 0;
		gbc_lblWeight.gridy = 1;
		contentPane.add(lblWeight, gbc_lblWeight);
		
		txtWeight = new JTextField();
		GridBagConstraints gbc_txtWeight = new GridBagConstraints();
		gbc_txtWeight.insets = new Insets(0, 0, 5, 0);
		gbc_txtWeight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWeight.gridx = 1;
		gbc_txtWeight.gridy = 1;
		contentPane.add(txtWeight, gbc_txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lblHeight = new JLabel("Enter your height (meters):");
		GridBagConstraints gbc_lblHeight = new GridBagConstraints();
		gbc_lblHeight.anchor = GridBagConstraints.EAST;
		gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeight.gridx = 0;
		gbc_lblHeight.gridy = 2;
		contentPane.add(lblHeight, gbc_lblHeight);
		
		txtHeight = new JTextField();
		GridBagConstraints gbc_txtHeight = new GridBagConstraints();
		gbc_txtHeight.insets = new Insets(0, 0, 5, 0);
		gbc_txtHeight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHeight.gridx = 1;
		gbc_txtHeight.gridy = 2;
		contentPane.add(txtHeight, gbc_txtHeight);
		txtHeight.setColumns(10);
		
		
		
		
		
		
		JLabel lblResult = new JLabel("");
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.insets = new Insets(0, 0, 5, 0);
		gbc_lblResult.gridx = 1;
		gbc_lblResult.gridy = 4;
		contentPane.add(lblResult, gbc_lblResult);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnClear) {
					txtHeight.setText("");
					txtWeight.setText("");
					lblResult.setText("");
				}
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 0;
		gbc_btnClear.gridy = 3;
		contentPane.add(btnClear, gbc_btnClear);
		JButton btnCalculate = new JButton("Calculate BMI");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCalculate) {
					double w = Double.valueOf(txtWeight.getText());
					double h = Double.valueOf(txtHeight.getText());
					double BMI = w / (h * h);
					lblResult.setText("BMI is " + BMI);
				}
			}
		});
		GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
		gbc_btnCalculate.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalculate.gridx = 1;
		gbc_btnCalculate.gridy = 3;
		contentPane.add(btnCalculate, gbc_btnCalculate);
	}

}
