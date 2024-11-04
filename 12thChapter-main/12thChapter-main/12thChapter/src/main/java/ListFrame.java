// Fig. 12.23: ListFrame.java
// JList that displays a list of colors.

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {

    private final JList<String> colorList; // list to display colors
    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", 
        "Green", "Light Gray", "Magenta", "Orange", 
        "Pink", "Red", "White", "Yellow"
    };

    private static final Color[] colors = {
        Color.BLACK, Color.BLUE, Color.CYAN, 
        Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, 
        Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };

    // ListFrame constructor adds JScrollPane containing JList to JFrame
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorList = new JList<>(colorNames); // list of colorNames
        colorList.setVisibleRowCount(5); // display five rows at once
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // do not allow multiple selections

        // add a JScrollPane containing JList to frame
        add(new JScrollPane(colorList));

        // handle list selection events
        colorList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                // change the background color of the frame based on selected color
                getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
            }
        });
    }
}
