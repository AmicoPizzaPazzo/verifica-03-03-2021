package com.company;

public class Alunno extends Persona{
    public Alunno( Persona s, String classe, String sezione){
        super(s);
        this.classe=classe;
        this.sezione=sezione;
    }
    public String classe, sezione;
}
