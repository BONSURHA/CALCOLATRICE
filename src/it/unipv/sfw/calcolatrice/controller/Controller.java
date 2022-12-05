package it.unipv.sfw.calcolatrice.controller;

import calcolatriceModel.Calcolatrice;
import it.unipv.sfw.calcolatrice.view.CalcolatriceButton;
import it.unipv.sfw.calcolatrice.view.CalcolatriceGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Calcolatrice c;
    private CalcolatriceGUI gui;

    public Controller(Calcolatrice c, CalcolatriceGUI gui) {
        this.c = c;
        this.gui = gui;
    }

    private void initComponents() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                manageAction(((CalcolatriceButton) ev.getSource()).getKeyCode());

            }
        }
    }
}
