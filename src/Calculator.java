import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Calculator extends JFrame {

    List<JButton> btnDigits = new ArrayList<JButton>();
    public int tempI=0;

    public Calculator(){

        JPanel panelCenter = new JPanel();
        JPanel panelNorth = new JPanel();

        FlowLayout flowLayout = new FlowLayout();
        //GridLayout gridLayout = new GridLayout();
        GridLayout gridLayoutButton = new GridLayout(4,3);
       // gridLayoutButton.
        BorderLayout borderLayout = new BorderLayout();

        for (int i = 1; i <=9 ; i++) {
            btnDigits.add(new JButton(String.valueOf(i)));
        }

        btnDigits.add(new JButton("0"));
        btnDigits.add(new JButton("<<"));
        btnDigits.add(new JButton("="));

        for (int i = 0; i < btnDigits.size(); i++) {
            panelCenter.add(btnDigits.get(i));
        }

        JTextField inputText = new JTextField(20);
        inputText.setBounds(0,0,200,30);

        panelNorth.add(inputText);

        panelCenter.setLayout(gridLayoutButton);

        for (int i = 0; i <btnDigits.size() ; i++) {
            tempI=i;
            btnDigits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    inputText.setText(inputText.getText()+ String.valueOf(tempI));
                }
            });
        }


        add(panelCenter, BorderLayout.CENTER);
        add(panelNorth, BorderLayout.NORTH);

        setResizable(false);
        setBounds(200,200,300,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
