/**
 * Created by Allyssa Albores & Chezkah Tahadlangit on 14/05/2017.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    JFrame dialogFrame = new JFrame();
    JLabel dialogLabel1 = new JLabel("MINI - STATISTICAL PACKAGE");
    JLabel dialogLabel2 = new JLabel("CMSC 105 LABORATORY ACTIVITY 4 (MINI-PROJECT)");
    JLabel dialogLabel3 = new JLabel("            Allyssa Albores & Chezkah Tahadlangit            ");
    JLabel dialogLabel4 = new JLabel("                                                                                                 ");
    JButton cont;

    JFrame mainMenu = new JFrame();
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    JLabel label1 = new JLabel("Choose one:");
    ButtonGroup group;
    JRadioButton samplingTechniques;
    JRadioButton presentingData;
    JRadioButton centralTendency;
    JRadioButton quit;
    JButton next;
    String activityNumber;


    public MainMenu() {
        try {
            // Set nimbus look and feel. nimbusBase works only for it.
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            UIManager.put("nimbusBase",Color.blue);

        } catch(Exception e){}

        // Set frame 1 properties
        cont = new JButton("CONTINUE");
        dialogFrame.setTitle("Mini-SP");
        dialogFrame.setSize(400,200);
        dialogFrame.setLayout(new FlowLayout());
        dialogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        dialogFrame.setVisible(true);
        dialogFrame.getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        dialogFrame.setLocationRelativeTo(null);

        // dialog labels
        dialogLabel1.setFont(new Font("Raleway", Font.CENTER_BASELINE, 25));
        dialogLabel1.setForeground(Color.DARK_GRAY);
        dialogFrame.add(dialogLabel1);
        dialogLabel2.setFont(new Font("Open Sans", Font.CENTER_BASELINE, 12));
        dialogLabel2.setForeground(Color.DARK_GRAY);
        dialogFrame.add(dialogLabel2);
        dialogLabel3.setFont(new Font("Open Sans", Font.CENTER_BASELINE, 12));
        dialogLabel3.setForeground(Color.DARK_GRAY);
        dialogFrame.add(dialogLabel3);
        dialogFrame.add(dialogLabel4);

        // continue button
        cont.setPreferredSize(new Dimension(200,40));
        cont.setFont(new Font("Open Sans", Font.PLAIN, 15));
        dialogFrame.add(cont);
        cont.addActionListener(new contButton());

        // frame 2
        next = new JButton("NEXT");
        next.setFont(new Font("Open Sans", Font.PLAIN, 15));
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        group = new ButtonGroup();
        samplingTechniques = new JRadioButton("SIMULATING DIFFERENT TYPES OF SAMPLING TECHNIQUES");
        presentingData = new JRadioButton("ORGANIZING, SUMMARIZING, AND PRESENTING DATA");
        centralTendency = new JRadioButton("MEASURES OF CENTRAL TENDENCY AND DISPERSION");
        quit = new JRadioButton("QUIT");
        label1.setFont(new Font("Mark My Words", Font.PLAIN, 18));
        label1.setForeground(Color.DARK_GRAY);
        samplingTechniques.setFont(new Font("CODE PRO", Font.PLAIN, 15));
        samplingTechniques.setForeground(Color.DARK_GRAY);
        presentingData.setFont(new Font("CODE PRO", Font.PLAIN, 15));
        presentingData.setForeground(Color.DARK_GRAY);
        centralTendency.setFont(new Font("CODE PRO", Font.PLAIN, 15));
        centralTendency.setForeground(Color.DARK_GRAY);
        quit.setFont(new Font("CODE PRO", Font.PLAIN, 15));
        quit.setForeground(Color.DARK_GRAY);
        samplingTechniques.setActionCommand("1");
        presentingData.setActionCommand("2");
        centralTendency.setActionCommand("3");
        quit.setActionCommand("4");
        group.add(samplingTechniques);
        group.add(presentingData);
        group.add(centralTendency);
        group.add(quit);

        // start -- to place and arrange the components in frame
        GroupLayout.SequentialGroup left = layout.createSequentialGroup();
        left.addComponent(label1);
        GroupLayout.ParallelGroup radioButtons = layout.createParallelGroup();
        radioButtons.addComponent(samplingTechniques);
        radioButtons.addComponent(presentingData);
        radioButtons.addComponent(centralTendency);
        radioButtons.addComponent(quit);
        radioButtons.addComponent(next);
        next.addActionListener(new nextButton());
        left.addGroup(radioButtons);

        GroupLayout.SequentialGroup topToBottom = layout.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop = layout.createParallelGroup();
        rowTop.addComponent(label1);
        rowTop.addComponent(samplingTechniques);
        topToBottom.addGroup(rowTop);
        topToBottom.addComponent(presentingData);
        topToBottom.addComponent(centralTendency);
        topToBottom.addComponent(quit);
        topToBottom.addComponent(next);

        layout.setHorizontalGroup(left);
        layout.setVerticalGroup(topToBottom);
        // end

        mainMenu.setTitle("Mini-SP");
        mainMenu.add(panel);
        mainMenu.setSize(580,200);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainMenu.setLocationRelativeTo(null);
    }

    private class contButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dialogFrame.dispose();
            mainMenu.setVisible(true);
        }
    }

    private class nextButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                activityNumber = group.getSelection().getActionCommand();
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(mainMenu, "Choose one!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                mainMenu.setVisible(true);
                throw new NullPointerException();
            }

            mainMenu.dispose();

            if(activityNumber.equals("1")) {
                new Activity1();
            } else if(activityNumber.equals("2")) {
                new Activity2();
            } else if(activityNumber.equals("3")) {
                new Activity3();
            } else if(activityNumber.equals("4")) {
                System.exit(0);
            }
        }
    }

    public static void main(String args[]) {
        new MainMenu();
    }
}
