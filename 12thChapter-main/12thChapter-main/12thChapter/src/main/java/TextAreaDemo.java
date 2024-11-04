// Fig. 12.48: TextAreaDemo.java
// Testing TextAreaFrame.

import javax.swing.JFrame;

public class TextAreaDemo {

    public static void main(String[] args) {
        TextAreaFrame textAreaFrame = new TextAreaFrame(); // Create TextAreaFrame instance
        textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        textAreaFrame.setSize(425, 200); // Set frame size
        textAreaFrame.setVisible(true); // Make frame visible
    }
}
