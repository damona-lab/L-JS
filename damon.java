import java.awt.*;
import java.awt.event.*;

public class ButtonClickDemo extends Frame implements ActionListener {

    Button btn;
    TextField txt;

    public ButtonClickDemo() {
        // Create components
        btn = new Button("Click Me");
        txt = new TextField(30);

        // Set layout
        setLayout(new FlowLayout());

        // Add components to frame
        add(btn);
        add(txt);

        // Add ActionListener to button
        btn.addActionListener(this);

        // Frame settings
        setTitle("Button Click Example");
        setSize(300, 150);
        setVisible(true);

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        txt.setText("You Clicked me Hard");
    }

    public static void main(String[] args) {
        new ButtonClickDemo();
    }
}