package org.example;

import org.example.controller.CalculatorController;
import org.example.model.CalculatorModel;
import org.example.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}