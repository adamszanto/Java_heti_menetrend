package org.example.view;

import org.example.presenter.HeroPresenter;

import javax.swing.*;

public class Window extends JFrame implements HeroView{
    private Presenter presenter;

    private JTextField nameField;
    private JTextField powerField;
    private JButton generateButton;
    private JButton saveButton;

    public Window() {
        this.initConstructWindow();
        this.setSize(500,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initConstructWindow() {
        nameField = new JTextField(10);
        powerField = new JTextField(5);
        generateButton = new JButton("Generate");
        saveButton = new JButton("Save");
    }


    @Override
    public void setPresenter(HeroPresenter presenter) {

    }

    @Override
    public void updateValue(String value) {

    }
}
