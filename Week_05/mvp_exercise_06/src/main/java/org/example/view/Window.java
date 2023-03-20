package org.example.view;

import org.example.presenter.Presenter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Window extends JFrame implements View {
   private Presenter presenter;

    private JTextField heroField;
    private JTextField powerField;
    private JButton generateButton;
    private JButton saveButton;

    public Window() {
        this.initConstructWindow();
        this.setSize(800, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Hero generator");
    }

    private void initConstructWindow() {
        heroField = new JTextField(6);
        powerField = new JTextField(3);
        generateButton = new JButton("Generate");
        saveButton = new JButton("Save list");
        generateButton.addActionListener(e -> presenter.createHero(heroField.getText(), powerField.getText()));
    //    JTable table = new JTable(presenter.getHeroesSize(), 2);
    //    powerField hogy lehet text helyett szám?

    //    saveButton.addActionListener(e -> presenter.saveHeroes());
        JPanel jPanel = new JPanel();
        JLabel jLabelName = new JLabel("Hero name: ");
        jPanel.add(jLabelName);
        jPanel.add(heroField);
        JLabel jLabelPower = new JLabel("Hero power (1-10): ");
        jPanel.add(jLabelPower);
        jPanel.add(powerField);
        jPanel.add(generateButton);
        jPanel.add(saveButton);
    //    jPanel.add(table);
        this.add(jPanel, BorderLayout.CENTER);
        this.pack();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}