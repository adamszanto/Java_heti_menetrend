package org.example;

import org.example.model.Text;
import org.example.presenter.Controller;
import org.example.view.Window;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Text text = new Text();
        Window windows = new Window();
        Controller controller = new Controller(windows, text);
        text.setPresenter(controller);
        windows.setPresenter(controller);
    }
}