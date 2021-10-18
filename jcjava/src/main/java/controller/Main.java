package controller;

import view.JFrameAdd;
import view.JPanelAdd;

public class Main {
    
    public static void main (String[] args){
        JFrameAdd frameAdd = new JFrameAdd();
        JPanelAdd panelAdd = new JPanelAdd();
        frameAdd.getContentPane().add(panelAdd);
        panelAdd.setVisible(true);
        //frameAdd.getContentPane().revalidate();
    }
    
}
