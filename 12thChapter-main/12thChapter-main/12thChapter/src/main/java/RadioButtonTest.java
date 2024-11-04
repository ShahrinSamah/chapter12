// Fig. 12.20: RadioButtonTest.java
// Testing RadioButton Frame.

import javax.swing.JFrame;

public class RadioButtonTest {

    public static void main(String[] args) {
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); // Fixed the instantiation
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(300, 100);
        radioButtonFrame.setVisible(true);
    }
}
