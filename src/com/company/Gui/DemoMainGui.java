package com.company.Gui;

import javax.swing.*;
import java.awt.*;

public class DemoMainGui {
    JFrame jf = null;
    JPanel jp = null;
    LoginPanelLeft loginPanelLeft = null;
    LoginPanelRight loginPanelRight = null;

    public DemoMainGui() {
        getJp().add(getLoginPanelRight().getJpNav());
        getJp().add(getLoginPanelLeft().getJpMain());
        getJf().setVisible(true);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame("swingDemoOne");
            //jf.setExtendedState(JFrame.MAXIMIZED_BOTH); //tam ekran başlatma
            jf.setUndecorated(true);
            jf.setSize(1000, 600);
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); //monitör ekran boyutlarını çekme
            int x = (int) ((dimension.getWidth() - jf.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - jf.getHeight()) / 2);
            jf.setLocation(x, y);
            jf.setContentPane(getJp());
            jf.setResizable(false);
            jf.addMouseListener(getLoginPanelRight().action);
            jf.addMouseMotionListener(getLoginPanelRight().action);
        }
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setLayout(null);
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public LoginPanelLeft getLoginPanelLeft() {
        if (loginPanelLeft == null) {
            loginPanelLeft = new LoginPanelLeft();
        }
        return loginPanelLeft;
    }

    public void setLoginPanelLeft(LoginPanelLeft loginPanelLeft) {
        this.loginPanelLeft = loginPanelLeft;
    }

    public LoginPanelRight getLoginPanelRight() {
        if (loginPanelRight == null) {
            loginPanelRight = new LoginPanelRight(this);
        }
        return loginPanelRight;
    }

    public void setLoginPanelRight(LoginPanelRight loginPanelRight) {
        this.loginPanelRight = loginPanelRight;
    }
}
