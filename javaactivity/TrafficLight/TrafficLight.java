import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    JRadioButton red, yellow, green;
    JLabel message;

    TrafficLight() {

        setTitle("Traffic Light Simulation");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        message = new JLabel("");
        message.setFont(new Font("Arial", Font.BOLD, 25));
        add(message);

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        add(red);
        add(yellow);
        add(green);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (red.isSelected()) {
            message.setText("STOP");
            message.setForeground(Color.RED);
        }

        else if (yellow.isSelected()) {
            message.setText("READY");
            message.setForeground(Color.ORANGE);
        }

        else if (green.isSelected()) {
            message.setText("GO");
            message.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}