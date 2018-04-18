/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Osoba {
    public String imie;
    public String Nazwisko;
    public String data_ur;
    public String plec;

    public Osoba(String imie, String Nazwisko, String data_ur, String plec) {
        this.imie = imie;
        this.Nazwisko = Nazwisko;
        this.data_ur = data_ur;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getData_ur() {
        return data_ur;
    }

    public String getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public void setData_ur(String data_ur) {
        this.data_ur = data_ur;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba: " + "imie: " + imie + ", Nazwisko: " + Nazwisko + ", data_ur: " + data_ur + ", plec: " + plec ;
    }

    
    
    
}
