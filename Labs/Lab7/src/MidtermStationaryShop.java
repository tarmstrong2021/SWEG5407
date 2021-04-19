import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MidtermStationaryShop extends JFrame {

	
		// TODO Auto-generated method stub

		// declare components (Labels, Text Fields, Buttons)
				JLabel lblItemName;
				JLabel lblNumofItems;
				JLabel lblUnitPrice;
				JLabel lblTotalPrice;
				
				

				JTextField txtItemName;
				JTextField txtNumofItems;
				JTextField txtUnitPrice;
				JTextField txtTotalPrice;
				

				JButton btnCalculate;
				JButton btnPrint;
				JButton btnExit;

				// constructor
				public MidtermStationaryShop() {

					// Set title for JFrame
					setTitle("Stationary Shop Price");

					// create container
					Container pane = getContentPane();
					pane.setLayout(new GridLayout(6, 2));

					// Initialize labels
					lblItemName = new JLabel("Enter Name of Item:  ", SwingConstants.RIGHT);
					lblNumofItems = new JLabel("Enter number of items: ", SwingConstants.RIGHT);
					lblUnitPrice = new JLabel("Enter the unit price:  ", SwingConstants.RIGHT);
					lblTotalPrice = new JLabel("Calculated total price:  ", SwingConstants.RIGHT);
					

					// Initialize text boxes
					txtItemName = new JTextField();
					txtNumofItems = new JTextField();
					txtUnitPrice = new JTextField();
					txtTotalPrice = new JTextField();
					

					// Initialize button
					// Create a class for button and implement Action Listener (see classes at
					// bottom of code)
					// Create an object for the class
					// Register object with the button object

					btnCalculate = new JButton("Calculate Total Price");
					CalculateButton calcButton = new CalculateButton();
					btnCalculate.addActionListener(calcButton);
					btnPrint = new JButton ("Print to File");
					PrintButton prntButton = new PrintButton();
					btnPrint.addActionListener(prntButton);
					btnExit = new JButton("Exit");
					ExitButton ebtn = new ExitButton();
					btnExit.addActionListener(ebtn);

					// add to container
					pane.add(lblItemName);
					pane.add(txtItemName);
					pane.add(lblNumofItems);
					pane.add(txtNumofItems);
					pane.add(lblUnitPrice);
					pane.add(txtUnitPrice);
					pane.add(lblTotalPrice);
					pane.add(txtTotalPrice);
					
					pane.add(btnCalculate);
					pane.add(btnPrint);
					pane.add(btnExit);

					setSize(1000, 800);
					setVisible(true);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}

				//Define Calculate button and action taken
				class CalculateButton implements ActionListener {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						double NumItems, UnitCost,TotalCost;
						
						NumItems = Double.parseDouble(txtNumofItems.getText());
						UnitCost = Double.parseDouble(txtUnitPrice.getText());
						TotalCost = NumItems * UnitCost;
				

					
						txtTotalPrice.setText("" + TotalCost);

					}
				}

					//Define Print button and action taken			
				class PrintButton implements ActionListener {
					
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String itemName;
						double NumItems, UnitCost,TotalCost;
						
						itemName = txtItemName.getText();
						NumItems = Double.parseDouble(txtNumofItems.getText());
						UnitCost = Double.parseDouble(txtUnitPrice.getText());
						TotalCost = NumItems * UnitCost;

						String str = "Name of item: " + itemName + "\nNumber in Stock: " + NumItems + "\nUnit Price: "
								+ UnitCost + "\nTotal Price: " + TotalCost;
						
						PrintWriter printWriter;
						try {
							printWriter = new PrintWriter("Inventory_" + itemName);
							printWriter.write(str);
							printWriter.close();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"Details sent to file - Inventory_" + itemName);

					}
				}

				//define exit button and action taken
				class ExitButton implements ActionListener {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.exit(0);
					}
				}
			}
	


