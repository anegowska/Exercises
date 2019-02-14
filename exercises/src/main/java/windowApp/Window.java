package windowApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Window extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel text;
    private JTextField field;
    private JButton button;

    public Window(){
        super("Hello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 270);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        text = new JLabel("Give me an integer");
        text.setBounds(10, 10, 200, 25);
        panel.add(text);

        field = new JTextField();
        field.setBounds(10, 45,150, 20);
        panel.add(field);

        button = new JButton("Calculate");
        button.setBounds(10, 75, 100, 25);
        button.addActionListener(this);
        panel.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {

        int number = Integer.parseInt(field.getText());

        if (number < 0) {
            System.out.println("Give a positive number!");
            System.out.println();

        }else if (evt.getSource() == button) {

            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    sum+=i;
                    list.add(i);
                }
            }
            List<Integer> resultList = list.stream()
                    .filter(n -> (n % 3 == 0))
                    .collect(Collectors.toList());

            System.out.println();
            System.out.println("Sum = " + sum);
            System.out.println("Elements divisible by 3 = " + resultList.toString());
            System.out.println();
        }
    }
}
