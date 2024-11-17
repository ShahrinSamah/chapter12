/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo S540
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentAdmissionForm {

    // Declare all the components as instance variables
    private JFrame frame;
    private JTextField nameField, fatherNameField, motherNameField, phoneNumberField, emailField, presentAddressField, permanentAddressField;
    private JComboBox<String> dayCombo, monthCombo, yearCombo;
    private JRadioButton bloodGroupAPositive, bloodGroupANegative, bloodGroupBPositive, bloodGroupBNegative,
            bloodGroupABPositive, bloodGroupABNegative, bloodGroupOPositive, bloodGroupONegative;
    private JRadioButton maleButton, femaleButton, otherButton;
    private JTextField sscGpaField, hscGpaField, admissionBatchField;
    private JRadioButton SWEButton, CSEButton, EEEButton, BBAButton, LLBButton, EconomicsButton, EnglishButton;
    private JRadioButton fallButton, springButton, summerButton;
    private JButton copyAddressButton;

    public StudentAdmissionForm() {
        frame = new JFrame("Student Admission Form");
        frame.setLayout(new BorderLayout(20, 20));  // Added spacing between components
        frame.setSize(700, 900);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Header Panel with University Name
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.WHITE);
        JLabel universityLabel = new JLabel("<html><span style='color:blue;'>Metropolitan</span> <span style='color:red;'>U</span><span style='color:grey;'>niversity</span></html>", JLabel.CENTER);
        universityLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));  // Increased bold and italic effect
        headerPanel.add(universityLabel);
        frame.add(headerPanel, BorderLayout.NORTH);

        // Form Panel with padding around the edges
        JPanel formPanel = new JPanel(new GridLayout(18, 2, 10, 10));  // Added spacing between components in grid
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Padding around the form panel
        frame.add(formPanel, BorderLayout.CENTER);

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Father's Name:"));
        fatherNameField = new JTextField();
        formPanel.add(fatherNameField);

        formPanel.add(new JLabel("Mother's Name:"));
        motherNameField = new JTextField();
        formPanel.add(motherNameField);

        // Date of Birth (Day, Month, Year)
        formPanel.add(new JLabel("Date of Birth:"));
        JPanel datePanel = new JPanel();
        dayCombo = new JComboBox<>();
        for (int i = 1; i <= 31; i++) dayCombo.addItem(String.format("%02d", i));
        monthCombo = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        yearCombo = new JComboBox<>();
        for (int i = 2005; i >= 1990; i--) yearCombo.addItem(String.valueOf(i));
        datePanel.add(dayCombo);
        datePanel.add(monthCombo);
        datePanel.add(yearCombo);
        formPanel.add(datePanel);

        // Blood Group (Radio Buttons)
        formPanel.add(new JLabel("Blood Group:"));
        JPanel bloodGroupPanel = new JPanel();
        bloodGroupAPositive = new JRadioButton("A+");
        bloodGroupANegative = new JRadioButton("A-");
        bloodGroupBPositive = new JRadioButton("B+");
        bloodGroupBNegative = new JRadioButton("B-");
        bloodGroupABPositive = new JRadioButton("AB+");
        bloodGroupABNegative = new JRadioButton("AB-");
        bloodGroupOPositive = new JRadioButton("O+");
        bloodGroupONegative = new JRadioButton("O-");
        ButtonGroup bloodGroupGroup = new ButtonGroup();
        bloodGroupGroup.add(bloodGroupAPositive);
        bloodGroupGroup.add(bloodGroupANegative);
        bloodGroupGroup.add(bloodGroupBPositive);
        bloodGroupGroup.add(bloodGroupBNegative);
        bloodGroupGroup.add(bloodGroupABPositive);
        bloodGroupGroup.add(bloodGroupABNegative);
        bloodGroupGroup.add(bloodGroupOPositive);
        bloodGroupGroup.add(bloodGroupONegative);
        bloodGroupPanel.add(bloodGroupAPositive);
        bloodGroupPanel.add(bloodGroupANegative);
        bloodGroupPanel.add(bloodGroupBPositive);
        bloodGroupPanel.add(bloodGroupBNegative);
        bloodGroupPanel.add(bloodGroupABPositive);
        bloodGroupPanel.add(bloodGroupABNegative);
        bloodGroupPanel.add(bloodGroupOPositive);
        bloodGroupPanel.add(bloodGroupONegative);
        formPanel.add(bloodGroupPanel);

        // Gender (Radio Buttons)
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        formPanel.add(genderPanel);

        // Phone Number
        formPanel.add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        formPanel.add(phoneNumberField);

        // Email Address
        formPanel.add(new JLabel("Email Address:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        // Present Address
        formPanel.add(new JLabel("Present Address:"));
        presentAddressField = new JTextField();
        formPanel.add(presentAddressField);

        // Permanent Address
        formPanel.add(new JLabel("Permanent Address:"));
        permanentAddressField = new JTextField();
        formPanel.add(permanentAddressField);

        // Copy Present Address to Permanent Address Button
        formPanel.add(new JLabel("Copy Present Address to Permanent Address:"));
        copyAddressButton = new JButton("Copy Address");
        formPanel.add(copyAddressButton);

        copyAddressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                permanentAddressField.setText(presentAddressField.getText());
            }
        });

        // HSC and SSC GPA fields
        formPanel.add(new JLabel("SSC GPA:"));
        sscGpaField = new JTextField();
        formPanel.add(sscGpaField);

        formPanel.add(new JLabel("HSC GPA:"));
        hscGpaField = new JTextField();
        formPanel.add(hscGpaField);

        // Department choice (Radio Buttons)
        formPanel.add(new JLabel("Department:"));
        JPanel departmentPanel = new JPanel();
        SWEButton = new JRadioButton("SWE");
        CSEButton = new JRadioButton("CSE");
        EEEButton = new JRadioButton("EEE");
        BBAButton = new JRadioButton("BBA");
        LLBButton = new JRadioButton("LLB");
        EconomicsButton = new JRadioButton("Economics");
        EnglishButton = new JRadioButton("English");
        ButtonGroup departmentGroup = new ButtonGroup();
        departmentGroup.add(SWEButton);
        departmentGroup.add(CSEButton);
        departmentGroup.add(EEEButton);
        departmentGroup.add(BBAButton);
        departmentGroup.add(LLBButton);
        departmentGroup.add(EconomicsButton);
        departmentGroup.add(EnglishButton);
        departmentPanel.add(SWEButton);
        departmentPanel.add(CSEButton);
        departmentPanel.add(EEEButton);
        departmentPanel.add(BBAButton);
        departmentPanel.add(LLBButton);
        departmentPanel.add(EconomicsButton);
        departmentPanel.add(EnglishButton);
        formPanel.add(departmentPanel);

        // Admission Batch number and Session
        formPanel.add(new JLabel("Admission Batch Number:"));
        admissionBatchField = new JTextField();
        formPanel.add(admissionBatchField);

        formPanel.add(new JLabel("Session:"));
        JPanel sessionPanel = new JPanel();
        fallButton = new JRadioButton("Fall");
        springButton = new JRadioButton("Spring");
        summerButton = new JRadioButton("Summer");
        ButtonGroup sessionGroup = new ButtonGroup();
        sessionGroup.add(fallButton);
        sessionGroup.add(springButton);
        sessionGroup.add(summerButton);
        sessionPanel.add(fallButton);
        sessionPanel.add(springButton);
        sessionPanel.add(summerButton);
        formPanel.add(sessionPanel);

        // Submit and Cancel Buttons at the bottom center
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateForm();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the form when cancel is clicked
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void validateForm() {
        // Get the student details
        String studentName = nameField.getText().trim();
        String department = getSelectedDepartment();
        String batch = admissionBatchField.getText().trim();

        // Validate if the birth year is between 1990 and 2005
        int birthYear = Integer.parseInt(yearCombo.getSelectedItem().toString());
        if (birthYear < 1990 || birthYear > 2005) {
            JOptionPane.showMessageDialog(frame, "Birth year must be between 1990 and 2005.");
            return;
        }

        // Validate Phone Number (should be exactly 11 digits)
        String phoneNumber = phoneNumberField.getText();
        if (phoneNumber.length() != 11) {
            JOptionPane.showMessageDialog(frame, "Phone number must be exactly 11 digits.");
            return;
        }

        // Validate SSC and HSC GPA
        try {
            double sscGpa = Double.parseDouble(sscGpaField.getText());
            double hscGpa = Double.parseDouble(hscGpaField.getText());
            if (sscGpa < 2.0 || sscGpa > 5.0 || hscGpa < 2.0 || hscGpa > 5.0) {
                JOptionPane.showMessageDialog(frame, "SSC and HSC GPA must be between 2.0 and 5.0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "SSC and HSC GPA must be valid numbers.");
            return;
        }

        // Save form data to file
        saveToFile(studentName, department, batch);
        JOptionPane.showMessageDialog(frame, "Form Submitted Successfully!");
    }

    private String getSelectedDepartment() {
        if (SWEButton.isSelected()) return "SWE";
        if (CSEButton.isSelected()) return "CSE";
        if (EEEButton.isSelected()) return "EEE";
        if (BBAButton.isSelected()) return "BBA";
        if (LLBButton.isSelected()) return "LLB";
        if (EconomicsButton.isSelected()) return "Economics";
        if (EnglishButton.isSelected()) return "English";
        return "Unknown";
    }

    private void saveToFile(String studentName, String department, String batch) {
        // Create a file with the name format: studentName-department-batch.txt
        String filename = studentName + "-" + department + "-" + batch + ".txt";
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file)) {
            // Write form data to the file
            writer.write("Name: " + nameField.getText() + "\n");
            writer.write("Father's Name: " + fatherNameField.getText() + "\n");
            writer.write("Mother's Name: " + motherNameField.getText() + "\n");
            writer.write("Phone Number: " + phoneNumberField.getText() + "\n");
            writer.write("Email: " + emailField.getText() + "\n");
            writer.write("Present Address: " + presentAddressField.getText() + "\n");
            writer.write("Permanent Address: " + permanentAddressField.getText() + "\n");
            writer.write("SSC GPA: " + sscGpaField.getText() + "\n");
            writer.write("HSC GPA: " + hscGpaField.getText() + "\n");
            writer.write("Department: " + department + "\n");
            writer.write("Admission Batch: " + batch + "\n");
            writer.write("Session: " + getSelectedSession() + "\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error saving form data: " + e.getMessage());
        }
    }

    private String getSelectedSession() {
        if (fallButton.isSelected()) return "Fall";
        if (springButton.isSelected()) return "Spring";
        if (summerButton.isSelected()) return "Summer";
        return "Unknown";
    }

    public static void main(String[] args) {
        new StudentAdmissionForm();
    }
}
