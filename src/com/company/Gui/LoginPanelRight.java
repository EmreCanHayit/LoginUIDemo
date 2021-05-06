package com.company.Gui;

import com.company.Logic.Actions;

import javax.swing.*;
import java.awt.*;

public class LoginPanelRight {
    JPanel jpNav = null;
    JButton btnExit = null, btnLogin = null;
    JLabel lblHeader = null, lblUserName = null, lblPassword = null;
    JTextField txtUserName = null;
    JPasswordField txtPassword = null;
    Actions action = new Actions(this);
    private DemoMainGui demoMainGui;

    public LoginPanelRight(DemoMainGui demoMainGui) {
        getJpNav().add(getLblHeader());
        getJpNav().add(getLblUserName());
        getJpNav().add(getTxtUserName());
        getJpNav().add(getLblPassword());
        getJpNav().add(getTxtPassword());
        getJpNav().add(getBtnLogin());
        getJpNav().add(getBtnExit());
        this.setDemoMainGui(demoMainGui);
    }

    public JPanel getJpNav() {
        if (jpNav == null) {
            jpNav = new JPanel();
            jpNav.setBackground(new Color(64, 115, 158));
            jpNav.setBounds(500, 0, 500, 600);
            jpNav.setLayout(null);
        }
        return jpNav;
    }

    public void setJpNav(JPanel jpNav) {
        this.jpNav = jpNav;
    }

    public JButton getBtnExit() {
        if (btnExit == null) {
            btnExit = new JButton("X");
            btnExit.setBounds(450, 0, 50, 50);
            btnExit.setBackground(new Color(59, 89, 182));
            btnExit.setForeground(Color.white);
            btnExit.setFocusPainted(false);
            btnExit.setBorder(null);
            btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
            btnExit.addActionListener(action);
        }
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    public JButton getBtnLogin() {
        if (btnLogin == null) {
            btnLogin = new JButton("Giriş yap");
            btnLogin.setBounds(150, 385, 200, 40);
            btnLogin.setBackground(new Color(59, 89, 182));
            btnLogin.setForeground(Color.white);
            btnLogin.setBorder(null);
            btnLogin.setFocusPainted(false);
            btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
            btnLogin.addActionListener(action);
        }
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JLabel getLblHeader() {
        if (lblHeader == null) {
            lblHeader = new JLabel("Swing Demo #1", SwingConstants.CENTER);
            lblHeader.setBounds(150, 100, 200, 40);
            lblHeader.setFont(new Font("Tahoma", Font.BOLD, 22));
            lblHeader.setForeground(Color.white);
        }
        return lblHeader;
    }

    public void setLblHeader(JLabel lblHeader) {
        this.lblHeader = lblHeader;
    }

    public JLabel getLblUserName() {
        if (lblUserName == null) {
            lblUserName = new JLabel("Kullanıcı Adı", SwingConstants.LEFT);
            lblUserName.setBounds(150, 175, 200, 40);
            lblUserName.setForeground(Color.white);
        }
        return lblUserName;
    }

    public void setLblUserName(JLabel lblUserName) {
        this.lblUserName = lblUserName;
    }

    public JLabel getLblPassword() {
        if (lblPassword == null) {
            lblPassword = new JLabel("Şifre", SwingConstants.LEFT);
            lblPassword.setBounds(150, 275, 200, 40);
            lblPassword.setForeground(Color.white);
        }
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }

    public JTextField getTxtUserName() {
        if (txtUserName == null) {
            txtUserName = new JTextField("Kullanıcı Adınız", 15);
            txtUserName.setBounds(150, 225, 200, 40);

            txtUserName.setOpaque(false);
            txtUserName.setForeground(Color.white);
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.white, 1));
            txtUserName.setBorder(BorderFactory.createCompoundBorder(
                    txtUserName.getBorder(),
                    BorderFactory.createEmptyBorder(5, 25, 5, 25)));
            txtUserName.addFocusListener(action);
            txtUserName.addKeyListener(action);
        }
        return txtUserName;
    }

    public void setTxtUserName(JTextField txtUserName) {
        this.txtUserName = txtUserName;
    }

    public JPasswordField getTxtPassword() {
        if (txtPassword == null) {
            txtPassword = new JPasswordField("Şifreniz", 15);
            txtPassword.setBounds(150, 325, 200, 40);

            txtPassword.setOpaque(false);
            txtPassword.setForeground(Color.white);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.white, 1));
            txtPassword.setBorder(BorderFactory.createCompoundBorder(
                    txtPassword.getBorder(),
                    BorderFactory.createEmptyBorder(5, 25, 5, 25)));
            txtPassword.addFocusListener(action);
            txtPassword.addKeyListener(action);
        }
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public DemoMainGui getDemoMainGui() {
        return demoMainGui;
    }

    public void setDemoMainGui(DemoMainGui demoMainGui) {
        this.demoMainGui = demoMainGui;
    }
}
