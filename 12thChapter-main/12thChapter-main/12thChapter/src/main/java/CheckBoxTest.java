// Fig. 12.18: CheckBoxTest.java
// Testing CheckBoxFrame.

import javax.swing.JFrame;

public class CheckBoxTest {

    public static void main(String[] args) {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); // Create instance of CheckBoxFrame
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(275, 100);
        checkBoxFrame.setVisible(true);
    }
}
