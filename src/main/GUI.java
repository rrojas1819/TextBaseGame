package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame
{
    private JFrame mainWindow;
    private String Title ="Adventure Game";

    public GUI(){
        mainWindow = new JFrame();
        JLabel titleGame = new JLabel(Title);
        titleGame.setFont(new Font("Serif", Font.PLAIN, 50));
        JPanel titlePanel = new JPanel(new FlowLayout());
        JButton start = getStartButton();
        titlePanel.setSize(200,200);
        titleGame.setForeground(Color.WHITE);
        titlePanel.setBackground(Color.BLACK);
        mainWindow.setLayout(new GridBagLayout());
        titlePanel.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        con.anchor=GridBagConstraints.PAGE_START;
        con.weightx=1;
        con.weighty=1;
        con.gridx = 1;
        con.gridy = 1;
        con.insets = new Insets(100, 0, 0, 0);
        GridBagConstraints con2 = new GridBagConstraints();
        con2.anchor=GridBagConstraints.CENTER;
        con2.weightx=1;
        con2.weighty=1;
        con2.gridx = 1;
        con2.gridy = 1;
        con2.insets = new Insets(50, 0, 0, 0);
        titlePanel.add(titleGame);
        mainWindow.setSize(1400, 1024);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setTitle("Adventure Game");
        mainWindow.getContentPane().setBackground(Color.BLACK);
        mainWindow.add(titlePanel,con);
        mainWindow.add(start,con2);
        //mainWindow.pack();
        mainWindow.setVisible(true);
    }


    private void fightScreen(){


    }


    private JButton getStartButton() {
        JButton start = new JButton("Start");
        start.setBackground(Color.BLACK);
        start.setForeground(Color.WHITE);
        start.setFocusable(false);
        start.setBorderPainted(false);
        start.setFont(new Font("Serif", Font.PLAIN, 30));
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.getContentPane().removeAll(); // Remove all components
                mainWindow.revalidate(); // Re-layout the container
                mainWindow.repaint();
                }

        });
        return start;
    }


}
