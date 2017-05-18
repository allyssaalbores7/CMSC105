import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Allyssa Albores, Chezkah Tahadlangit on 25/04/2017.
 */

public class Activity3 {
    // first frame variables: grouped or ungrouped
    JFrame frame1 = new JFrame("Descriptive Statistics");
    JPanel panel1 = new JPanel();
    GroupLayout groupLayout1 = new GroupLayout(panel1);
    JLabel label1 = new JLabel("Choose one: ");
    ButtonGroup group1 = new ButtonGroup();
    JRadioButton ungrouped = new JRadioButton("Ungrouped Data");
    JRadioButton grouped = new JRadioButton("Grouped Data");
    JRadioButton goBack = new JRadioButton("Main Menu");
    JButton enter1 = new JButton("Enter");
    String dataChoice;

    // ------------------------------------------- ungrouped variables ---------------------------------------------- //

    // second frame variables: data type
    JFrame frame2 = new JFrame("Descriptive Statistics");
    JPanel panel2 = new JPanel();
    GroupLayout groupLayout2 = new GroupLayout(panel2);
    JLabel label2 = new JLabel("Choose your desired type of data: ");
    ButtonGroup group2 = new ButtonGroup();
    JRadioButton intType = new JRadioButton("Integer");
    JRadioButton floatType = new JRadioButton("Float");
    JButton enter2 = new JButton("Enter");
    String dataType;

    // third frame variables: description
    JFrame frame3 = new JFrame("Descriptive Statistics");
    JLabel label3 = new JLabel("Input a brief description about the data to be entered: ");
    JTextField description = new JTextField("", 25);
    JButton enter3 = new JButton("Enter");
    String descText;

    // fourth frame variables: ungrouped data set
    JFrame frame4 = new JFrame("Descriptive Statistics");
    JLabel label4_1 = new JLabel("Enter your data: ");
    JTextField ungroupedDataSet = new JTextField("", 25);
    JButton enter4 = new JButton("Enter");
    JLabel label4_2 = new JLabel("Maximum of 100 inputs. ");
    JLabel label4_3 = new JLabel("Use comma to separate inputs.");
    String ungroupedDataString;
    String[] ustringDataSet;
    int[] intUngroupedData;
    float[] floatUngroupedData;

    // fifth frame variables: ungrouped data display and edit
    String[] columns = new String[] {"⊶", "⊶", "⊶",
            "⊶", "⊶", "⊶", "⊶", "⊶", "⊶", "⊶"};
    Object[][] data = new Object[][] {};
    int[] uinewValues;
    float[] ufnewValues;
    JFrame frame5 = new JFrame("Descriptive Statistics");
    JPanel panel5 = new JPanel();
    JButton enter5_1 = new JButton("Continue");
    JButton enter5_2 = new JButton("Edit");
    DefaultTableModel model = new DefaultTableModel(data, columns);
    JTable table = new JTable(model);
    JScrollPane pane = new JScrollPane(table);
    String[] rowTable;
    int[][] uiDisplay;
    float[][] ufDisplay;
    int column = 10;
    int length;
    int row;

    // sixth frame variables: measures of central tendency
    JFrame frame6 = new JFrame("Descriptive Statistics");
    JPanel panel6 = new JPanel();
    GroupLayout groupLayout6 = new GroupLayout(panel6);
    JLabel label6 = new JLabel("Measures of Central Tendency: ");
    ButtonGroup group6 = new ButtonGroup();
    JRadioButton mean = new JRadioButton("Mean");
    JRadioButton median = new JRadioButton("Median");
    JRadioButton mode = new JRadioButton("Mode");
    JRadioButton allMeasures = new JRadioButton("All measures");
    JButton enter6 = new JButton("Enter");
    String measureChoice;
    // mean and standard deviation
    int uiTotal;
    float ufTotal;
    double umean;
    double usdev;
    double uvar;
    // median and range
    int uimedian;
    float ufmedian;
    int uirange;
    float ufrange;
    // mode
    ArrayList umodes;

    // seventh frame variables:
    JFrame frame7 = new JFrame("Descriptive Statistics");
    JLabel label7 = new JLabel("Enter your interpretation of the output presented: ");
    JTextField interpretation = new JTextField("", 25);
    JButton enter7 = new JButton("Enter");

    // eight frame variables:
    JFrame frame8 = new JFrame("Descriptive Statistics");
    JLabel label8 = new JLabel("Do you want to quit? If not, execute another run. \n" +
            "Choose whether to use the same data or input a new dataset.");
    JButton enter8_1 = new JButton("Quit");
    JButton enter8_2 = new JButton("Same Dataset");
    JButton enter8_3 = new JButton("New Dataset");

    // ninth frame variables:
    JFrame frame9 = new JFrame("Descriptive Statistics");
    JLabel label9_1 = new JLabel("What is the total number of class intervals?");
    JTextField intervals = new JTextField("", 25);
    JLabel label9_2 = new JLabel("Choose one: ");
    ButtonGroup group9 = new ButtonGroup();
    JRadioButton openEnded = new JRadioButton("open-ended");
    JRadioButton closeEnded = new JRadioButton("close-ended");
    JButton enter9 = new JButton("Enter");
    String intervalChoice;
    String totalIntervals;
    int totalInterval;

    // tenth frame variables:
    JFrame frame10 = new JFrame("Descriptive Statistics");
    JLabel label10 = new JLabel("Which class interval is open-ended?");
    JPanel panel10 = new JPanel();
    GroupLayout groupLayout10 = new GroupLayout(panel10);
    ButtonGroup group10 = new ButtonGroup();
    JRadioButton first = new JRadioButton("First");
    JRadioButton last = new JRadioButton("Last");
    JRadioButton both = new JRadioButton("Both");
    JButton enter10 = new JButton("Enter");
    String groupedOpen;

    //eleventh frame variables:
    JFrame frame11 = new JFrame("Descriptive Statistics");
    JPanel panel11 = new JPanel();
    JLabel label11_1 = new JLabel("Enter the class limits and the corresponding frequencies for the middle class");
    JLabel label11_2 = new JLabel("intervals according to the following column order: lower class limit, upper class limit, and");
    JLabel label11_3 = new JLabel("frequency, for each class interval.");
    JButton enter11 = new JButton("Enter");
    //String grouped;

    String fin;

    // 12th frame variables:
    String[] columns12 = new String[] {"lower class limit", "upper class limit", "frequency"};
    Object[][] data12 = new Object[][] {};
    JFrame frame12 = new JFrame("Descriptive Statistics");
    JPanel panel12 = new JPanel();
    JButton enter12_1 = new JButton("Continue");
    JButton enter12_2 = new JButton("Edit");
    DefaultTableModel model12 = new DefaultTableModel(data12, columns12);
    JTable table12 = new JTable(model12);
    JScrollPane pane12 = new JScrollPane(table12);

    // insert 13th frame variables
    String[] columns13 = new String[] {};
    Object[][] data13 = new Object[][] {};
    JFrame frame13 = new JFrame("Descriptive Statistics");
    JPanel panel13 = new JPanel();
    JButton enter13_1 = new JButton("Continue");
    DefaultTableModel model13 = new DefaultTableModel(data13, columns13);
    JTable table13 = new JTable(model13);
    JScrollPane pane13 = new JScrollPane(table13);
    int[] lowerLimitInt;
    float[] lowerLimitFloat;
    int[] upperLimitInt;
    float[] upperLimitFloat;
    double[] classMark;
    String[] stringClass;
    String[] newLowerLim;
    String[] newUpperLim;
    String[] newFreq;
    double[] fixi;
    double[] fixi2;
    String[] stringFixi;
    String[] stringFixi2;
    double totalFixi2;
    String stringTotalFixi2;
    double totalFixi;
    String stringTotalFixi;
    int totalFreq;
    String stringTotalFreq;
    double grpMean;
    String stringGrpMean;
    double var;
    double sDev;
    String stringVar;
    String stringSDev;
    int modeCtr;
    String stringMode;
    ArrayList<Integer> modalClass;
    ArrayList<String> stringModalClass;
    String strLower;
    String strUpper;



    // fifteenth frame variables:
    String[] columns15 = new String[] {"lower class limit", "upper class limit", "frequency"};
    Object[][] data15 = new Object[][] {};
    JFrame frame15 = new JFrame("Descriptive Statistics");
    JPanel panel15 = new JPanel();
    JButton enter15_1 = new JButton("Continue");
    JButton enter15_2 = new JButton("Edit");
    DefaultTableModel model15 = new DefaultTableModel(data15, columns15);
    JTable table15 = new JTable(model15);
    JScrollPane pane15 = new JScrollPane(table15);

    // grouped table variables
    int[] frequency;
    int counter;
    String openModeGrouped;


    public Activity3(){
        components();
    }

    private void components() {
        // ------------------------------------------------ frame 1 ------------------------------------------------- //
        panel1.setLayout(groupLayout1);
        groupLayout1.setAutoCreateGaps(true);
        groupLayout1.setAutoCreateContainerGaps(true);
        ungrouped.setActionCommand("Ungrouped Data");
        grouped.setActionCommand("Grouped Data");
        goBack.setActionCommand("4");
        group1.add(grouped);
        group1.add(ungrouped);
        group1.add(goBack);

        // groupLayout start
        GroupLayout.SequentialGroup left1 = groupLayout1.createSequentialGroup();
        left1.addComponent(label1);
        GroupLayout.ParallelGroup radioButtons1 = groupLayout1.createParallelGroup();
        radioButtons1.addComponent(ungrouped);
        radioButtons1.addComponent(grouped);
        radioButtons1.addComponent(goBack);
        radioButtons1.addComponent(enter1);
        enter1.addActionListener(new buttonForFrame1());
        left1.addGroup(radioButtons1);

        GroupLayout.SequentialGroup topToBottom1 = groupLayout1.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop1 = groupLayout1.createParallelGroup();
        rowTop1.addComponent(label1);
        rowTop1.addComponent(ungrouped);
        topToBottom1.addGroup(rowTop1);
        topToBottom1.addComponent(grouped);
        topToBottom1.addComponent(goBack);
        topToBottom1.addComponent(enter1);

        groupLayout1.setHorizontalGroup(left1);
        groupLayout1.setVerticalGroup(topToBottom1);
        //end

        frame1.add(panel1);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

        // ------------------------------------------------ frame 2 ------------------------------------------------- //
        panel2.setLayout(groupLayout2);
        groupLayout2.setAutoCreateGaps(true);
        groupLayout2.setAutoCreateContainerGaps(true);
        intType.setActionCommand("Integer");
        floatType.setActionCommand("Float");
        group2.add(intType);
        group2.add(floatType);

        //groupLayout start
        GroupLayout.SequentialGroup left2 = groupLayout2.createSequentialGroup();
        left2.addComponent(label2);
        GroupLayout.ParallelGroup radioButtons2 = groupLayout2.createParallelGroup();
        radioButtons2.addComponent(intType);
        radioButtons2.addComponent(floatType);
        radioButtons2.addComponent(enter2);
        enter2.addActionListener(new buttonForFrame2());
        left2.addGroup(radioButtons2);

        GroupLayout.SequentialGroup topToBottom2 = groupLayout2.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop2 = groupLayout2.createParallelGroup();
        rowTop2.addComponent(label2);
        rowTop2.addComponent(intType);
        topToBottom2.addGroup(rowTop2);
        topToBottom2.addComponent(floatType);
        topToBottom2.addComponent(enter2);

        groupLayout2.setHorizontalGroup(left2);
        groupLayout2.setVerticalGroup(topToBottom2);
        //end

        frame2.add(panel2);
        frame2.pack();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);

        // ------------------------------------------------ frame 3 ------------------------------------------------- //
        frame3.setSize(600, 100);
        frame3.add(label3);
        frame3.add(description);
        frame3.add(enter3);
        frame3.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        enter3.addActionListener(new buttonForFrame3());

        // ------------------------------------------------ frame 4 ------------------------------------------------- //
        frame4.setSize(500, 100);
        frame4.add(label4_1);
        frame4.add(ungroupedDataSet);
        frame4.add(enter4);
        frame4.add(label4_2);
        frame4.add(label4_3);
        frame4.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setLocationRelativeTo(null);
        enter4.addActionListener(new buttonForFrame4());

        // ------------------------------------------------ frame 5 ------------------------------------------------- //
        frame5.setSize(535, 500);
        panel5.add(pane);
        frame5.getContentPane().add(pane, BorderLayout.CENTER);
        table.setPreferredScrollableViewportSize(new Dimension(500, 390));
        pane.setBounds(5, 218, 884, 194);
        table.putClientProperty("terminateEditOnFocusLost", true);
        frame5.add(pane);
        frame5.add(enter5_1);
        frame5.add(enter5_2);
        frame5.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setLocationRelativeTo(null);
        enter5_1.addActionListener(new buttonForFrame5_1());
        enter5_2.addActionListener(new buttonForFrame5_2());

        // ------------------------------------------------ frame 6 ------------------------------------------------- //
        panel6.setLayout(groupLayout6);
        groupLayout6.setAutoCreateGaps(true);
        groupLayout6.setAutoCreateContainerGaps(true);
        mean.setActionCommand("Mean");
        median.setActionCommand("Median");
        mode.setActionCommand("Mode");
        allMeasures.setActionCommand("All measures");
        group6.add(mean);
        group6.add(median);
        group6.add(mode);
        group6.add(allMeasures);

        // groupLayout start
        GroupLayout.SequentialGroup left6 = groupLayout6.createSequentialGroup();
        left6.addComponent(label6);
        GroupLayout.ParallelGroup radioButtons6 = groupLayout6.createParallelGroup();
        radioButtons6.addComponent(mean);
        radioButtons6.addComponent(median);
        radioButtons6.addComponent(mode);
        radioButtons6.addComponent(allMeasures);
        radioButtons6.addComponent(enter6);
        enter6.addActionListener(new buttonForFrame6());
        left6.addGroup(radioButtons6);

        GroupLayout.SequentialGroup topToBottom6 = groupLayout6.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop6 = groupLayout6.createParallelGroup();
        rowTop6.addComponent(label6);
        rowTop6.addComponent(mean);
        topToBottom6.addGroup(rowTop6);
        topToBottom6.addComponent(median);
        topToBottom6.addComponent(mode);
        topToBottom6.addComponent(allMeasures);
        topToBottom6.addComponent(enter6);

        groupLayout6.setHorizontalGroup(left6);
        groupLayout6.setVerticalGroup(topToBottom6);
        //end

        frame6.add(panel6);
        frame6.pack();
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setLocationRelativeTo(null);

        // ------------------------------------------------ frame 7 ------------------------------------------------- //
        frame7.setSize(500, 100);
        frame7.add(label7);
        frame7.add(interpretation);
        frame7.add(enter7);
        frame7.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setLocationRelativeTo(null);
        enter7.addActionListener(new buttonForFrame7());

        // ------------------------------------------------ frame 8 ------------------------------------------------- //
        frame8.setSize(700, 100);
        frame8.add(label8);
        frame8.add(enter8_2);
        frame8.add(enter8_3);
        frame8.add(enter8_1);
        frame8.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame8.setLocationRelativeTo(null);
        enter8_1.addActionListener(new buttonForFrame8_1());
        enter8_2.addActionListener(new buttonForFrame8_2());
        enter8_3.addActionListener(new buttonForFrame8_3());

        // ------------------------------------------------ frame 9 ------------------------------------------------- //
        frame9.setSize(600, 100);
        openEnded.setActionCommand("open-ended");
        closeEnded.setActionCommand("close-ended");
        group9.add(openEnded);
        group9.add(closeEnded);
        frame9.add(label9_1);
        frame9.add(intervals);
        frame9.add(label9_2);
        frame9.add(openEnded);
        frame9.add(closeEnded);
        frame9.add(enter9);
        frame9.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame9.setLocationRelativeTo(null);
        enter9.addActionListener(new buttonForFrame9());

        // ------------------------------------------------ frame 10 ------------------------------------------------ //
        panel10.setLayout(groupLayout10);
        groupLayout10.setAutoCreateGaps(true);
        groupLayout10.setAutoCreateContainerGaps(true);
        first.setActionCommand("First");
        last.setActionCommand("Last");
        both.setActionCommand("Both");
        group10.add(first);
        group10.add(last);
        group10.add(both);

        // groupLayout start
        GroupLayout.SequentialGroup left10 = groupLayout10.createSequentialGroup();
        left10.addComponent(label10);
        GroupLayout.ParallelGroup radioButtons10 = groupLayout10.createParallelGroup();
        radioButtons10.addComponent(first);
        radioButtons10.addComponent(last);
        radioButtons10.addComponent(both);
        radioButtons10.addComponent(enter10);
        enter10.addActionListener(new buttonForFrame10());
        left10.addGroup(radioButtons10);

        GroupLayout.SequentialGroup topToBottom10 = groupLayout10.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop10 = groupLayout10.createParallelGroup();
        rowTop10.addComponent(label10);
        rowTop10.addComponent(first);
        topToBottom10.addGroup(rowTop10);
        topToBottom10.addComponent(last);
        topToBottom10.addComponent(both);
        topToBottom10.addComponent(enter10);

        groupLayout10.setHorizontalGroup(left10);
        groupLayout10.setVerticalGroup(topToBottom10);
        //end

        frame10.add(panel10);
        frame10.pack();
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame10.setLocationRelativeTo(null);

        // ------------------------------------------------ frame 11 ------------------------------------------------ //

        frame11.setSize(600, 150);
        frame11.add(label11_1);
        frame11.add(label11_2);
        frame11.add(label11_3);
        frame11.add(enter11);
        frame11.add(panel11);
        frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame11.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame11.setLocationRelativeTo(null);
        enter11.addActionListener(new ButtonForFrame11());

        // ------------------------------------------------ frame 12 ------------------------------------------------ //
        frame12.setSize(535, 500);
        panel12.add(pane12);
        frame12.getContentPane().add(pane12, BorderLayout.CENTER);
        table12.setPreferredScrollableViewportSize(new Dimension(500, 390));
        pane12.setBounds(5, 218, 884, 194);
        table12.putClientProperty("terminateEditOnFocusLost", true);
        frame12.add(pane12);
        frame12.add(enter12_1);
        frame12.add(enter12_2);
        frame12.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame12.setLocationRelativeTo(null);
        enter12_1.addActionListener(new ButtonForFrame12_1());
        enter12_2.addActionListener(new ButtonForFrame12_2());

        // ------------------------------------------------ frame 13 ------------------------------------------------ //

        frame13.setSize(535, 500);
        panel13.add(pane13);
        frame13.getContentPane().add(pane13, BorderLayout.CENTER);
        table13.setPreferredScrollableViewportSize(new Dimension(500, 390));
        pane13.setBounds(5, 218, 884, 194);
        table13.putClientProperty("terminateEditOnFocusLost", true);
        frame13.add(pane13);
        frame13.add(enter13_1);
        frame13.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame13.setLocationRelativeTo(null);
        enter13_1.addActionListener(new ButtonForFrame13_1());


        // ------------------------------------------------ frame 15 ------------------------------------------------ //
        frame15.setSize(535, 500);
        panel15.add(pane15);
        frame15.getContentPane().add(pane15, BorderLayout.CENTER);
        table15.setPreferredScrollableViewportSize(new Dimension(500, 390));
        pane15.setBounds(5, 218, 884, 194);
        table15.putClientProperty("terminateEditOnFocusLost", true);
        frame15.add(pane15);
        frame15.add(enter15_1);
        frame15.add(enter15_2);
        frame15.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame15.setLocationRelativeTo(null);
        enter15_1.addActionListener(new buttonForFrame15_1());
        enter15_2.addActionListener(new buttonForFrame15_2());

        // ------------------------------------------------ frame 16 ------------------------------------------------ //

    }

    private class buttonForFrame1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dataChoice = group1.getSelection().getActionCommand();

            if(dataChoice.equals("4")) {
                frame1.dispose();
                new MainMenu();
            } else {
                frame1.dispose();
                frame2.setVisible(true);
            }
        }
    }

    private class buttonForFrame2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dataType = group2.getSelection().getActionCommand();

            frame2.dispose();
            frame3.setVisible(true);
        }
    }

    private class buttonForFrame3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            descText = description.getText();

            if(descText.length() > 50) {
                try {
                    JOptionPane.showMessageDialog(frame3, "Maximum number of characters reached.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    description.setText("");
                    throw new Exception("Maximum number of characters reached.");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame3.dispose();
                if(dataChoice.equals("Ungrouped Data")) {
                    frame4.setVisible(true);
                } else if(dataChoice.equals("Grouped Data")){
                    frame9.setVisible(true);
                }
            }
        }
    }

    private class buttonForFrame4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int i = 0;
            ungroupedDataString = ungroupedDataSet.getText();
            ungroupedDataString = ungroupedDataString.replaceAll("\\s+",""); // remove spaces
            ustringDataSet = ungroupedDataString.split(",");
            intUngroupedData = new int[ustringDataSet.length];
            floatUngroupedData = new float[ustringDataSet.length];
            rowTable = new String[10];

            // to check if the number of inputs reached the limit (maximum of 100)
            if(ustringDataSet.length > 100) {
                try {
                    JOptionPane.showMessageDialog(frame4, "Only 100 inputs allowed", "Error", JOptionPane.ERROR_MESSAGE);
                    ungroupedDataSet.setText("");
                    //System.exit(0);
                    throw new Exception("Maximum number of inputs reached.");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

            // to check if all the inputs have the same data type and converts the string array data to int or float
            if(dataType.equals("Integer")) {
                try {
                    for(String str : ustringDataSet){
                        intUngroupedData[i] = Integer.parseInt(str);
                        i++;
                    }
                } catch(NumberFormatException g) {
                    JOptionPane.showMessageDialog(frame4, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
                    ungroupedDataSet.setText("");
                    //frame4.dispose();
                    //System.exit(0);
                    throw new NumberFormatException();
                }
            } else if(dataType.equals("Float")) {
                try {
                    for(String str : ustringDataSet){
                        floatUngroupedData[i] = Float.parseFloat(str);
                        i++;
                    }
                } catch(NumberFormatException g) {
                    JOptionPane.showMessageDialog(frame4, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
                    ungroupedDataSet.setText("");
                    //frame4.dispose();
                    //System.exit(0);
                    throw new NumberFormatException();
                }
            }

            convertTo2D();
            // put entire row in a string array for jtable
            for(int j = 0; j < row; j++) {
                for(int k = 0; k < column; k++) {
                    if(dataType.equals("Integer")) {
                        if(uiDisplay[j][k] == 0) {
                            rowTable[k] = "-";
                        } else {
                            rowTable[k] = String.valueOf(uiDisplay[j][k]);
                        }
                    } else if(dataType.equals("Float")) {
                        if(ufDisplay[j][k] == 0) {
                            rowTable[k] = "-";
                        } else {
                            rowTable[k] = String.valueOf(ufDisplay[j][k]);
                        }
                    }
                }
                model.addRow(rowTable);
            }

            // center align all elements in the table
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            for(int x = 0; x < 10; x++){
                table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
            }

            frame4.dispose();
            frame5.setTitle(descText);
            frame6.setTitle(descText);
            frame7.setTitle(descText);
            frame5.setVisible(true);
        }
    }

    private class buttonForFrame5_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame5.dispose();
            getAllValuesOfTable();
            frame6.setVisible(true);
        }
    }

    private class buttonForFrame5_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame5, "Double click a cell to edit the value. " +
                    "The changes will automatically be stored. Press continue if you're done editing.");
        }
    }

    private class buttonForFrame6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            measureChoice = group6.getSelection().getActionCommand();

            if(dataChoice.equals("Ungrouped Data")) {
                if(measureChoice.equals("Mean")) {
                    mean();
                    standardDeviation();
                    variance();
                    JOptionPane.showMessageDialog(frame6,
                            "Mean: " + umean + "  | "+ "Variance: " + uvar + "  | Standard Deviation: " + usdev);
                } else if(measureChoice.equals("Median")) {
                    median();
                    range();
                    if(dataType.equals("Integer")) {
                        JOptionPane.showMessageDialog(frame6,
                                "Range: " + uirange + "  |  Median: " + uimedian);
                    } else if(dataType.equals("Float")) {
                        JOptionPane.showMessageDialog(frame6,
                                "Range: " + ufrange + "  |  Median: " + ufmedian);
                    }
                } else if(measureChoice.equals("Mode")) {
                    mode();
                    String modes = new String();
                    String type = new String();
                    for(int i = 0; i < umodes.size(); i++) {
                        if(umodes.size() - 1 == i) {
                            modes = modes + umodes.get(i);
                        } else {
                            modes = modes + umodes.get(i) + ", ";
                        }
                    }

                    if(umodes.size() == 1) {
                        type = "unimodal";
                    } else if(umodes.size() == 2) {
                        type = "bimodal";
                    } else if(umodes.size() >= 3) {
                        type = "multimodal";
                    } else if(umodes.size() == 0) {
                        type = "no mode";
                    }

                    JOptionPane.showMessageDialog(frame6,
                            "Mode(s): " + modes + "  -  " + type);

                } else if(measureChoice.equals("All measures")) {
                    mean();
                    standardDeviation();
                    median();
                    range();
                    mode();

                    String modes = new String();
                    String type =  new String();
                    for(int i = 0; i < umodes.size(); i++) {
                        if(umodes.size() - 1 == i) {
                            modes = modes + umodes.get(i);
                        } else {
                            modes = modes + umodes.get(i) + ", ";
                        }
                    }
                    if(umodes.size() == 1) {
                        type = "unimodal";
                    } else if(umodes.size() == 2) {
                        type = "bimodal";
                    } else if(umodes.size() >= 3) {
                        type = "multimodal";
                    } else if(umodes.size() == 0) {
                        type = "no mode";
                    }

                    if(dataType.equals("Integer")) {
                        JOptionPane.showMessageDialog(frame6,
                                "Mean: " + umean + "  |  Standard Deviation: " + usdev + "\n" +
                                        "Range: " + uirange + "  |  Median: " + uimedian + "\n" +
                                        "Mode(s): " + modes + "  -  " + type);
                    } else if(dataType.equals("Float")) {
                        JOptionPane.showMessageDialog(frame6,
                                "Mean: " + umean + "  |  Standard Deviation: " + usdev + "\n" +
                                        "Range: " + ufrange + "  |  Median: " + ufmedian + "\n" +
                                        "Mode(s): " + modes + "  -  " + type);
                    }
                }

                frame6.dispose();
                frame7.setVisible(true);

            } else if(dataChoice.equals("Grouped Data")){
                if(intervalChoice.equals("open-ended")) {
                    if(measureChoice.equals("Mean")) {
                        JOptionPane.showMessageDialog(frame6, "Cannot be calculated.");
                    } else if(measureChoice.equals("Median")) {
                        JOptionPane.showMessageDialog(frame6, "Cannot be calculated.");
                    } else if(measureChoice.equals("Mode")) {
                        modeOfGrouped();
                        JOptionPane.showMessageDialog(frame6, "Mode: " + counter + "  -  " + openModeGrouped);
                        frame6.dispose();
                        frame7.setVisible(true);
                    } else if(measureChoice.equals("All measures")) {
                        modeOfGrouped();
                        JOptionPane.showMessageDialog(frame6, "Mean and Median cannot be calculated." +
                                " Mode: " + counter + "  -  " + openModeGrouped);
                        frame6.dispose();
                        frame7.setVisible(true);
                    }
                } else if(intervalChoice.equals("close-ended")) {
                    //insert hereee
                    if(measureChoice.equals("Mean")){
                        MeanOfGrouped();
                        groupedVarAndStandardDev();
                        JOptionPane.showMessageDialog(frame6, "Mean: " + stringGrpMean + "  ||  Variance: " + stringVar + "  ||  Standard Deviation: " + stringSDev);
                        frame6.dispose();
                        frame7.setVisible(true);
                    }else if(measureChoice.equals("Median")){
                        JOptionPane.showMessageDialog(frame13, " Median cannot be calculated.");
                    }else if(measureChoice.equals("Mode")){
                        ModeOfGrouped();
                        //displayModalClass();
                        JOptionPane.showMessageDialog(frame6, stringMode);
                        frame6.dispose();
                        frame7.setVisible(true);
                    }else if(measureChoice.equals("All measures")){
                        MeanOfGrouped();
                        groupedVarAndStandardDev();
                        ModeOfGrouped();
                        JOptionPane.showMessageDialog(frame6, "Mean: " + stringGrpMean + "  ||  Variance: " + stringVar + "  ||  Standard Deviation: " + stringSDev + "\n" + "Median: Median cannot be computed.\n" + "Mode: " + stringMode);
                        frame6.dispose();
                        frame7.setVisible(true);
                    }
                }
            }
        }
    }

    private class buttonForFrame7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame7.dispose();
            frame8.setVisible(true);
        }
    }

    private class buttonForFrame8_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame8.dispose();
            System.exit(0);
        }
    }

    private class buttonForFrame8_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame8.dispose();
            interpretation.setText("");
            group6.clearSelection();
            frame6.setVisible(true);
        }
    }

    private class buttonForFrame8_3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame8.dispose();
            new Activity3();
        }
    }

    // ------------------------------------------------ ungrouped --------------------------------------------------- //

    private void convertTo2D() {
        int count = 0;
        length = ustringDataSet.length;
        row = (int) Math.ceil((float) length/10);
        uiDisplay = new int[row][column];
        ufDisplay = new float[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(intUngroupedData.length > count) {
                    if(dataType.equals("Integer")) {
                        uiDisplay[i][j] = intUngroupedData[count];
                    } else if(dataType.equals("Float")) {
                        ufDisplay[i][j] = floatUngroupedData[count];
                    }
                } else {
                    if(dataType.equals("Integer")) {
                        uiDisplay[i][j] = 0;
                    } else if(dataType.equals("Float")) {
                        ufDisplay[i][j] = (float) 0.0;
                    }
                }
                count++;
            }
        }
    }

    private void getAllValuesOfTable() {
        uinewValues = new int[length];
        ufnewValues = new float[length];
        int row = table.getRowCount();
        int column = table.getColumnCount();
        int count = 0;
        String temp = new String();

        try {
            for (int j = 0; j  < row; j++) {
                for (int i = 0; i  < column; i++) {
                    temp = String.valueOf(table.getValueAt(j, i));
                    if(dataType.equals("Integer")) {
                        uinewValues[count] = Integer.parseInt(temp);
                    } else if(dataType.equals("Float")) {
                        ufnewValues[count] = Float.parseFloat(temp);
                    }
                    count++;
                    if(count >= length) {
                        break;
                    }
                }
            }
        } catch(NumberFormatException g) {
            JOptionPane.showMessageDialog(frame5, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame5.setVisible(true);
            throw new NumberFormatException();
        }
    }

    private void mean() {
        uiTotal = 0;
        ufTotal = (float) 0.0;
        umean = 0.0;
        if(dataType.equals("Integer")) {
            for(int i = 0; i < uinewValues.length; i++) {
                uiTotal += uinewValues[i];
            }
            umean = (float) uiTotal/uinewValues.length;
        } else if(dataType.equals("Float")) {
            for(int i = 0; i < ufnewValues.length; i++) {
                ufTotal += ufnewValues[i];
            }
            umean = (float) ufTotal/ufnewValues.length;
        }
    }

    private void standardDeviation() {
        uiTotal = 0;
        ufTotal = (float) 0.0;
        if(dataType.equals("Integer")) {
            for(int i = 0; i < uinewValues.length; i++) {
                uiTotal += Math.pow((uinewValues[i] - umean), 2);
            }

            usdev = Math.sqrt(uiTotal / uinewValues.length - 1);
        } else if(dataType.equals("Float")) {
            for(int i = 0; i < ufnewValues.length; i++) {
                ufTotal += Math.pow((ufnewValues[i] - umean), 2);
            }

            usdev = Math.sqrt(ufTotal / ufnewValues.length - 1);
        }
    }

    private void variance() {
        uiTotal = 0;
        ufTotal = (float) 0.0;
        if(dataType.equals("Integer")) {
            for(int i = 0; i < uinewValues.length; i++) {
                uiTotal += Math.pow((uinewValues[i] - umean), 2);
            }
            uvar = (uiTotal / uinewValues.length - 1);
        } else if(dataType.equals("Float")) {
            for(int i = 0; i < ufnewValues.length; i++) {
                ufTotal += Math.pow((ufnewValues[i] - umean), 2);
            }
            uvar = (ufTotal / ufnewValues.length - 1);
        }
    }

    private void median() {
        Arrays.sort(uinewValues);
        Arrays.sort(ufnewValues);
        uimedian = 0;
        ufmedian = (float) 0.0;
        int medianIndex = 0;

        if(uinewValues.length % 2 != 0 || ufnewValues.length % 2 != 0) {
            if(dataType.equals("Integer")) {
                medianIndex = (uinewValues.length + 1) / 2;
            } else if(dataType.equals("Float")) {
                medianIndex = (ufnewValues.length + 1) / 2;
            }
        } else {
            if(dataType.equals("Integer")) {
                medianIndex = (uinewValues.length) / 2;
            } else if(dataType.equals("Float")) {
                medianIndex = (ufnewValues.length) / 2;
            }
        }

        if(dataType.equals("Integer")) {
            uimedian = uinewValues[medianIndex - 1];
        } else if(dataType.equals("Float")) {
            ufmedian = ufnewValues[medianIndex - 1];
        }
    }

    private void range() {
        uirange = 0;
        ufrange = (float) 0.0;
        if(dataType.equals("Integer")) {
            uirange = uinewValues[uinewValues.length - 1] - uinewValues[0];
        } else if(dataType.equals("Float")) {
            ufrange = ufnewValues[ufnewValues.length - 1] - ufnewValues[0];
        }
    }

    private void mode() {
        umodes = new ArrayList();
        double mode = 0.0;
        int max = 0;
        double value = 0.0;
        int count = 0;

        if(dataType.equals("Integer")) {
            for (int i = 0; i < uinewValues.length; i++) {
                value = uinewValues[i];
                count = 0;
                for (int j = 0; j < uinewValues.length; j++) {
                    if (uinewValues[j] == value) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
            for (int i = 0; i < uinewValues.length; i++) {
                value = uinewValues[i];
                count = 0;
                for (int j = 0; j < uinewValues.length; j++) {
                    if (uinewValues[j] == value) {
                        count++;
                    }
                }
                if (count == max) {
                    if(!(umodes.contains(uinewValues[i]))) {
                        umodes.add(uinewValues[i]);
                    }
                }
            }
        } else if(dataType.equals("Float")) {
            for (int i = 0; i < ufnewValues.length; i++) {
                value = ufnewValues[i];
                count = 0;
                for (int j = 0; j < ufnewValues.length; j++) {
                    if (ufnewValues[j] == value) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
            for (int i = 0; i < ufnewValues.length; i++) {
                value = ufnewValues[i];
                count = 0;
                for (int j = 0; j < ufnewValues.length; j++) {
                    if (ufnewValues[j] == value) {
                        count++;
                    }
                }
                if (count == max) {
                    if(!(umodes.contains(ufnewValues[i]))) {
                        umodes.add(ufnewValues[i]);
                    }
                }
            }
        }
    }

    // ------------------------------------------------- grouped ---------------------------------------------------- //

    private class buttonForFrame9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                totalIntervals = intervals.getText();
                totalInterval = Integer.parseInt(totalIntervals);
                //todo: 0 and negative numbers should not be accepted
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frame9, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                intervals.setText("");
                frame9.setVisible(true);
                throw new NumberFormatException();
                //menuList // TODO: 5/8/2017
            }finally{
                if(totalInterval <= 0) {
                    JOptionPane.showMessageDialog(frame9, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
                intervals.setText("");
                frame9.setVisible(true);
                //throw new NumberFormatException();
            }

            intervalChoice = group9.getSelection().getActionCommand();
            totalIntervals = intervals.getText();
            frame9.dispose();

            if(intervalChoice.equals("open-ended")) {
                frame10.setVisible(true);
            } else if(intervalChoice.equals("close-ended")) {
                frame11.setVisible(true);
            }
        }
    }

    private class buttonForFrame10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            groupedOpen = group10.getSelection().getActionCommand();

            if(groupedOpen.equals("First")) {
                model15.addRow(new Object[]{"≤", "", ""});
                for(int i = 0; i < totalInterval - 1; i++) {
                    model15.addRow(new Object[]{"", "", ""});
                }
            } else if(groupedOpen.equals("Last")) {
                for(int i = 0; i < totalInterval - 1; i++) {
                    model15.addRow(new Object[]{"", "", ""});
                }
                model15.addRow(new Object[]{"", "≥", ""});
            } else if(groupedOpen.equals("Both")) {
                model15.addRow(new Object[]{"≤", "", ""});
                for(int i = 0; i < totalInterval - 2; i++) {
                    model15.addRow(new Object[]{"", "", ""});
                }
                model15.addRow(new Object[]{"", "≥", ""});
            }

            // center align all elements in the table
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            for(int x = 0; x < 3; x++){
                table15.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
            }

            JOptionPane.showMessageDialog(frame10, "Enter the class limits and the corresponding frequencies for the middle class " +
                    "intervals according to the following column order: lower class limit, upper class limit, and " +
                    "frequency, for each class interval");

            frame10.dispose();
            frame15.setVisible(true);
        }
    }

    private class ButtonForFrame11 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame11.dispose();
            for(int i = 0; i < totalInterval; i++) {
                model12.addRow(new Object[]{"", "", ""});
            }
            frame12.setVisible(true);
        }
    }

    private class ButtonForFrame12_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame12.dispose();
            getLowerLimit();
            getUpperLimit();
            getFrequencyOfGrouped2();
            classMark();
            fixi();
            fixi2();
            frame13.setVisible(true);
        }
    }

    private class ButtonForFrame12_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame12, "Double click a cell to edit. " +
                    "The changes will automatically be stored. Press continue if you're done editing.");
        }
    }

    private class ButtonForFrame13_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame13.dispose();
            frame6.setVisible(true);
        }
    }

    private class buttonForFrame15_1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getFrequencyOfGrouped();
            frame15.dispose();
            frame6.setVisible(true);
        }
    }

    private class buttonForFrame15_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame15, "Double click a cell to edit. " +
                    "The changes will automatically be stored. Press continue if you're done editing.");
        }
    }

    private void getLowerLimit() {
        newLowerLim = new String[totalInterval];
        int row = table12.getRowCount();
        int count = 0;
        String temp = new String();

        try {
            if(dataType.equals("Integer")) {
                lowerLimitInt = new int[totalInterval];
                for (int j = 0, k = 0; j < row; j++) {
                    temp = String.valueOf(table12.getValueAt(j, k));
                    lowerLimitInt[count] = Integer.parseInt(temp);
                    count++;

                    if (count >= totalInterval) {
                        break;
                    }
                }
                for(int i = 0; i < lowerLimitInt.length; i++) {
                    newLowerLim[i] = String.valueOf(lowerLimitInt[i]);
                }

                model13.addColumn("Lower Class Limit", newLowerLim);
            }
            else if(dataType.equals("Float")){
                lowerLimitFloat = new float[totalInterval];
                for (int j = 0, k = 0; j  < row; j++) {
                    temp = String.valueOf(table12.getValueAt(j, k));
                    lowerLimitFloat[count] = Float.parseFloat(temp);
                    count++;
                    if(count >= totalInterval) {
                        break;
                    }
                }
                for(int i = 0; i < lowerLimitFloat.length; i++) {
                    newLowerLim[i] = String.valueOf(lowerLimitFloat[i]);
                }

                model13.addColumn("Upper Class Limit ", newLowerLim);
            }

        } catch(NumberFormatException g) {
            JOptionPane.showMessageDialog(frame12, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame12.dispose();
            //System.exit(0);
            frame12.setVisible(true);
            throw new NumberFormatException();
        }

    }

    private void getUpperLimit() {
        newUpperLim = new String[totalInterval];
        int row = table12.getRowCount();
        int count = 0;
        String temp = new String();

        try {
            if(dataType.equals("Integer")) {
                upperLimitInt = new int[totalInterval];
                for (int j = 0, k = 1; j < row; j++) {
                    temp = String.valueOf(table12.getValueAt(j, k));
                    upperLimitInt[count] = Integer.parseInt(temp);
                    count++;

                    if (count >= totalInterval) {
                        break;
                    }
                }
                for(int i = 0; i < upperLimitInt.length; i++) {
                    newUpperLim[i] = String.valueOf(upperLimitInt[i]);
                }

                model13.addColumn("Upper Class Limit ", newUpperLim);
            }
            else if(dataType.equals("Float")){
                upperLimitFloat = new float[totalInterval];
                for (int j = 0, k = 1; j  < row; j++) {
                    temp = String.valueOf(table12.getValueAt(j, k));
                    upperLimitFloat[count] = Float.parseFloat(temp);
                    count++;
                    if(count >= totalInterval) {
                        break;
                    }
                }
                for(int i = 0; i < upperLimitFloat.length; i++) {
                    newUpperLim[i] = String.valueOf(upperLimitFloat[i]);
                }

                model13.addColumn("Upper Class Limit ", newUpperLim);
            }
        } catch(NumberFormatException g) {
            JOptionPane.showMessageDialog(frame12, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame12.setVisible(true);
            //System.exit(0);
            throw new NumberFormatException();
        }
    }

    private void getFrequencyOfGrouped2() {
        totalFreq = 0;
        stringTotalFreq = new String();
        frequency = new int[totalInterval];
        newFreq = new String[totalInterval];
        int row = table12.getRowCount();
        int count = 0;
        String temp = new String();

        try {
            for (int j = 0, k = 2; j  < row; j++) {
                temp = String.valueOf(table12.getValueAt(j, k));
                frequency[count] = Integer.parseInt(temp);
                count++;
                if(count >= totalInterval) {
                    break;
                }

            }

        } catch(NumberFormatException g) {
            JOptionPane.showMessageDialog(frame12, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame12.setVisible(true);
            throw new NumberFormatException();
        }

        for(int i = 0; i < frequency.length; i++) {
            newFreq[i] = String.valueOf(frequency[i]);
        }

        model13.addColumn("Frequency ", newFreq);

        for(int i = 0; i < totalInterval; i++){
            totalFreq += frequency[i];
        }
        stringTotalFreq = String.valueOf(totalFreq);
    }

    private void classMark() {
        classMark = new double[totalInterval];
        stringClass = new String[totalInterval];
        if (dataType.equals("Integer")) {
            for (int i = 0; i < lowerLimitInt.length; i++) {
                classMark[i] = (double) (lowerLimitInt[i] + upperLimitInt[i]) / 2;
            }
        } else if (dataType.equals("Float")) {
            for (int i = 0; i < lowerLimitFloat.length; i++) {
                classMark[i] = (double)(lowerLimitFloat[i] + upperLimitFloat[i]) / 2;
            }
        }

        for(int i = 0; i < classMark.length; i++) {
            stringClass[i] = String.valueOf(classMark[i]);
        }

        model13.addColumn("Class Mark(xi) ", stringClass);
    }

    private void fixi() {
        totalFixi = 0;
        stringTotalFixi = new String();
        fixi = new double[totalInterval];
        stringFixi = new String[totalInterval];

        for(int i = 0; i < totalInterval; i++) {
            fixi[i] = (double) frequency[i] * classMark[i];
            stringFixi[i] = String.valueOf(fixi[i]);
        }

        model13.addColumn("fixi", stringFixi);

        for(int i = 0; i < totalInterval; i++){
            totalFixi += fixi[i];
        }
        stringTotalFixi = String.valueOf(totalFixi);

    }

    private void fixi2() {
        totalFixi2 = 0;
        stringTotalFixi2 = new String();
        fixi2 = new double[totalInterval];
        stringFixi2 = new String[totalInterval];

        for(int i = 0; i < totalInterval; i++) {
            fixi2[i] = (double) frequency[i] * (classMark[i] * classMark[i]);
            stringFixi2[i] = String.valueOf(fixi2[i]);
        }
        model13.addColumn("fi(xi)^2", stringFixi2);

        for(int i = 0; i < totalInterval; i++){
            totalFixi2 += fixi2[i];
        }
        stringTotalFixi2 = String.valueOf(totalFixi2);

        model13.addRow(new Object[]{"TOTAL:", "", stringTotalFreq, "", stringTotalFixi, stringTotalFixi2});
    }

    private void getFrequencyOfGrouped() {
        frequency = new int[totalInterval];
        int row = table15.getRowCount();
        int count = 0;
        String temp = new String();

        try {
            for (int j = 0, k = 2; j  < row; j++) {
                temp = String.valueOf(table15.getValueAt(j, k));
                frequency[count] = Integer.parseInt(temp);
                if(frequency[count] < 0) {
                    JOptionPane.showMessageDialog(frame15, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
                    frame15.setVisible(true);
                    throw new NumberFormatException();
                }
                count++;
                if(count >= totalInterval) {
                    break;
                }

            }
        } catch(NumberFormatException g) {
            JOptionPane.showMessageDialog(frame15, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame15.setVisible(true);
            throw new NumberFormatException();
        }
    }

    private void modeOfGrouped() {
        int max = 0;
        counter = 0;
        openModeGrouped = new String();
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] > max) {
                max = frequency[i];
            }
        }

        for(int i = 0; i < frequency.length; i++) {
            if(max == frequency[i]) {
                counter++;
            }
        }

        if(counter == 1) {
            openModeGrouped = "unimodal";
        } else if (counter == 2) {
            openModeGrouped = "bimodal";
        } else if(counter >= 3) {
            openModeGrouped = "multimodal";
        } else if(counter == 0) {
            openModeGrouped = "no mode";
        }
    }

    private void MeanOfGrouped() {
        grpMean = 0.0;
        stringGrpMean = new String();

        grpMean = totalFixi / totalFreq;
        stringGrpMean = String.valueOf(grpMean);
    }

    private void groupedVarAndStandardDev(){
        var = 0.0;
        sDev = 0.0;
        stringVar = new String();
        stringSDev = new String();

        var = (totalFixi2 - (Math.pow(totalFixi,2) / totalFreq)) / totalFreq;
        sDev = Math.sqrt(var);

        stringVar = String.valueOf(var);
        stringSDev = String.valueOf(sDev);

    }

    private void ModeOfGrouped(){
        int max = 0;
        modeCtr = 0;
        fin = new String();
        ArrayList<Integer> modalClass = new ArrayList<Integer>();
        //stringModalClass = new String[modeCtr];
        //ArrayList<Integer> count = new ArrayList<Integer>();
        stringMode = new String();
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] > max) {
                max = frequency[i];
            }
        }

        for(int i = 0; i < frequency.length; i++) {
            if(max == frequency[i]) {
                modeCtr++;
                modalClass.add(i);
            }
        }

        if(modeCtr == 1) {
            stringMode = "unimodal";
        } else if (modeCtr == 2) {
            stringMode = "bimodal";
        } else if(modeCtr >= 3) {
            stringMode = "multimodal";
        } else if(modeCtr == 0) {
            stringMode = "no mode";
        }

    }

    private void displayModalClass(){
        ArrayList<String> stringModalClass = new ArrayList<String>();
        int lower = 0;
        int upper = 0;
        double low = 0.0;
        double up = 0.0;
        strLower = "";
        strUpper = "";

        for(int i = 0; i < modalClass.size(); i++){

            if(dataType.equals("Integer")){
                lower = lowerLimitInt[modalClass.get(i)];
                upper = upperLimitInt[modalClass.get(i)];

                strLower = String.valueOf(lower);
                strUpper = String.valueOf(upper);
                stringModalClass.add(strLower);
                stringModalClass.add(strUpper);
            }
            else if( dataType.equals("Float")){
                low = lowerLimitFloat[modalClass.get(i)];
                up = upperLimitFloat[modalClass.get(i)];

                strLower = String.valueOf(lower);
                strUpper = String.valueOf(upper);
                stringModalClass.add(strLower);
                stringModalClass.add(strUpper);
            }
        }

//        for(int i = 0; i < modeCtr; i++){
//            frame6.add(strLower + "-" + strUpper);}
    }
}