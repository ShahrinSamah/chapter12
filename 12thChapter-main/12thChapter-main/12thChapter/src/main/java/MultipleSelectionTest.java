// Fig. 12.26: MultipleSelectionTest.java
// Testing MultipleSelectionFrame.

import javax.swing.JFrame;

public class MultipleSelectionTest {

    public static void main(String[] args) {
        // Corrected instantiation of MultipleSelectionFrame
        MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
