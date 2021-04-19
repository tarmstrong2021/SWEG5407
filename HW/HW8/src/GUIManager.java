
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIManager {

	public GUIManager() {
		createPaycheckUI();
	}

	private void createPaycheckUI() {
		// TODO Auto-generated method stub

		JFrame jframe = new JFrame("Employee Paycheck Calculator");
		jframe.setLayout(null);
		JLabel empName = new JLabel("Enter Employee Name");
		empName.setBounds(10, 50, 150, 20);
		JTextField empNametxt = new JTextField(" ");
		empNametxt.setBounds(200, 50, 150, 20);
		JLabel empId = new JLabel("Enter Employee Id");
		empId.setBounds(10, 90, 150, 20);
		JTextField empIdtxt = new JTextField(" ");
		empIdtxt.setBounds(200, 90, 150, 20);
		JLabel numHours = new JLabel("Hours worked/month");
		numHours.setBounds(10, 130, 150, 20);
		JTextField numHourstxt = new JTextField(" ");
		numHourstxt.setBounds(200, 130, 150, 20);
		JLabel empType = new JLabel("Select Employee Type");
		empType.setBounds(10, 170, 150, 20);
		String[] sTypes = { "PartTime", "FullTime" };
		JComboBox empTypeBox = new JComboBox(sTypes);
		empTypeBox.setBounds(200, 170, 150, 20);
		JButton calcButton = new JButton("Calculate Yearly Pay");
		calcButton.setBounds(120, 210, 160, 20);
		calcButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (empTypeBox.getSelectedItem().equals("PartTime")) {
					// Instruction 1 . If 'PartTime' is selected from the drop
					// down, get employee name,
					// id,number of hours from the text boxes, pass them while
					// creating
					// part time employee object as shown below
				    // Employee pEmp = new PartTimeEmployee(name, id, hours);
					// Instruction 2 call parent's method calculatePay() as
					// shown below
					// pEmp.calculatePay()

					String name = empNametxt.getText();
					String id = empIdtxt.getText();
					int hours = Integer.parseInt(numHourstxt.getText());
					
					
					Employee pEmp = new PartTimeEmployee(name, id, hours);
					pEmp.calcPay();
					
					System.out.println(pEmp.toString());

				
				}
				if (empTypeBox.getSelectedItem().equals("FullTime")) {
					// Instruction 3 . If 'FullTime' is selected from the drop
					// down, get employee name,
					// id,number of hours from the text boxes, pass them while
					// creating
					// full time employee object along with bonus (15000 per
					// year)

					// Instruction 4 call parent's method calculatePay()
			
					
					String name = empNametxt.getText();
					String id = empIdtxt.getText();
					int hours = Integer.parseInt(numHourstxt.getText());
					
					
					Employee fEmp = new FullTimeEmployee(name, id, hours);
					fEmp.calcPay();
					
					System.out.println(fEmp.toString());
				}
			}
		});
		jframe.add(empName);
		jframe.add(empNametxt);
		jframe.add(empId);
		jframe.add(empIdtxt);
		jframe.add(numHours);
		jframe.add(numHourstxt);
		jframe.add(empType);
		jframe.add(empTypeBox);
		jframe.add(calcButton);
		jframe.setSize(400, 300);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIManager();
	}

}