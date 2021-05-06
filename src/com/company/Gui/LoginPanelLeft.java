package com.company.Gui;

import javax.swing.*;
import java.awt.*;

public class LoginPanelLeft {
    JPanel jpMain = null;
    JLabel background = null;

    public LoginPanelLeft() {
        getJpMain().add(getBackground());
    }

    public JPanel getJpMain() {
        if (jpMain == null) {
            jpMain = new JPanel();
            jpMain.setBounds(0, 0, 500, 600);
            jpMain.setBackground(new Color(241, 231, 254));
            jpMain.setLayout(null);
        }
        return jpMain;
    }

    public void setJpMain(JPanel jpMain) {
        this.jpMain = jpMain;
    }

    public JLabel getBackground() {
        if (background == null) {
            ImageIcon img = new ImageIcon("src/com/company/Gui/Image/wallhaven-28861.png");
            //ImageIcon img = new ImageIcon(getClass().getResource("iconUser.png"));
            background = new JLabel("", img, JLabel.CENTER);
            background.setBounds(0, 0, 500, 600);
        }
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }
}
