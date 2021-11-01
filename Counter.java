import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {

  JLabel leftLabel = new JLabel("Left");
  JLabel rightLabel = new JLabel("Right");
  int leftCount = 0;
  int rightCount = 0;

  Counter() {
    JFrame frame = new JFrame("Lab7 - Colin McQuinn");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel.setText("Count " + leftCount);
    rightLabel.setText("Count " + rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);

    frame.add(reset);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Left")) {
      leftCount = leftCount + 1;
      leftLabel.setText("Count " + leftCount);
    } else if (ae.getActionCommand().equals("Right")) {
      rightCount = rightCount + 1;
      rightLabel.setText("Count " + rightCount);
    } else if (ae.getActionCommand().equals("Reset")) {
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Count " + leftCount);
      rightLabel.setText("Count " + rightCount);
    } else {
      System.out.println("Error");
    }
  }
}
