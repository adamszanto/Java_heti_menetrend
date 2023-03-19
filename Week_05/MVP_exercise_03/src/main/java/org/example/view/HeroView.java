package org.example.view;

import org.example.model.Hero;
import org.example.presenter.HeroPresenter;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public interface HeroView {
    public void setPresenter(HeroPresenter presenter);
    public void updateValue(String value);
}
