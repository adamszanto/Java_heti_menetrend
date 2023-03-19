package org.example.view;

import org.example.presenter.Presenter;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements View {

    private Presenter presenter;
    private JTextField input;
    private JButton button;
    public Window() {
        // utólag törlésre kerültek a this. kulcsszók a alábbiaknál:
        initConstructWindow();
        setSize(400,200);
        setTitle("Avengers Manager v3.04");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initConstructWindow() {
        input = new JTextField(20);
        button = new JButton("Press OK");
        button.addActionListener(e -> presenter.updateValue(input.getText()));
        JPanel jPanel = new JPanel();
        jPanel.add(input);
        jPanel.add(button);
        this.add(jPanel, BorderLayout.CENTER);
        // Újraszámoltatja a window méretét ha előtte pakoltunk bele dolgokat:
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
