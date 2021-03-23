package by.semashko.controller;

import by.semashko.model.DailyPortion;
import by.semashko.model.Dog;
import by.semashko.model.Product;
import by.semashko.util.Calculator;
import by.semashko.view.Frame;
import by.semashko.view.MenuTableModel;

import javax.swing.*;

public class Controller {

    private Dog dog;
    private Frame frame;
    private DailyPortion dailyPortion = new DailyPortion();
    private MenuTableModel menuTableModel = new MenuTableModel();

    public Controller(Dog dog, Frame frame) {
        this.dog = dog;
        this.frame = frame;
        initView();
    }
    private void initView() {
        frame.getWeightDog().setText(dog.getWeight().toString());
        frame.getPercentWeightDog().setText(dog.getPercentWeight().toString());
        frame.getTable().setModel(menuTableModel);
    }
    public void initController() {
        frame.getButtonCalculatePortion().addActionListener(clickEvent -> showPortion());
    }

    private void showPortion() {
        save();
        try {
            initColumnWeightProduct();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Неверный ввод");
        }
    }

    private void initColumnWeightProduct() {
        for (Product product : menuTableModel.getMenu().getProducts()) {
            double percent = product.getPercent();
            product.setWeight(Calculator.calculateWeightProduct(percent, initDailyPortion()));
            menuTableModel.setValueAt(product, 1, 1);
        }
    }

    private DailyPortion initDailyPortion() {
        dailyPortion.setWeight(Calculator.calculate(dog));
        return dailyPortion;
    }

    private void save() {
        try {
            dog.setWeight(Double.parseDouble(frame.getWeightDog().getText()));
            dog.setPercentWeight(Double.parseDouble(frame.getPercentWeightDog().getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Неверный ввод");
        }
    }
}
