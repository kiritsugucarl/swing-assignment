import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame
{
    MyApp()
    {
        //boilerplate
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(new BorderLayout(0, 5));
        this.setVisible(true);

        //creates the three panels
        JPanel titlePanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel footerPanel = new JPanel();

        //body panel setting layout
        bodyPanel.setLayout(new GridLayout(3,2, 3, 3));

        //separation of the three panels
        titlePanel.setBackground(Color.BLACK);
        footerPanel.setBackground(Color.GREEN);

        //size of the three panels
        titlePanel.setPreferredSize(new Dimension(100,100));
        bodyPanel.setPreferredSize(new Dimension(1000, 1000));
        footerPanel.setPreferredSize(new Dimension(100, 50));

        //title content
        JLabel title = new JLabel();


        //body contents
        JPanel member_1 = new JPanel();
        JPanel member_2 = new JPanel();
        JPanel member_3 = new JPanel();
        JPanel member_4 = new JPanel();
        JPanel member_5 = new JPanel();

        JLabel member_1_name = new JLabel();
        //Debug
        member_1.setBackground(Color.PINK);
        member_1_name.setText("Carl Dennis Pineda");

        JLabel member_2_name = new JLabel();
        //Debug
        member_2.setBackground(Color.RED);
        member_2_name.setText("Shalom Jamaica Ave");

        JLabel member_3_name = new JLabel();
        //Debug
        member_3.setBackground(Color.ORANGE);
        member_3_name.setText("Jennielyn Heray");

        JLabel member_4_name = new JLabel();
        //Debug
        member_4.setBackground(Color.CYAN);
        member_4_name.setText("Carl Hari Alisangco");

        JLabel member_5_name = new JLabel();
        //Debug
        member_5.setBackground(Color.MAGENTA);
        member_5_name.setText("Alvin Escabarte");



        //adding contents
        this.add(titlePanel, BorderLayout.NORTH);
        this.add(bodyPanel, BorderLayout.CENTER);
            bodyPanel.add(member_1);
                member_1.add(member_1_name);
            bodyPanel.add(member_2);
                member_2.add(member_2_name);
            bodyPanel.add(member_3);
                member_3.add(member_3_name);
            bodyPanel.add(member_4);
                member_4.add(member_4_name);
            bodyPanel.add(member_5);
                member_5.add(member_5_name);
        this.add(footerPanel, BorderLayout.SOUTH);
    }
}
