// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

    private final JButton plainJButton;
    private final JButton fancyJButton;

    // Constructor for ButtonFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        // Create plain button
        plainJButton = new JButton("Plain Button");
        add(plainJButton); // Add plain button to JFrame

        // Load images for fancy button
        Icon bug1 = null;
        Icon bug2 = null;
        try {
            bug1 = new ImageIcon(getClass().getClassLoader().getResource("bug1.gif"));
            bug2 = new ImageIcon(getClass().getClassLoader().getResource("bug2.gif"));
        } catch (NullPointerException e) {
            System.out.println("Image files bug1.gif or bug2.gif not found in resources.");
        }

        // Create fancy button with images if found
        fancyJButton = new JButton("Fancy Button", bug1); // Set initial icon
        if (bug2 != null) {
            fancyJButton.setRolloverIcon(bug2); // Set rollover icon if available
        }
        add(fancyJButton); // Add fancy button to JFrame

        // Register event handlers for buttons
        ButtonHandler handler = new ButtonHandler();
        plainJButton.addActionListener(handler);
        fancyJButton.addActionListener(handler);
    }

    // Private inner class for handling button events
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                "You pressed: %s", event.getActionCommand()));
        }
    }
}
