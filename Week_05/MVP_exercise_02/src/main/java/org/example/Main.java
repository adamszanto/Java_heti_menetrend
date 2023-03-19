package org.example;

import org.example.model.Text;
import org.example.presenter.Controller;
import org.example.view.Window;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        Window window = new Window();
        Controller controller = new Controller(text, window);
        text.setPresenter(controller);
        window.setPresenter(controller);
    }
}