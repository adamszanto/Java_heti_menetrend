package org.example.view;

import org.example.presenter.Presenter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window extends JFrame implements View {
    private Presenter presenter;
    private JTextField input;
    private JButton button;
    public Window() {
        this.initConstructWindow();
        this.setSize(600, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initConstructWindow() {
        input = new JTextField(20);
        button = new JButton("Submit");
        button.addActionListener(e -> presenter.updateValue(input.getText()));
        JPanel jPanel = new JPanel();
        jPanel.add(input);
        jPanel.add(button);
        this.add(jPanel, BorderLayout.CENTER);
        this.pack();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateValue(String value) {
        input.setText(value);
    }
}
