package org.example.view;

import org.example.presenter.Presenter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

// TODO: Integer.parseInt createHero()-hoz
// Stringből más típust: parse... fordítva másból Stringbe: String.valueOf()
// Avengers MVP struktúra: jegyzet


public class Window extends JFrame implements View {
    private Presenter presenter;

    private JTextField heroField;
    private JTextField powerField;
    private JButton generateButton;
    private JButton saveButton;
    private JTextArea heroView;

    private void initConstructWindow() {
        heroField = new JTextField(6);
        powerField = new JTextField(3);
        heroView = new JTextArea(5,30);
        generateButton = new JButton("Generate");
        saveButton = new JButton("Save list");
        generateButton.addActionListener(e -> presenter.createHero(heroField.getText(), powerField.getText()));
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
        this.add(jPanel, BorderLayout.CENTER);
        this.add(heroView, BorderLayout.SOUTH);
        this.pack();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateView(String heroes) {
        heroView.setText(heroes);
    }

    @Override
    public void start() {
        this.initConstructWindow();
        this.setSize(800, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Hero generator");
    }
}