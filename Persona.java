package com.company;
public class Persona {
    public Persona (String nome, String cognome, String cod_fiscale, String nascita){
        this.nome=nome;
        this.cognome=cognome;
        this.cod_fiscale=cod_fiscale;
        this.nascita=nascita;
    }
    public String nome,nascita,cognome,cod_fiscale;

    public void setCod_fiscale(String cod_fiscale) {
        this.cod_fiscale = cod_fiscale;
    }

    public String getCod_fiscale() {
        return cod_fiscale;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }

    public String getNascita() {
        return nascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
