package com.company.Logic;

import com.company.Gui.LoginPanelRight;

import java.awt.*;
import java.awt.event.*;

public class Actions implements ActionListener, FocusListener, KeyListener, MouseListener, MouseMotionListener {
    private LoginPanelRight actionLoginPanelRight = null;
    int xMouse, yMouse;

    public Actions(LoginPanelRight actionLoginPanelRight) {
        setActionLoginPanelRight(actionLoginPanelRight);
    }

    public LoginPanelRight getActionLoginPanelRight() {
        return actionLoginPanelRight;
    }

    public void setActionLoginPanelRight(LoginPanelRight actionLoginPanelRight) {
        this.actionLoginPanelRight = actionLoginPanelRight;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getActionLoginPanelRight().getBtnExit()) {
            System.exit(0);
        } else if (e.getSource() == getActionLoginPanelRight().getBtnLogin()) {
            getActionLoginPanelRight().getLblHeader().setText("Daha hazır değil !");
        }

    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == getActionLoginPanelRight().getTxtUserName()) {
            String username = getActionLoginPanelRight().getTxtUserName().getText();
            if (username.equals("Kullanıcı Adınız")) {
                getActionLoginPanelRight().getTxtUserName().setCaretPosition(0);
            }
        } else if (e.getSource() == getActionLoginPanelRight().getTxtPassword()) {
            String password = getActionLoginPanelRight().getTxtPassword().getText();
            if (password.equals("Şifreniz")) {
                getActionLoginPanelRight().getTxtPassword().setCaretPosition(0);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == getActionLoginPanelRight().getTxtUserName()) {
            String username = getActionLoginPanelRight().getTxtUserName().getText();
            if (username.equals("")) {
                getActionLoginPanelRight().getTxtUserName().setCaretPosition(0);
                getActionLoginPanelRight().getTxtUserName().setText("Kullanıcı Adınız");
                getActionLoginPanelRight().getTxtUserName().setForeground(Color.white);
            }
        } else if (e.getSource() == getActionLoginPanelRight().getTxtPassword()) {
            String password = getActionLoginPanelRight().getTxtPassword().getText();
            if (password.equals("")) {
                getActionLoginPanelRight().getTxtPassword().setCaretPosition(0);
                getActionLoginPanelRight().getTxtPassword().setText("Şifreniz");
                getActionLoginPanelRight().getTxtPassword().setForeground(Color.white);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == getActionLoginPanelRight().getTxtUserName()) {
            String username = getActionLoginPanelRight().getTxtUserName().getText();
            if (username.equals("Kullanıcı Adınız")) {
                getActionLoginPanelRight().getTxtUserName().setForeground(Color.white);
                getActionLoginPanelRight().getTxtUserName().setText(null);
                getActionLoginPanelRight().getTxtUserName().setCaretPosition(0);
            }
        } else if (e.getSource() == getActionLoginPanelRight().getTxtPassword()) {
            String password = getActionLoginPanelRight().getTxtPassword().getText();
            if (password.equals("Şifreniz")) {
                getActionLoginPanelRight().getTxtPassword().setForeground(Color.white);
                getActionLoginPanelRight().getTxtPassword().setText(null);
                getActionLoginPanelRight().getTxtPassword().setCaretPosition(0);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == getActionLoginPanelRight().getTxtUserName()) {
            String username = getActionLoginPanelRight().getTxtUserName().getText();
            if (username.equals("")) {
                getActionLoginPanelRight().getTxtUserName().setText("Kullanıcı Adınız");
                getActionLoginPanelRight().getTxtUserName().setForeground(Color.white);
                getActionLoginPanelRight().getTxtUserName().setCaretPosition(0);
            }
        } else if (e.getSource() == getActionLoginPanelRight().getTxtPassword()) {
            String password = getActionLoginPanelRight().getTxtPassword().getText();
            if (password.equals("")) {
                getActionLoginPanelRight().getTxtPassword().setText("Şifreniz");
                getActionLoginPanelRight().getTxtPassword().setForeground(Color.white);
                getActionLoginPanelRight().getTxtPassword().setCaretPosition(0);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();
        getActionLoginPanelRight().getDemoMainGui().getJf().setLocation(x - xMouse,y - yMouse);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
