import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> imagesComboBox; // Holds icon names
    private final JLabel label; // Displays selected icon

    // Array of image filenames
    private static final String[] names = {
        "bug1.gif", 
        "bug2.gif", 
        "travelbug.gif", 
        "buganim.gif"
    };

    private final Icon[] icons;

    // ComboBoxFrame constructor adds JComboBox to JFrame 
    public ComboBoxFrame() {
        super("Testing ComboBox");
        setLayout(new FlowLayout()); // Set frame layout

        icons = new Icon[names.length];
        for (int i = 0; i < names.length; i++) {
            // Load icons from resources
            icons[i] = new ImageIcon(getClass().getResource("/" + names[i])); // Ensure leading slash
        }

        imagesComboBox = new JComboBox<>(names); // Set up ComboBox 
        imagesComboBox.setMaximumRowCount(3); // Display three rows

        imagesComboBox.addItemListener(new ItemListener() { // Anonymous inner class
            // Handle JComboBox event
            @Override
            public void itemStateChanged(ItemEvent event) {
                // Determine whether item selected
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[imagesComboBox.getSelectedIndex()]);
                }
            }
        });

        add(imagesComboBox); // Add combo box to JFrame
        label = new JLabel(icons[0]); // Display first icon
        add(label); // Add label to JFrame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setSize(300, 200); // Set size of the window
        setVisible(true); // Make the frame visible
    }
}
