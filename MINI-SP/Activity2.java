import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Allyssa Albores, Chezkah Tahadlangit on 28/03/2017.
 */

public class Activity2 extends JFrame{
    // frame 1 variables
    JFrame frame1 = new JFrame("Summarizing and Presenting Data");
    JPanel panel1 = new JPanel();
    GroupLayout layout = new GroupLayout(panel1);
    JLabel label = new JLabel("Choose your desired type of data: ");
    ButtonGroup group = new ButtonGroup();
    JRadioButton numerical = new JRadioButton("Numerical");
    JRadioButton categorical = new JRadioButton("Categorical");
    JRadioButton goBack = new JRadioButton("Main Menu");
    JButton enter = new JButton("Enter");

    // frame 2 variables
    JFrame frame2 = new JFrame("Summarizing and Presenting Data");
    JLabel label2 = new JLabel("Input a brief title for your data: ");
    JTextField title = new JTextField("", 25);
    JButton enter2 = new JButton("Enter");

    // frame new variables (to input how many inputs will be entered)
    JFrame frameN = new JFrame("Summarizing and Presenting Data");
    JLabel labelN = new JLabel("Input the number of inputs: ");
    JTextField titleN = new JTextField("", 25);
    JButton enterN = new JButton("Enter");
    String textN;
    int textN2;
    boolean bool = true;

    // frame 3 variables
    String[] columns3 = new String[] {"⊶", "⊶", "⊶",
            "⊶", "⊶", "⊶", "⊶", "⊶", "⊶", "⊶"};
    Object[][] data3 = new Object[][] {};
    JFrame frame3 = new JFrame("Summarizing and Presenting Data");
    JPanel panel3 = new JPanel();
    DefaultTableModel model3 = new DefaultTableModel(data3, columns3);
    JTable table3 = new JTable(model3);
    JScrollPane pane3 = new JScrollPane(table3);
    JButton enter3_1 = new JButton("Continue");
    JButton enter3_2 = new JButton("Edit");
    ArrayList<Double> numericalList = new ArrayList<Double>();
    ArrayList<String> categoricalList = new ArrayList<String>();
    String cell;

    String choice;
    String[] labels;
    double[] mid;
    String text;
    String percentage;
    String[] percents;
    String[] cPercents;
    String[] CL;
    String[] TCL;
    String[] midpoint;
    String[] freq;
    String[] CF;
    Integer[] percent;

    ArrayList<String> valueLabels = new ArrayList<String>();
    ArrayList<Integer> frequency = new ArrayList<Integer>();
    Double[] forPieChart;
    ArrayList<Double> lowerClassLimits = new ArrayList<Double>();
    ArrayList<Double> upperClassLimits = new ArrayList<Double>();
    DecimalFormat df = new DecimalFormat("#.##");

    int size;
    Double[] CL1;                // original lower class limit
    Double[] CL2;                // original upper class limit
    String[] decCL1;             // lower class limit with two decimal places
    String[] decCL2;             // upper class limit with two decimal places
    Double[] TCL1;               // lower true class limit
    Double[] TCL2;               // upper true class limit

    String[] columns = new String[] {};
    Object[][] data = new Object[][] {};
    DefaultTableModel model = new DefaultTableModel(data, columns);
    JTable table = new JTable(model);
    JScrollPane pane = new JScrollPane(table);
    JPanel panel = new JPanel();
    JFrame frame4 = new JFrame();
    JButton enter4 = new JButton("GENERATE GRAPH/CHART");
    JButton enter5 = new JButton("RETURN TO MENU");
    JButton collapse = new JButton("COLLAPSE");

    public Activity2() {
        components();
    }

    private void components() {
        // ----------------------------------------------- FRAME 1 -------------------------------------------------- //
        panel1.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        group.add(numerical);
        group.add(categorical);
        group.add(goBack);

        // start -- to place and arrange the components in frame
        GroupLayout.SequentialGroup left = layout.createSequentialGroup();
        left.addComponent(label);
        GroupLayout.ParallelGroup radioButtons = layout.createParallelGroup();
        radioButtons.addComponent(numerical);
        radioButtons.addComponent(categorical);
        radioButtons.addComponent(goBack);
        radioButtons.addComponent(enter);
        enter.addActionListener(new enterButton());
        left.addGroup(radioButtons);

        GroupLayout.SequentialGroup topToBottom = layout.createSequentialGroup();
        GroupLayout.ParallelGroup rowTop = layout.createParallelGroup();
        rowTop.addComponent(label);
        rowTop.addComponent(numerical);
        topToBottom.addGroup(rowTop);
        topToBottom.addComponent(categorical);
        topToBottom.addComponent(goBack);
        topToBottom.addComponent(enter);

        layout.setHorizontalGroup(left);
        layout.setVerticalGroup(topToBottom);
        // end

        numerical.addActionListener(sliceActionListener);
        categorical.addActionListener(sliceActionListener);
        goBack.addActionListener(sliceActionListener);

        frame1.add(panel1);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

        // ----------------------------------------------- FRAME 2 -------------------------------------------------- //
        frame2.setSize(600, 80);
        frame2.add(label2);
        frame2.add(title);
        frame2.add(enter2);
        frame2.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);
        enter2.addActionListener(new enter2Button());

        // ----------------------------------------------- FRAME N -------------------------------------------------- //
        frameN.setSize(400, 110);
        frameN.add(labelN);
        frameN.add(titleN);
        frameN.add(enterN);
        frameN.setLayout(new FlowLayout(FlowLayout.CENTER));
        frameN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameN.setLocationRelativeTo(null);
        enterN.addActionListener(new buttonForFrameN());

        // ----------------------------------------------- FRAME 3 -------------------------------------------------- //
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
    }

    ActionListener sliceActionListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            AbstractButton rButton = (AbstractButton) actionEvent.getSource();
            choice = rButton.getText();
        }
    };

    private class enterButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(choice == null) {
                try {
                    JOptionPane.showMessageDialog(frame1, "Choose one.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    frame1.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frame1.dispose();
                if(choice.equals("Main Menu")) {
                    new MainMenu();
                } else {
                    frame2.setVisible(true);
                }
            }
        }
    }

    private class enter2Button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text = title.getText(); // no need to catch errors
            frame2.dispose();
            frameN.setVisible(true);
        }
    }

    private class buttonForFrameN implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textN = titleN.getText();

            try {
                textN2 = Integer.parseInt(textN);
            } catch(NumberFormatException ef) {
                JOptionPane.showMessageDialog(frameN, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                titleN.setText("");
                frameN.setVisible(true);
                throw new NumberFormatException();
            }

            if(textN2 > 1000 || textN2 <= 0) {
                try {
                    if(textN2 > 1000) {
                        JOptionPane.showMessageDialog(frameN, "Maximum number of inputs reached.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frameN, "Invalid Input.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    titleN.setText("");
                    frameN.setVisible(true);
                    throw new Exception("Invalid input.");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                frameN.dispose();
                int temp = (int) Math.ceil((float) textN2/10);
                int temp2 = textN2 % 10;
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
                JOptionPane.showMessageDialog(frame3, "Input the 'inputs' in the table.\n" +
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


            if(bool == true) {
                try {
                    for (int j = 0; j < row; j++) {
                        for (int i = 0; i < column; i++) {
                            cell = String.valueOf(table3.getValueAt(j, i));
                            if (choice.equals("Numerical")) {
                                numericalList.add(Double.valueOf(cell));
                            } else if (choice.equals("Categorical")) {
                                categoricalList.add(cell);
                            }
                            count++;
                            if (count >= textN2) {
                                break;
                            }
                        }
                    }

                } catch(NumberFormatException ef) {
                    JOptionPane.showMessageDialog(frame3, "Invalid inputs.", "Error", JOptionPane.ERROR_MESSAGE);
                    frame3.setVisible(true);
                    throw new NumberFormatException();
                }

                frame3.dispose();
                frame3.setTitle(text);
                frame3.setVisible(true);
                bool = false;
            } else {
                frame4.setTitle(text);
                if(choice.equals("Numerical")) {
                    panel.add(pane);
                    frame4.getContentPane().add(pane, BorderLayout.CENTER);
                    // --------------------------------- FREQUENCY DISTRIBUTION TABLE --------------------------------//

                    classLimit(numericalList, numericalList.size());
                    trueClassLimit();
                    midpoint();
                    numericalFrequency(numericalList, numericalList.size());
                    cumulativeFrequency();
                    frame4.add(collapse);

                } else if (choice.equals("Categorical")) {
                    panel.add(pane);
                    frame4.getContentPane().add(pane, BorderLayout.CENTER);

                    // ----------------------------------------- SUMMARY TABLE ---------------------------------------//
                    countFrequency(categoricalList);

                    labels = valueLabels.toArray(new String[valueLabels.size()]);
                    Integer[] freqt = frequency.toArray(new Integer[frequency.size()]);

                    percents = new String[freqt.length];
                    forPieChart = new Double[freqt.length];
                    int sum = 0;
                    String sump = "";
                    for (int i = 0; i < freqt.length; i++) {
                        double num = ((double) freqt[i] / categoricalList.size()) * 100;
                        forPieChart[i] = num;
                        num = Math.floor(num * 100) / 100;
                        sum += num;
                        percentage = String.valueOf(num);
                        percents[i] = percentage;
                        percents[i] = percents[i] + "%";
                    }

                    sum = (int) Math.ceil(sum);
                    sump = df.format(sum);
                    sump += "%";

                    model.addColumn("VALUE LABELS", labels);
                    model.addColumn("PERCENTAGE", percents);
                    model.addRow(new Object[]{"", "Total: " + sump});

                    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
                    rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                    table.getColumn("VALUE LABELS").setCellRenderer( rightRenderer );

                    DefaultTableCellRenderer rightRenderer2 = new DefaultTableCellRenderer();
                    rightRenderer2.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
                    table.getColumn("PERCENTAGE").setCellRenderer( rightRenderer2 );
                }

                table.setPreferredScrollableViewportSize(table.getPreferredSize());
                table.setFillsViewportHeight(true);
                frame4.add(enter4);
                frame4.add(enter5);
                frame4.setLayout(new FlowLayout());
                enter4.addActionListener(new enter4Button());
                enter5.addActionListener(new enter5Button());
                collapse.addActionListener(new collapseButton());
                frame4.pack();
                frame4.setLocationRelativeTo(null);
                frame3.dispose();
                frame4.setVisible(true);
            }

        }
    }

    private class buttonForFrame3_2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame3, "Just double click the cell!");
        }
    }

    private class enter4Button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(choice.equals("Numerical")) {
                DefaultCategoryDataset chart = new DefaultCategoryDataset();

                int i = 0;
                for(Integer a : percent) {
                    chart.setValue(a,"Frequency", midpoint[i]);
                    i++;
                }

                JFreeChart mychart = ChartFactory.createBarChart(text + " ","Midpoint", "Frequency", chart, PlotOrientation.VERTICAL,true,false,false);
                CategoryPlot p = (CategoryPlot) mychart.getPlot();
                p.setDomainGridlinesVisible(true);
                p.getDomainAxis().setCategoryMargin(0.0);
                ChartFrame frame = new ChartFrame(text, mychart);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setSize(500,500);

            } else if(choice.equals("Categorical")) {
                DefaultPieDataset chart = new DefaultPieDataset();
                for(int i = 0; i < forPieChart.length; i++) {
                    chart.setValue(labels[i], new Double(forPieChart[i]));
                }

                JFreeChart mychart = ChartFactory.createPieChart3D(text, chart, true,true,true);
                ChartFrame frame = new ChartFrame(text, mychart);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setSize(500,500);
            }
        }
    }

    private class enter5Button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame4.dispose();
            new Activity2();
        }
    }

    private class collapseButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            decCL1[0] = "below ";
            decCL2[decCL2.length - 1] = " above";
            String temp = decCL1[0] + " - " + decCL2[0];
            String temp2 = decCL1[decCL2.length - 1] + " - " + decCL2[decCL2.length - 1];

            table.getModel().setValueAt(temp, 0, 0);
            table.getModel().setValueAt(temp2, CL1.length - 1, 0);

            for(int i = 0; i < TCL1.length; i++) {
                table.getModel().setValueAt("---", i, 2);
            }

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            table.getColumn("MID").setCellRenderer( rightRenderer );

        }
    }

    private void countFrequency(ArrayList<String> inputs) {
        try{
            Map frequencyMap = new TreeMap<String, Integer>();
            for (String string : inputs) {
                if(frequencyMap.containsKey(string)) {
                    Integer count = (Integer)frequencyMap.get(string);
                    frequencyMap.put(string, count + 1);
                } else {
                    frequencyMap.put(string, 1);
                }
            }

            Set<Map.Entry<String, Integer>> elements= frequencyMap.entrySet();

            for (Map.Entry<String, Integer> entry : elements) {
                valueLabels.add(entry.getKey());
                frequency.add(entry.getValue());
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame2, "Invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
            frame2.dispose();
        }
    }

    private void classLimit(ArrayList<Double> input, int sizeOfInput) {
        try {
            Collections.sort(input);

            double min = input.get(0);
            double max = input.get(sizeOfInput - 1);

            double range = max - min;
            int k = (int) Math.ceil(1 + 3.322 * (Math.log10(sizeOfInput))); // Sturge's Rule
            int classWidth = (int) Math.ceil(range/k);

            double lowerClass = min;
            double upperClass = 0.0;

            for(int j = 0; j < k; j++) {
                lowerClassLimits.add(lowerClass);
                upperClass = lowerClass + (classWidth - 1);
                upperClassLimits.add(upperClass);
                upperClass++;
                lowerClass = upperClass;
            }

            CL1 = lowerClassLimits.toArray(new Double[lowerClassLimits.size()]);
            CL2 = upperClassLimits.toArray(new Double[upperClassLimits.size()]);
            String lower, upper;

            CL = new String[CL1.length];
            decCL1 = new String[CL1.length];
            decCL2 = new String[CL1.length];
            for(int j = 0; j < CL1.length; j++) {
                lower = df.format(CL1[j]);
                upper = df.format(CL2[j]);
                decCL1[j] = lower;
                decCL2[j] = upper;
                String temp = lower + " - " + upper;
                CL[j] = temp;
            }

            model.addColumn("CL", CL);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame4, "Invalid inputs.", "Error", JOptionPane.ERROR_MESSAGE);
            frame3.dispose();
            frame4.dispose();
            new Menu();
        }
    }

    private void trueClassLimit() {
        TCL1 = new Double[lowerClassLimits.size()];
        TCL2 = new Double[upperClassLimits.size()];

        for(int i = 0; i < TCL1.length; i++) {
            TCL1[i] = Double.parseDouble(decCL1[i]);
            //TCL1[i] -= sub;
            TCL2[i] = Double.parseDouble(decCL2[i]);
            //TCL2[i] += sub;

            if(TCL1[i] == Math.ceil(TCL1[i])) {
                TCL1[i] -= 0.5;
                TCL2[i] += 0.5;
            } else {
                TCL1[i] = Math.round(TCL1[i] * 100.0) / 100.0;
                TCL2[i] = Math.round(TCL2[i] * 100.0) / 100.0;
                BigDecimal a = new BigDecimal(TCL1[i]);

                if(a.scale() == 2) {
                    TCL1[i] -= 0.005;
                    TCL2[i] += 0.005;
                } else if(a.scale() == 1) {
                    TCL1[i] -= 0.05;
                    TCL2[i] += 0.05;
                }
            }
        }

        String lower, upper;
        TCL = new String[TCL1.length];
        for(int j = 0; j < TCL1.length; j++) {
            lower = Double.toString(TCL1[j]);
            upper = Double.toString(TCL2[j]);
            String temp = lower + " - " + upper;
            TCL[j] = temp;
        }

        model.addColumn("TCL", TCL);
    }

    private void midpoint() {
        mid = new double[TCL1.length];
        midpoint = new String[TCL1.length];

        for(int j = 0; j < TCL1.length; j++) {
            mid[j] = (TCL1[j] + TCL2[j]) / 2;
            midpoint[j] = df.format(mid[j]);
        }
        model.addColumn("MID", midpoint);
    }

    private void numericalFrequency(ArrayList<Double> inputs, int sizeOfInput) {
        int count = 0;
        freq = new String[CL1.length];
        percent = new Integer[CL1.length];
        String[] percents = new String[freq.length];
        String per;
        int sum = 0;
        String sump = "";
        int sum2 = 0;
        String sump2 = "";
        size = CL1.length;

        // -----------------------------------------------------------------------------------------------------------//
        for(int j = 0; j < CL1.length; j++) {
            for(int k = 0; k < sizeOfInput; k++) {
                //System.out.println(k);
                if(inputs.get(k) >= TCL1[j] && inputs.get(k) <= TCL2[j]) {
                    //System.out.println(inputs.get(k));
                    count++;
                }
            }
            freq[j] = String.valueOf(count);
            sum += count;
            percent[j] = count;
            count = 0;
        }

        sum = (int) Math.ceil(sum);
        sump = df.format(sum);

        model.addColumn("FREQ", freq);
        // -----------------------------------------------------------------------------------------------------------//

        for(int j = 0; j < CL1.length; j++) {
            double num = (double) percent[j] / sizeOfInput * 100;
            sum2 += num;
            num = Math.floor(num * 100) / 100;

            per = String.valueOf(num);
            percents[j] = per;
            percents[j] = percents[j] + "%";
        }

        sump2 = df.format(sum2);
        sump2 += "%";

        model.addColumn("%", percents);
        model.addRow(new Object[]{"", "", "", "Total: " + sump, "", "", ""});
    }

    private void cumulativeFrequency() {
        CF = new String[size];
        double[] cumFreq = new double[size];
        cPercents = new String[size];
        int temp = 0;

        for(int i = 0; i < size; i++) {
            temp = temp + (int) percent[i];
            cumFreq[i] = temp;
            CF[i] = df.format(cumFreq[i]);
        }

        model.addColumn("CF", CF);

        String per;
        for(int j = 0; j < size; j++) {
            double num = (cumFreq[j] / numericalList.size()) * 100;
            per = df.format(num);
            cPercents[j] = per;
            cPercents[j] = cPercents[j] + "%";
        }

        model.addColumn("C%", cPercents);
    }
}