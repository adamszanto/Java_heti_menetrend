package org.example.view;

import org.example.presenter.Presenter;

import java.util.Scanner;

public class Console implements View{
    private Presenter presenter;

    @Override
    public void start() {
        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                String input = scanner.nextLine().trim();

                if("STOP".equals(input)) {
                    break;
                }
                String[] heroParts = input.split(",");
                presenter.createHero(heroParts[0], heroParts[1]);
            }
        }
    }

    @Override
    public void notifyExport() {
        System.out.println("Export succesful.");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateView(String heroes) {
        System.out.println(heroes);
    }
}
