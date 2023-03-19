package org.example.view;

import org.example.presenter.Presenter;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements View {

    private Presenter presenter;

    private JTextField heroField;
    private JTextField powerField;
    private JButton generateButton;
    private JButton saveButton;

    public Window() {
        this.initConstructWindow();
        this.setSize(800,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Hero generator");
    }

    private void initConstructWindow() {
        heroField = new JTextField(6);
        powerField = new JTextField(3);
        generateButton = new JButton("Generate");
        saveButton = new JButton("Save list");
        generateButton.addActionListener(e -> presenter.createHero());
        JPanel jPanel = new JPanel();
        JLabel jLabelName = new JLabel("Hero name");
        jPanel.add(jLabelName);
        jPanel.add(heroField);
        JLabel jLabelPower = new JLabel("Hero power (1-10)");
        jPanel.add(jLabelPower);
        jPanel.add(powerField);
        jPanel.add(generateButton);
        jPanel.add(saveButton);
        this.add(jPanel, BorderLayout.CENTER);
        this.pack();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
