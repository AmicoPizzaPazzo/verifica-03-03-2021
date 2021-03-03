package com.company;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File extends ArrayList {
    public File() {
        super();
    }

    public void scrivicsv(Finestra f) {
        JFileChooser a = new JFileChooser();
        int b = a.showSaveDialog(f);
        if (b == JFileChooser.APPROVE_OPTION) {
            java.io.File file = a.getSelectedFile();
            FileWriter fw;
            try {
                fw = new FileWriter(file);
                for (int i = 0; i < this.size(); i++) {
                    if (this.get(i) instanceof Docente) {
                        fw.write(("Docente"), ((Docente) this.get(i)).nome, ((Docente) this.get(i)).cognome, ((Docente) this.get(i)).cod_fiscale, ((Docente) this.get(i)).nascita, ((Docente) this.get(i)).classe_concorso);
                    } else if (this.get(i) instanceof Ata) {
                        fw.write(("Ata"), ((Ata) this.get(i)).nome, ((Ata) this.get(i)).cognome, ((Ata) this.get(i)).cod_fiscale, ((Ata) this.get(i)).nascita, ((Ata) this.get(i)).inquadramento);
                    } else if ( this.get(i) instanceof Alunno){
                        fw.write(("Alunno"), ((Alunno) this.get(i)).nome, ((Alunno) this.get(i)).cognome, ((Alunno) this.get(i)).cod_fiscale, ((Alunno) this.get(i)).nascita, ((Alunno) this.get(i)).classe, ((Alunno) this.get(i)).sezione);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
