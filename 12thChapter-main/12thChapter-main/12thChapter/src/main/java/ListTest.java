// Fig. 12.24: ListTest.java
// Selecting colors from a JList.

import javax.swing.JFrame;

public class ListTest {

    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame(); // create ListFrame
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
        listFrame.setSize(350, 150); // Set the size of the frame
        listFrame.setVisible(true); // Make the frame visible
    }
}
