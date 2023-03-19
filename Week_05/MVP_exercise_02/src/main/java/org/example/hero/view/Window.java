package org.example.hero.view;

import org.example.hero.presenter.Presenter;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements View {
    private Presenter presenter;

    private JTextField input;
    private JButton button;

    public Window() {

        this.initConstructWindow();
        this.setSize(500,200);
        this.setTitle("Avengers Hero Generator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initConstructWindow() {

        input = new JTextField(20);
        button = new JButton("Generate!");
        button.addActionListener(e -> presenter.updateValue(input.getText()));
        JLabel jlabel = new JLabel("Hero name, power (1-10): ");
        JPanel jPanel = new JPanel();
        jPanel.add(jlabel);
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
    public void updatedValue(String value) {
        input.setText(value);
    }
}
