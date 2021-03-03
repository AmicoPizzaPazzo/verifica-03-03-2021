package com.company;

public class Docente extends Persona{
    public Docente( Persona s, String classe_concorso){
        super(s);
        this.classe_concorso=classe_concorso;

    }
    public String classe_concorso;
}
