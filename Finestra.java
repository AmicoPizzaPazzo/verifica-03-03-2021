package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener{
    public JMenuBar menubar;
    public JMenu menu,vedi,aggiungi;
    public JMenuItem salva,importa;
    public DialogueAlunno alunno;
    public Dialoguedocente doc;
    public DialogueAta ata;
    public DefaultTableModel dfm;
    public JScrollPane scroll;

    public Finestra(){
    initComp();
    }
    public void initComp(){
        menubar = new JMenuBar();
        menu = new JMenu("Menu");
        salva = new JMenuItem("salva");
        salva.addActionListener(this);
        importa = new JMenuItem("importa");
        importa.addActionListener(this);
        dfm= new DefaultTableModel();
        scroll = new JScrollPane();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}