package SIS;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SIS_GUI {

	public SIS_GUI() {
		createStudentGUI();
	}

	private void createStudentGUI() {
		// Create list of courses and initialize as empty
		List<Course> stuList = new ArrayList<>();

		// create Jframe gui fields
		JFrame jframe = new JFrame("Tom's Wonderful Student Information System");
		jframe.setLayout(new GridLayout(8, 4));
		JLabel fName = new JLabel("Enter Student First Name - Required");
		fName.setForeground(Color.RED);
		JTextField fNametxt = new JTextField(" ");
		JLabel lName = new JLabel("Enter Student Last Name - Required");
		lName.setForeground(Color.RED);
		JTextField lNametxt = new JTextField(" ");
		JLabel stuEmail = new JLabel("Enter Student Email - Required");
		stuEmail.setForeground(Color.RED);
		JTextField stuEmailtxt = new JTextField(" ");
		JLabel dob = new JLabel("Enter Date of Birth (mm/dd/yy) - Required");
		dob.setForeground(Color.RED);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
		JFormattedTextField dobtxt = new JFormattedTextField(dateFormat);
		JLabel course = new JLabel("Select Course Name");
		String[] courseType = { "Biology", "Computer Science", "Philosophy", "English", "History", "Math",
				"Engineering" };
		JComboBox courseTypeBox = new JComboBox(courseType);
		courseTypeBox.setEditable(true); // allows search by typing in combo box
		JLabel courseNum = new JLabel("Select Course Number");
		course.setBounds(10, 170, 150, 20);
		Integer[] courseNumType = { 101, 102, 105, 201, 202, 303, 5427 };
		JComboBox courseNumTypeBox = new JComboBox(courseNumType);
		courseNumTypeBox.setEditable(true); // allows search by typing in combo box

		// create "Add Course" button and add ActionListener
		JButton addButton = new JButton("Add Course");
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ensures all required fields have text
				if (!fNametxt.getText().trim().isEmpty() && !lNametxt.getText().trim().isEmpty()
						&& !stuEmailtxt.getText().trim().isEmpty() && !dobtxt.getText().trim().isEmpty()) {

					// very rudimentary check for a real email address
					String email = stuEmailtxt.getText();
					if (!email.contains("@")) {
						JOptionPane.showMessageDialog(null, "Please enter a valid email");
					} else {
						
						// create new student object based on getText from JFrame
						Student studentobj = new Student(fNametxt.getText(), lNametxt.getText(), stuEmailtxt.getText(),
								dobtxt.getText(), stuList);
						// call student getCourses() method to return list of course objects
						List<Course> courseList = studentobj.getCourses();
						
						//allows a student to enroll in only 5 courses (I don't love that this is hard-coded)
						if(courseList.size()<5) {

						// create new course object with information from JFrame
						Course courseobj = new Course(courseTypeBox.getSelectedItem().toString(),
								(int) courseNumTypeBox.getSelectedItem());

						// prevents enrolling in the same course more than once
						if (!courseList.contains(courseobj)) {

							studentobj.addCourse(courseobj);

						} else
							// output message to JOptionpane dialogue
							JOptionPane.showMessageDialog(null, "You are already enrolled in this course");
						}else JOptionPane.showMessageDialog(null, "You are already enrolled in the maximum number of courses");
					}
				} else
					//output error if name, email, dob are not provided
					JOptionPane.showMessageDialog(null, "Required information is missing");
			}

		});

		// create "Drop Course" button and add ActionListener
		JButton dropButton = new JButton("Drop Course");
		dropButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// ensures all required fields have text
				if (!fNametxt.getText().trim().isEmpty() && !lNametxt.getText().trim().isEmpty()
						&& !stuEmailtxt.getText().trim().isEmpty() && !dobtxt.getText().trim().isEmpty()) {

					// very rudimentary check for a real email address
					String email = stuEmailtxt.getText();
					if (!email.contains("@")) {
						JOptionPane.showMessageDialog(null, "Please enter a valid email");
					} else {

						Student studentobj = new Student(fNametxt.getText(), lNametxt.getText(), stuEmailtxt.getText(),
								dobtxt.getText(), stuList);
						List<Course> courseList = studentobj.getCourses();
						Course courseobj = new Course(courseTypeBox.getSelectedItem().toString(),
								(int) courseNumTypeBox.getSelectedItem());

						// checks if student is enrolled in course, if yes -> dropcourse. if no ->
						// return message
						if (courseList.contains(courseobj)) { // use contains() to see if the courseobj exists in list

							studentobj.dropCourse(courseobj);

						} else
							// output message to JOptionpane dialogue
							JOptionPane.showMessageDialog(null, "You are not enrolled in this course");

					}
				} else {
					//output error if name, email, dob are not provided
					JOptionPane.showMessageDialog(null, "Required information is missing");

				}
			}
		});

		// create "View Courses" button and add ActionListener
		JButton viewButton = new JButton("View Courses");
		viewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ensures all required fields have text
				if (!fNametxt.getText().trim().isEmpty() && !lNametxt.getText().trim().isEmpty()
						&& !stuEmailtxt.getText().trim().isEmpty() && !dobtxt.getText().trim().isEmpty()) {

					// very rudimentary check for a real email address
					String email = stuEmailtxt.getText();
					if (!email.contains("@")) {
						JOptionPane.showMessageDialog(null, "Please enter a valid email");
					} else {

						Student studentobj = new Student(fNametxt.getText(), lNametxt.getText(), stuEmailtxt.getText(),
								dobtxt.getText(), stuList);

						// output current courses to joptionpane dialogue
						JOptionPane.showMessageDialog(null, studentobj.toString());

					}
				} else
					//output error if name, email, dob are not provided
					JOptionPane.showMessageDialog(null, "Required information is missing");

			}
		});

		// add elements of Jframe for display
		jframe.add(fName);
		jframe.add(fNametxt);
		jframe.add(lName);
		jframe.add(lNametxt);
		jframe.add(stuEmail);
		jframe.add(stuEmailtxt);
		jframe.add(dob);
		jframe.add(dobtxt);
		jframe.add(course);
		jframe.add(courseTypeBox);
		jframe.add(courseNum);
		jframe.add(courseNumTypeBox);
		jframe.add(addButton);
		jframe.add(dropButton);
		jframe.add(viewButton);
		jframe.setSize(1000, 800);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SIS_GUI();
	}

}
