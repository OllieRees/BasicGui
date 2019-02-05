import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorldGuiView extends JFrame {

    private static final long serialVersionUID = 1L;

    public HelloWorldGuiView(String title) {
        super(title);
    }

    public void init() {

        Container panel = this.getContentPane();
        panel.setLayout(new BorderLayout());

        JLabel hwWindow = new JLabel();
        panel.add(hwWindow);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton hwButton = new JButton("Press me!");
        JButton reset = new JButton("Reset");
        buttonPanel.add(hwButton);
        buttonPanel.add(reset);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        

        class HelloWorldGuiListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                hwWindow.setText("Hello World!");    
            }
        }
        
        class HelloWorldGuiResetter implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                hwWindow.setText("");
            }
        }

        hwButton.addActionListener(new HelloWorldGuiListener());
        reset.addActionListener(new HelloWorldGuiResetter());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}