package it.unipv.sfw.calcolatrice.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CalcolatriceGUI extends JFrame {
    private JLabel screen;
    private JPanel buttons;
    private ArrayList<CalcolatriceButton> allButtons;

    public CalcolatriceGUI() throws HeadlessException {
        this.buttons = new JPanel(new GridLayout(4, 5));
        this.screen = new JLabel();
        // aggiungere i tasti
        screen.setText("HELLO!");
        for(CalcolatriceButton cb:  this.allButtons){

        }
    }

    public ArrayList<CalcolatriceButton> getAllButtons() {
        return allButtons;
    }
}