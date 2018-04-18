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
public class Wykladowca  extends Osoba{
    
    private String tytul;
    private int wynagrodzenie;
    private String pokoj;
    private String przedmiot;
    private String il_zajec;

    public Wykladowca(String imie, String Nazwisko, String data_ur, String plec,String tytul, int wynagrodzenie, String pokoj, String przedmiot, String il_zajec) {
        super(imie, Nazwisko, data_ur, plec);
        this.tytul = tytul;
        this.wynagrodzenie = wynagrodzenie;
        this.pokoj = pokoj;
        this.przedmiot = przedmiot;
        this.il_zajec = il_zajec;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getPokoj() {
        return pokoj;
    }

    public void setPokoj(String pokoj) {
        this.pokoj = pokoj;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getIl_zajec() {
        return il_zajec;
    }

    public void setIl_zajec(String il_zajec) {
        this.il_zajec = il_zajec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public String getData_ur() {
        return data_ur;
    }

    public void setData_ur(String data_ur) {
        this.data_ur = data_ur;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return  "Wykladowca: "+ super.toString() + "tytul: " + tytul + ", wynagrodzenie: " + wynagrodzenie + ", pokoj: " + pokoj + ", przedmiot: " + przedmiot + ", il_zajec: " + il_zajec ;
    }

    

    
    
    
    
    
}
