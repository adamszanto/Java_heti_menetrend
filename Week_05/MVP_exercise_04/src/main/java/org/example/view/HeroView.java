package org.example.view;

import org.example.presenter.HeroPresenter;

import javax.swing.*;

public class HeroView extends JFrame {
    private HeroPresenter presenter;
    private JFrame frame;
    private JTextField nameField;
    private JTextField powerField;
    private JButton generateButton;
    private JButton saveButton;
    private JTextArea heroList;

    public HeroView() {
        this.initConstructWindow();
        this.setSize(600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initConstructWindow() {
        nameField = new JTextField(6);
        powerField = new JTextField(3);

    }
}
