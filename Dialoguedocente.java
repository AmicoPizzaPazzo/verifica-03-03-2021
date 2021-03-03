package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialoguedocente extends JDialog implements ActionListener {
    public JLabel l1,l2,l3,l4,l5;
    public JTextField t1,t2,t3,t4,t5;
    public JButton b1,b2;
    public Docente doc;

    public Dialoguedocente (Finestra f, boolean modal){
        super(f);
        initComp();
        this.setVisible(true);
        this.setSize(1600, 800);

    }
    public void initComp(){
        l1= new JLabel("inserire nome");
        l2= new JLabel("inserire cognome");
        l3= new JLabel("inserire codice fiscale");
        l4= new JLabel("inserire data di nascita");
        l5= new JLabel("inserire la classe di concorso");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        b1 = new JButton("salva");
        b1.addActionListener(this);
        b2 = new JButton("chiudi");
        b2.addActionListener(this);
        this.setLayout(new GridLayout(6,2));
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(b1);
        this.add(b2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b2)) {
        }
        if(e.getSource().equals(b1)){
            doc = new Docente(new Persona(t1.getText(),t2.getText(),t3.getText(),t4.getText()), t5.getText());
        }
    }
    public Docente ritonaDocente(){
        return doc;
    }
}
