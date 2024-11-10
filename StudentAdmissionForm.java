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
        frame.setLayout(new GridLayout(18, 2)); 
        frame.setSize(400, 800);
        
        
        frame.add(new JLabel("Name:"));
        nameField = new JTextField();
        frame.add(nameField);
        
        
        frame.add(new JLabel("Father's Name:"));
        fatherNameField = new JTextField();
        frame.add(fatherNameField);
        
        
        frame.add(new JLabel("Mother's Name:"));
        motherNameField = new JTextField();
        frame.add(motherNameField);
        
        // Date of Birth (Day, Month, Year)
        frame.add(new JLabel("Date of Birth:"));
        JPanel datePanel = new JPanel();
        dayCombo = new JComboBox<>();
        for (int i = 1; i <= 31; i++) dayCombo.addItem(String.format("%02d", i));
        monthCombo = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        yearCombo = new JComboBox<>();
        for (int i = 2005; i >= 1990; i--) yearCombo.addItem(String.valueOf(i));
        datePanel.add(dayCombo);
        datePanel.add(monthCombo);
        datePanel.add(yearCombo);
        frame.add(datePanel);
        
        // Blood Group (Radio Buttons)
        frame.add(new JLabel("Blood Group:"));
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
        frame.add(bloodGroupPanel);
        
        // Gender (Radio Buttons)
        frame.add(new JLabel("Gender:"));
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
        frame.add(genderPanel);
        
        // Phone Number
        frame.add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        frame.add(phoneNumberField);
        
        // Email Address
        frame.add(new JLabel("Email Address:"));
        emailField = new JTextField();
        frame.add(emailField);
        
        // Present Address
        frame.add(new JLabel("Present Address:"));
        presentAddressField = new JTextField();
        frame.add(presentAddressField);
        
        // Permanent Address
        frame.add(new JLabel("Permanent Address:"));
        permanentAddressField = new JTextField();
        frame.add(permanentAddressField);
        
        // Copy Present Address to Permanent Address Button
        frame.add(new JLabel("Copy Present Address to Permanent Address:"));
        copyAddressButton = new JButton("Copy Address");
        frame.add(copyAddressButton);
        
        copyAddressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                permanentAddressField.setText(presentAddressField.getText());
            }
        });
        
        // HSC and SSC GPA fields
        frame.add(new JLabel("SSC GPA:"));
        sscGpaField = new JTextField();
        frame.add(sscGpaField);
        
        frame.add(new JLabel("HSC GPA:"));
        hscGpaField = new JTextField();
        frame.add(hscGpaField);
        
        // Department choice (Radio Buttons)
        frame.add(new JLabel("Department:"));
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
        frame.add(departmentPanel);
        
        // Admission Batch number and Session
        frame.add(new JLabel("Admission Batch Number:"));
        admissionBatchField = new JTextField();
        frame.add(admissionBatchField);
        
        frame.add(new JLabel("Session:"));
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
        frame.add(sessionPanel);
        
        // Submit Button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateForm();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void validateForm() {
        // Validate if the birth year is between 1990 and 2005
        int birthYear = Integer.parseInt(yearCombo.getSelectedItem().toString());
        if (birthYear < 1990 || birthYear > 2005) {
            JOptionPane.showMessageDialog(frame, "Birth year must be between 1990 and 2005.");
            return;
        }

        // Validate Phone Number (should be exactly 11 digits)
        String phoneNumber = phoneNumberField.getText();
        if (phoneNumber.length() != 11 || !phoneNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(frame, "Phone number must be exactly 11 digits.");
            return;
        }

        // Validate GPA for SWE, CSE, and EEE
        String sscGpa = sscGpaField.getText();
        String hscGpa = hscGpaField.getText();
        if ((SWEButton.isSelected() || CSEButton.isSelected() || EEEButton.isSelected()) &&
            (Double.parseDouble(sscGpa) < 2.5 || Double.parseDouble(hscGpa) < 2.5)) {
            JOptionPane.showMessageDialog(frame, "You cannot apply to SWE, CSE or EEE if your GPA is below 2.5");
            return;
        }

        JOptionPane.showMessageDialog(frame, "Form submitted successfully!");
    }

    public static void main(String[] args) {
        new StudentAdmissionForm();
    }
}
