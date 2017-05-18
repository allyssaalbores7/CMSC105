import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Allyssa Albores, Chezkah Tahadlangit on 14/05/2017.
 */

public class Activity1 {
    // frame 1 variables
    JFrame frame1 = new JFrame("Basic Sampling Methods");
    JPanel panel1 = new JPanel();
    GroupLayout groupLayout1 = new GroupLayout(panel1);
    JLabel label1 = new JLabel("Choose one: ");
    ButtonGroup group1 = new ButtonGroup();
    JRadioButton simple = new JRadioButton("Simple Random Sampling");
    JRadioButton systematic = new JRadioButton("Systematic Sampling");
    JRadioButton stratified = new JRadioButton("Stratified Sampling");
    JRadioButton goBack = new JRadioButton("Main Menu");
    JButton enter1 = new JButton("Enter");
    String samplingChoice;

    // frame 2 varaibles
    JFrame frame2 = new JFrame("Basic Sampling Methods");
    JLabel label2_1 = new JLabel("Input the size of the target population: ");
    JTextField size = new JTextField("", 10);
    JLabel label2_2 = new JLabel("Choose one: ");
    ButtonGroup group2 = new ButtonGroup();
    JRadioButton numerical = new JRadioButton("Numerical");
    JRadioButton character = new JRadioButton("Character");
    JButton enter2 = new JButton("Enter");
    String sizeText;
    int population;
    String typeChoice;

    // frame 3 variables
    String[] columns3 = new String[] {"⊶", "⊶", "⊶",
            "⊶", "⊶", "⊶", "⊶", "⊶", "⊶", "⊶"};
    Object[][] data3 = new Object[][] {};
    JFrame frame3 = new JFrame("Basic Sampling Methods");
    JPanel panel3 = new JPanel();
    DefaultTableModel model3 = new DefaultTableModel(data3, columns3);
    JTable table3 = new JTable(model3);
    JScrollPane pane3 = new JScrollPane(table3);
    JButton enter3_1 = new JButton("Continue");
    JButton enter3_2 = new JButton("Edit");
    ArrayList<Integer> numericalList = new ArrayList<Integer>();
    ArrayList<Character> characterList = new ArrayList<Character>();
    String cell;

    // frame 4 variables
    String[] columns4 = new String[] {};
    Object[][] data4 = new Object[][] {};
    JFrame frame4 = new JFrame("THE SAMPLING FRAME");
    JPanel panel4 = new JPanel();
    DefaultTableModel model4 = new DefaultTableModel(data4, columns4);
    JTable table4 = new JTable(model4);
    JScrollPane pane4 = new JScrollPane(table4);
    JButton enter4 = new JButton("Continue");
    ArrayList<Object> even = new ArrayList<Object>();
    ArrayList<Object> odd = new ArrayList<Object>();

    // frame 5 variables
    JFrame frame5 = new JFrame("SIMPLE RANDOM SAMPLING");
    JLabel label5 = new JLabel("Input the size of the sample to be taken from the target population: ");
    JTextField size5 = new JTextField("", 15);
    JButton enter5 = new JButton("Enter");
    String sampleText;
    int sampleSize;
    ArrayList<Integer> randomIndex = new ArrayList<Integer>();
    ArrayList<Object> randomSample = new ArrayList<Object>();

    // simple random variables - frame 6
    String[] columns6 = new String[] {};
    Object[][] data6 = new Object[][] {};
    JFrame frame6 = new JFrame("RANDOM SAMPLE");
    JPanel panel6 = new JPanel();
    DefaultTableModel model6 = new DefaultTableModel(data6, columns6);
    JTable table6 = new JTable(model6);
    JScrollPane pane6 = new JScrollPane(table6);
    JButton enter6_1 = new JButton("Quit");
    JButton enter6_2 = new JButton("Go Back");

    // frame 7 variables
    JFrame frame7 = new JFrame("SYSTEMATIC SAMPLING");
    JLabel label7 = new JLabel("Input the size of the sample to be taken from the target population: ");
    JTextField size7 = new JTextField("", 7);
    JButton enter7 = new JButton("Enter");
    String systematicText;
    int systematicSize;
    int k;
    ArrayList<Object> strat = new ArrayList<Object>();

    // systematic variables - frame 8
    String[] columns8 = new String[] {};
    Object[][] data8 = new Object[][] {};
    JFrame frame8 = new JFrame("SYSTEMATIC SAMPLING");
    JPanel panel8 = new JPanel();
    DefaultTableModel model8 = new DefaultTableModel(data8, columns8);
    JTable table8 = new JTable(model8);
    JScrollPane pane8 = new JScrollPane(table8);
    JButton enter8_1 = new JButton("Quit");
    JButton enter8_2 = new JButton("Go Back");

    // frame 9 variables
    String[] columns9_1 = new String[] {};
    String[] columns9_2 = new String[] {};
    Object[][] data9_1 = new Object[][] {};
    Object[][] data9_2 = new Object[][] {};
    JFrame frame9 = new JFrame("STRATIFIED SAMPLING");
    JPanel panel9 = new JPanel();
    DefaultTableModel model9_1 = new DefaultTableModel(data9_1, columns9_1);
    DefaultTableModel model9_2 = new DefaultTableModel(data9_2, columns9_2);
    JTable table9_1 = new JTable(model9_1);
    JTable table9_2 = new JTable(model9_2);
    JScrollPane pane9_1 = new JScrollPane(table9_1);
    JScrollPane pane9_2 = new JScrollPane(table9_2);
    JLabel label9_1 = new JLabel("STRATA 1");
    JLabel label9_2 = new JLabel("STRATA 2");
    JButton enter9 = new JButton("Continue");

    // frame 10 variables
    JFrame frame10 = new JFrame("STRATIFIED SAMPLING");
    JLabel label10 = new JLabel("Input the percentage of the items for each strata to be sampled randomly: ");
    JTextField size10 = new JTextField("", 15);
    JButton enter10 = new JButton("Enter");
    String stratifiedText;
    int stratifiedSize;
    ArrayList<Integer> randomIndex1 = new ArrayList<Integer>();
    ArrayList<Integer> randomIndex2 = new ArrayList<Integer>();
    ArrayList<Object> randomStratified1 = new ArrayList<Object>();
    ArrayList<Object> randomStratified2 = new ArrayList<Object>();

    // frame 11 variables
    String[] columns11_1 = new String[] {};
    String[] columns11_2 = new String[] {};
    Object[][] data11_1 = new Object[][] {};
    Object[][] data11_2 = new Object[][] {};
    JFrame frame11 = new JFrame("STRATIFIED SAMPLING");
    JPanel panel11 = new JPanel();
    DefaultTableModel model11_1 = new DefaultTableModel(data11_1, columns11_1);
    DefaultTableModel model11_2 = new DefaultTableModel(data11_2, columns11_2);
    JTable table11_1 = new JTable(model11_1);
    JTable table11_2 = new JTable(model11_2);
    JScrollPane pane11_1 = new JScrollPane(table11_1);
    JScrollPane pane11_2 = new JScrollPane(table11_2);
    JLabel label11_1 = new JLabel("STRATA 1");
    JLabel label11_2 = new JLabel("STRATA 2");
    JButton enter11_1 = new JButton("Quit");
    JButton enter11_2 = new JButton("Go Back");

    public Activity1() {
        components();
    }

    private void components() {
        // ------------------------------------------------ frame 1 ------------------------------------------------- //
        panel1.setLayout(groupLayout1);
        groupLayout1.setAutoCreateGaps(true);
        groupLayout1.setAutoCreateContainerGaps(true);
        simple.setActionCommand("1");
        systematic.setActionCommand("2");
        stratified.setActionCommand("3");
        goBack.setActionCommand("4");
        enter1.setFont(new Font("Open Sans", Font.PLAIN, 15));
        label1.setFont(new Font("Open Sans", Font.PLAIN, 15));
        label1.setForeground(Color.DARK_GRAY);
        simple.setFont(new Font("Open Sans", Font.PLAIN, 15));
        simple.setForeground(Color.DARK_GRAY);
        stratified.setFont(new Font("Open Sans", Font.PLAIN, 15));
        stratified.setForeground(Color.DARK_GRAY);
        systematic.setFont(new Font("Open Sans", Font.PLAIN, 15));
        systematic.setForeground(Color.DARK_GRAY);
        goBack.setFont(new Font("Open Sans", Font.PLAIN, 15));
        goBack.setForeground(Color.DARK_GRAY);
        group1.add(simple);
        group1.add(systematic);
        group1.add(stratified);
        group1.add(goBack);

        // groupLayout start
        GroupLayout.SequentialGroup left1 = groupLayout1.createSequentialGroup();
        left1.addComponent(label1);
        GroupLayout.ParallelGroup radioButtons1 = groupLayout1.createParallelGroup();
        radioButtons1.addComponent(simple);
        radioButtons1.addComponent(systematic);
        radioButtons1.addComponent(stratified);
        radioButtons1.addComponent(goBack);
        radioButtons1.addComponent(enter1);
        enter1.addActionListener(new buttonForFrame1());
        left1.addGroup(radioButtons1);

        GroupLayout.SequentialGroup topToBottom1 = groupLayout1.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop1 = groupLayout1.createParallelGroup();
        rowTop1.addComponent(label1);
        rowTop1.addComponent(simple);
        topToBottom1.addGroup(rowTop1);
        topToBottom1.addComponent(systematic);
        topToBottom1.addComponent(stratified);
        topToBottom1.addComponent(goBack);
        topToBottom1.addComponent(enter1);

        groupLayout1.setHorizontalGroup(left1);
        groupLayout1.setVerticalGroup(topToBottom1);
        //end

        frame1.add(panel1);
        frame1.setSize(360,210);
        frame1.setVisible(true);
        frame1.getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

        // ------------------------------------------------ frame 2 ------------------------------------------------- //
        frame2.setSize(400, 110);
        frame2.add(label2_1);
        frame2.add(size);
        frame2.add(label2_2);
        numerical.setActionCommand("Numerical");
        character.setActionCommand("Character");
        group2.add(numerical);
        group2.add(character);
        frame2.add(numerical);
        frame2.add(character);
        frame2.add(enter2);
        frame2.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);
        enter2.addActionListener(new buttonForFrame2());

        // ------------------------------------------------ frame 3 ------------------------------------------------- //
        frame3.setSize(535, 500);
        panel3.add(pane3);
        frame3.getContentPane().add(pane3, BorderLayout.CENTER);
        table3.setPreferredScrollableViewportSize(new Dimension(500, 390));
        table3.setFont(new Font("Open Sans", Font.BOLD, 15));
        pane3.setBounds(5, 218, 884, 194);
        table3.putClientProperty("terminateEditOnFocusLost", true);
        frame3.add(pane3);
        frame3.add(enter3_1);
        frame3.add(enter3_2);
        frame3.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        enter3_1.addActionListener(new buttonForFrame3_1());
        enter3_2.addActionListener(new buttonForFrame3_2());

        // ------------------------------------------------ frame 4 ------------------------------------------------- //
        frame4.setSize(1000, 175);
        panel4.add(pane4);
        frame4.getContentPane().add(pane4, BorderLayout.CENTER);
        table4.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table4.setFont(new Font("Open Sans", Font.PLAIN, 15));
        pane4.setBounds(5, 218, 884, 194);
        table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pane4.createHorizontalScrollBar();
        table4.putClientProperty("terminateEditOnFocusLost", true);
        frame4.add(pane4);
        frame4.add(enter4);
        frame4.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setLocationRelativeTo(null);
        enter4.addActionListener(new buttonForFrame4());

        // ------------------------------------------------ frame 5 ------------------------------------------------- //
        frame5.setSize(400, 110);
        frame5.add(label5);
        frame5.add(size5);
        frame5.add(enter5);
        frame5.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setLocationRelativeTo(null);
        enter5.addActionListener(new buttonForFrame5());

        // ---------------------------------------------- simple random --------------------------------------------- //
        frame6.setSize(1000, 175);
        panel6.add(pane6);
        frame6.getContentPane().add(pane6, BorderLayout.CENTER);
        table6.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table6.setFont(new Font("Open Sans", Font.PLAIN, 15));
        pane6.setBounds(5, 218, 884, 194);
        table6.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pane6.createHorizontalScrollBar();
        table6.putClientProperty("terminateEditOnFocusLost", true);
        frame6.add(pane6);
        frame6.add(enter6_1);
        frame6.add(enter6_2);
        frame6.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setLocationRelativeTo(null);
        enter6_1.addActionListener(new buttonForFrame6_1());
        enter6_2.addActionListener(new buttonForFrame6_2());

        // ------------------------------------------------ frame 7 ------------------------------------------------- //
        frame7.setSize(400, 110);
        frame7.add(label7);
        frame7.add(size7);
        frame7.add(enter7);
        frame7.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setLocationRelativeTo(null);
        enter7.addActionListener(new buttonForFrame7());

        // ------------------------------------------------ systematic ---------------------------------------------- //
        frame8.setSize(1000, 175);
        panel8.add(pane8);
        frame8.getContentPane().add(pane8, BorderLayout.CENTER);
        table8.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table8.setFont(new Font("Open Sans", Font.PLAIN, 15));
        pane8.setBounds(5, 218, 884, 194);
        table8.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pane8.createHorizontalScrollBar();
        table8.putClientProperty("terminateEditOnFocusLost", true);
        frame8.add(pane8);
        frame8.add(enter8_1);
        frame8.add(enter8_2);
        frame8.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame8.setLocationRelativeTo(null);
        enter8_1.addActionListener(new buttonForFrame8_1());
        enter8_2.addActionListener(new buttonForFrame8_2());

        // ------------------------------------------------ stratified ---------------------------------------------- //
        frame9.setSize(1000, 300);
        panel9.add(pane9_1);
        panel9.add(pane9_2);
        frame9.getContentPane().add(pane9_1, BorderLayout.CENTER);
        frame9.getContentPane().add(pane9_2, BorderLayout.CENTER);
        table9_1.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table9_2.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table9_1.setFont(new Font("Open Sans", Font.PLAIN, 15));
        table9_2.setFont(new Font("Open Sans", Font.PLAIN, 15));
        pane9_1.setBounds(5, 218, 884, 194);
        pane9_2.setBounds(5, 218, 884, 194);
        table9_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table9_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pane9_1.createHorizontalScrollBar();
        pane9_2.createHorizontalScrollBar();
        table9_1.putClientProperty("terminateEditOnFocusLost", true);
        table9_2.putClientProperty("terminateEditOnFocusLost", true);
        frame9.add(label9_1);
        frame9.add(pane9_1);
        frame9.add(label9_2);
        frame9.add(pane9_2);
        frame9.add(enter9);
        frame9.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame9.setLocationRelativeTo(null);
        enter9.addActionListener(new buttonForFrame9());

        // ------------------------------------------------ frame 10 ------------------------------------------------ //
        frame10.setSize(445, 110);
        frame10.add(label10);
        frame10.add(size10);
        frame10.add(enter10);
        frame10.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame10.setLocationRelativeTo(null);
        enter10.addActionListener(new buttonForFrame10());

        // ------------------------------------------------ frame 11 ------------------------------------------------ //
        frame11.setSize(1000, 300);
        panel11.add(pane11_1);
        panel11.add(pane11_2);
        frame11.getContentPane().add(pane11_1, BorderLayout.CENTER);
        frame11.getContentPane().add(pane11_2, BorderLayout.CENTER);
        table11_1.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table11_2.setPreferredScrollableViewportSize(new Dimension(950, 40));
        table11_1.setFont(new Font("Open Sans", Font.PLAIN, 15));
        table11_2.setFont(new Font("Open Sans", Font.PLAIN, 15));
        pane11_1.setBounds(5, 218, 884, 194);
        pane11_2.setBounds(5, 218, 884, 194);
        table11_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table11_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        pane11_1.createHorizontalScrollBar();
        pane11_2.createHorizontalScrollBar();
        table11_1.putClientProperty("terminateEditOnFocusLost", true);
        table11_2.putClientProperty("terminateEditOnFocusLost", true);
        frame11.add(label11_1);
        frame11.add(pane11_1);
        frame11.add(label11_2);
        frame11.add(pane11_2);
        frame11.add(enter11_1);
        frame11.add(enter11_2);
        frame11.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame11.setLocationRelativeTo(null);
        enter11_1.addActionListener(new buttonForFrame11_1());
        enter11_2.addActionListener(new buttonForFrame11_2());
    }

    private class buttonForFrame1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                samplingChoice = group1.getSelection().getActionCommand();
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(frame2, "Choose one!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                frame1.setVisible(true);
                throw new NullPointerException();
            }

            frame1.dispose();

            if(samplingChoice.equals("4")) {
                new MainMenu();
            } else {
                frame2.setVisible(true);
            }
        }
    }

    private class buttonForFrame2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sizeText = size.getText();

            try {
                population = Integer.parseInt(sizeText);
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame2, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                size.setText("");
                frame2.setVisible(true);
                throw new NumberFormatException();
            }

            try {
                typeChoice = group2.getSelection().getActionCommand();
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(frame2, "Choose one!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                frame2.setVisible(true);
                throw new NullPointerException();
            }

            if(population > 1000 || population <= 0) {
                try {
                    if(population > 1000) {
                        JOptionPane.showMessageDialog(frame2, "Maximum number of inputs reached.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame2, "Invalid Input.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    size.setText("");
                    frame2.setVisible(true);
                    throw new Exception("Invalid input.");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame2.dispose();
                int temp = (int) Math.ceil((float) population/10);
                int temp2 = population % 10;
                for(int i = 0; i < temp; i++) {
                    model3.addRow(new Object[]{"","","","","","","","","",""});
                }

                if(temp2 != 0) {
                    for(int i = temp - 1, j = temp2; j < 10; j++) {
                        model3.setValueAt("---", i, j);
                    }
                }


                // center align all elements in the table
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);

                for(int x = 0; x < 10; x++){
                    table3.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
                }

                table3.setRowHeight(30);

                frame3.setVisible(true);
                JOptionPane.showMessageDialog(frame3, "Input the sampling frame in the table.\n" +
                        "Use tab to travel to another cell.\nDo not edit the cell with '--' text, " +
                        "the datum you will enter in that cell \n" +
                        "will not be included.");

            }
        }
    }

    private class buttonForFrame3_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int count = 0;
            int row = table3.getRowCount();
            int column = table3.getColumnCount();

            try {
                for (int j = 0; j < row; j++) {
                    for (int i = 0; i < column; i++) {
                        cell = String.valueOf(table3.getValueAt(j, i));
                        if (typeChoice.equals("Numerical")) {
                            numericalList.add(Integer.valueOf(cell));
                        } else if (typeChoice.equals("Character")) {
                            try {
                                characterList.add(cell.charAt(0));
                            } catch(IndexOutOfBoundsException ef) {
                                JOptionPane.showMessageDialog(frame3, "Invalid inputs.", "Error", JOptionPane.ERROR_MESSAGE);
                                frame3.setVisible(true);
                                throw new IndexOutOfBoundsException();
                            }
                        }
                        count++;
                        if (count >= population) {
                            break;
                        }
                    }
                }
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame3, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
                frame3.setVisible(true);
                throw new NumberFormatException();
            }

            frame3.dispose();

            model4.setColumnCount(population);
            if (typeChoice.equals("Numerical")) {
                String[] index = new String[numericalList.size()];
                String[] item = new String[numericalList.size()];
                for(int i = 0; i < numericalList.size(); i++) {
                    item[i] = "Item " + String.valueOf(numericalList.get(i));
                }
                for(int i = 0; i < numericalList.size(); i++) {
                    index[i] = "Index " + (i + 1);
                }
                model4.addRow(index);
                model4.addRow(item);
            } else if (typeChoice.equals("Character")) {
                String[] index = new String[characterList.size()];
                String[] item = new String[characterList.size()];
                for(int i = 0; i < characterList.size(); i++) {
                    item[i] = "Item " + characterList.get(i);
                }
                for(int i = 0; i < characterList.size(); i++) {
                    index[i] = "Index " + (i + 1);
                }

                model4.addRow(index);
                model4.addRow(item);
            }
            frame4.setVisible(true);
        }
    }

    private class buttonForFrame3_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame3, "Just double click the cell!");
        }
    }

    private class buttonForFrame4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame4.dispose();
            if(samplingChoice.equals("1")) {
                frame5.setVisible(true);
            } else if(samplingChoice.equals("2")) {
                frame7.setVisible(true);
            } else if(samplingChoice.equals("3")) {
                if(typeChoice.equals("Numerical")) {
                    for(int i = 0; i < numericalList.size(); i++) {
                        String temp = Integer.toString(numericalList.get(i));
                        int temp2 = Integer.parseInt(temp);
                        if(temp2 % 2 == 0) {
                            even.add(numericalList.get(i));
                        } else {
                            odd.add(numericalList.get(i));
                        }
                    }
                } else if(typeChoice.equals("Character")) {
                    for(int i = 0; i < characterList.size(); i++) {
                        int temp = (int) characterList.get(i);
                        if(temp % 2 == 0) {
                            even.add(characterList.get(i));
                        } else {
                            odd.add(characterList.get(i));
                        }
                    }
                }

                model9_1.setColumnCount(even.size());
                String[] index1 = new String[even.size()];
                String[] item1 = new String[even.size()];
                for(int i = 0; i < even.size(); i++) {
                    item1[i] = "Item " + String.valueOf(even.get(i));
                }
                for(int i = 0; i < even.size(); i++) {
                    index1[i] = "Index " + (i + 1);
                }

                model9_1.addRow(index1);
                model9_1.addRow(item1);

                model9_2.setColumnCount(odd.size());
                String[] index2 = new String[odd.size()];
                String[] item2 = new String[odd.size()];
                for(int i = 0; i < odd.size(); i++) {
                    item2[i] = "Item " + String.valueOf(odd.get(i));
                }
                for(int i = 0; i < odd.size(); i++) {
                    index2[i] = "Index " + (i + 1);
                }

                model9_2.addRow(index2);
                model9_2.addRow(item2);

                frame9.setVisible(true);
            }
        }
    }

    private class buttonForFrame5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sampleText = size5.getText();
            try {
                sampleSize = Integer.parseInt(sampleText);
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame5, "Input should be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                size5.setText("");
                frame5.setVisible(true);
                throw new NumberFormatException();
            }

            if(sampleSize > population || sampleSize <= 0) {
                try {
                    if(sampleSize > population) {
                        JOptionPane.showMessageDialog(frame5, "The sample size should be lesser than the population.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (sampleSize == 0){
                        JOptionPane.showMessageDialog(frame5, "The sample size should not be equal to 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame5, "The sample size should not be lesser than 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    size5.setText("");
                    frame5.setVisible(true);
                    throw new Exception("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame5.dispose();

                int n = 0;
                Random Rand = new Random();
                for (int i = 0; i < sampleSize; i++) {
                    if (typeChoice.equals("Numerical")) {
                        do{
                            n = Rand.nextInt(population);
                        }while(randomSample.contains(numericalList.get(n)));

                        randomIndex.add(n);
                        randomSample.add(numericalList.get(n));
                    } else if (typeChoice.equals("Character")) {
                        do{
                            n = Rand.nextInt(population);
                        }while(randomSample.contains(characterList.get(n)));

                        randomIndex.add(n);
                        randomSample.add(characterList.get(n));
                    }
                }

                model6.setColumnCount(sampleSize);
                String[] index = new String[randomIndex.size()];
                String[] item = new String[randomSample.size()];
                for(int i = 0; i < randomSample.size(); i++) {
                    item[i] = "Item " + String.valueOf(randomSample.get(i));
                }
                for(int i = 0; i < randomIndex.size(); i++) {
                    index[i] = "Index " + (randomIndex.get(i) + 1);
                }

                model6.addRow(index);
                model6.addRow(item);
                frame6.setVisible(true);
            }
        }
    }

    private class buttonForFrame6_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class buttonForFrame6_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame6.dispose();
            new Activity1();
        }
    }

    private class buttonForFrame7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            systematicText = size7.getText();
            try {
                systematicSize = Integer.parseInt(systematicText);
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame7, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                size7.setText("");
                frame7.setVisible(true);
                throw new NumberFormatException();
            }

            if(systematicSize > population || systematicSize <= 0) {
                try {
                    if(systematicSize > population) {
                        JOptionPane.showMessageDialog(frame7, "The systematic size should be lesser than the population.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    } else if(systematicSize == 0){
                        JOptionPane.showMessageDialog(frame7, "The systematic size should not be equal to 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame7, "The systematic size should not be lesser than 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    size7.setText("");
                    frame7.setVisible(true);
                    throw new Exception("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame7.dispose();
                k = (int) Math.ceil((float) population/systematicSize);
                Random generator = new Random();
                int startingPoint = generator.nextInt((k - 1) + 1) + 1;
                boolean c = false;

                if (typeChoice.equals("Numerical")) {
                    for(int i = 0, j = startingPoint; i < systematicSize + 1; i++, j += k){
                        if(numericalList.size() <= j) {
                            int temp = j % numericalList.size();
                            j = temp;
                        }
                        System.out.println("j: " + j + " k: " + k);

                        if(c == true) {
                            strat.add(numericalList.get(j));
                            randomIndex.add(j);
                        }
                        c = true;
                    }
                } else if (typeChoice.equals("Character")) {
                    for(int i = 0, j = startingPoint; i < systematicSize + 1; i++, j += k){
                        if(characterList.size() < j || characterList.size() == j) {
                            int temp = j % characterList.size();
                            j = temp;
                        }
                        System.out.println("j: " + j + " k: " + k);
                        if(c == true) {
                            strat.add(characterList.get(j));
                            randomIndex.add(j);
                        }
                        c = true;

                    }
                }

                model8.setColumnCount(systematicSize);
                String[] index = new String[randomIndex.size()];
                String[] item = new String[strat.size()];
                for(int i = 0; i < strat.size(); i++) {
                    item[i] = "Item " + String.valueOf(strat.get(i));
                }
                for(int i = 0; i < randomIndex.size(); i++) {
                    index[i] = "Index " + (randomIndex.get(i) + 1);
                }

                model8.addRow(index);
                model8.addRow(item);
                frame8.setVisible(true);
            }
        }
    }

    private class buttonForFrame8_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class buttonForFrame8_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame8.dispose();
            new Activity1();
        }
    }

    private class buttonForFrame9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame9.dispose();
            frame10.setVisible(true);
        }
    }

    private class buttonForFrame10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stratifiedText = size10.getText();
            try {
                stratifiedSize = Integer.parseInt(stratifiedText);
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame10, "Input should be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                size10.setText("");
                frame10.setVisible(true);
                throw new NumberFormatException();
            }

            if(stratifiedSize > 100.5 || stratifiedSize <= 0) {
                try {
                    if(stratifiedSize > 100.5) {
                        JOptionPane.showMessageDialog(frame10, "The percentage should be lesser than 100.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (stratifiedSize == 0){
                        JOptionPane.showMessageDialog(frame10, "The percentage should not be equal to 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame10, "The percentage should not be lesser than 0.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    size10.setText("");
                    frame10.setVisible(true);
                    throw new Exception("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame10.dispose();
                int evenStrataPercentage = (int) Math.ceil((float) even.size() * (stratifiedSize / 100.0));
                int oddStrataPercentage = (int) Math.ceil((float) odd.size() * (stratifiedSize / 100.0));

                int n = 0;
                Random Rand = new Random();
                for (int i = 0; i < evenStrataPercentage; i++) {
                    do{
                        n = Rand.nextInt(even.size());
                    }while(randomStratified1.contains(even.get(n)));

                    randomIndex1.add(n);
                    randomStratified1.add(even.get(n));
                }

                for (int i = 0; i < oddStrataPercentage; i++) {
                    do{
                        n = Rand.nextInt(odd.size());
                    }while(randomStratified2.contains(odd.get(n)));

                    randomIndex2.add(n);
                    randomStratified2.add(odd.get(n));
                }

                model11_1.setColumnCount(randomStratified1.size());
                String[] index1 = new String[randomIndex1.size()];
                String[] item1 = new String[randomStratified1.size()];
                for(int i = 0; i < randomStratified1.size(); i++) {
                    item1[i] = "Item " + String.valueOf(randomStratified1.get(i));
                }
                for(int i = 0; i < randomIndex1.size(); i++) {
                    index1[i] = "Index " + (randomIndex1.get(i) + 1);
                }

                model11_1.addRow(index1);
                model11_1.addRow(item1);

                model11_2.setColumnCount(randomStratified2.size());
                String[] index2 = new String[randomIndex2.size()];
                String[] item2 = new String[randomStratified2.size()];
                for(int i = 0; i < randomStratified2.size(); i++) {
                    item2[i] = "Item " + String.valueOf(randomStratified2.get(i));
                }
                for(int i = 0; i < randomIndex2.size(); i++) {
                    index2[i] = "Index " + (randomIndex2.get(i) + 1);
                }

                model11_2.addRow(index2);
                model11_2.addRow(item2);

                label11_1.setText("STRATA 1 (" + randomStratified1.size() + ")");
                label11_2.setText("STRATA 2 (" + randomStratified2.size() + ")");
                frame11.setVisible(true);
            }
        }
    }

    private class buttonForFrame11_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class buttonForFrame11_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame11.dispose();
            new Activity1();
        }
    }
}