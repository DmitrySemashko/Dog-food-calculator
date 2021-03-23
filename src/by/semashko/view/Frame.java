package by.semashko.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 300;
    private static final int TEXT_FIELD_SIZE = 30;

    private static final String WEIGHT_DOG_LABEL_TEXT = "Вес собаки:";
    private static final String PERCENT_LABEL_TEXT = "Процент от веса:";
    private static final String CALCULATE_BUTTON_TEXT = "Рассчитать";

    private JTextField weightDog;
    private JTextField percentWeightDog;
    private JButton buttonCalculatePortion;
    private JScrollPane scrollPane ;
    private JTable table ;

    public Frame() {
        super("Калькулятор");

        initView();
    }

    private void initView() {
        add(initPanel());

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel initPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        JLabel weightDogLabel = new JLabel(WEIGHT_DOG_LABEL_TEXT);
        weightDog = new JTextField(TEXT_FIELD_SIZE);
        JLabel percentDogLabel = new JLabel(PERCENT_LABEL_TEXT);
        percentWeightDog = new JTextField(TEXT_FIELD_SIZE);
        buttonCalculatePortion = new JButton(CALCULATE_BUTTON_TEXT);
        table = new JTable();
        table.setPreferredScrollableViewportSize(new Dimension(400,80));
        table.setFillsViewportHeight(false);
        scrollPane = new JScrollPane(table);

        jPanel.add(weightDogLabel);
        jPanel.add(weightDog);
        jPanel.add(percentDogLabel);
        jPanel.add(percentWeightDog);
        jPanel.add(buttonCalculatePortion);
        jPanel.add(scrollPane);

        return jPanel;

    }

    public static int getFrameWidth() {
        return FRAME_WIDTH;
    }

    public static int getFrameHeight() {
        return FRAME_HEIGHT;
    }

    public static int getTextFieldSize() {
        return TEXT_FIELD_SIZE;
    }

    public static String getWeightDogLabelText() {
        return WEIGHT_DOG_LABEL_TEXT;
    }

    public static String getPercentLabelText() {
        return PERCENT_LABEL_TEXT;
    }

    public static String getCalculateButtonText() {
        return CALCULATE_BUTTON_TEXT;
    }

    public JTextField getWeightDog() {
        return weightDog;
    }

    public void setWeightDog(JTextField weightDog) {
        this.weightDog = weightDog;
    }

    public JTextField getPercentWeightDog() {
        return percentWeightDog;
    }

    public void setPercentWeightDog(JTextField percentWeightDog) {
        this.percentWeightDog = percentWeightDog;
    }

    public JButton getButtonCalculatePortion() {
        return buttonCalculatePortion;
    }

    public void setButtonCalculatePortion(JButton buttonCalculatePortion) {
        this.buttonCalculatePortion = buttonCalculatePortion;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
