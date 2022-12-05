package it.unipv.sfw.calcolatrice.view;

import javax.swing.*;

public class CalcolatriceButton extends JButton implements Comparable<CalcolatriceButton> {
    private int keyCode;

    public CalcolatriceButton() {

    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public int compareTo(CalcolatriceButton cb){
        return this.keyCode - cb.getKeyCode();

    }





}
