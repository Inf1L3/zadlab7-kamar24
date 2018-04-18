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
public class Student extends Osoba {
    
   private int nr_id;
   private String typ_stud;
   private String kierunek;
   private int rok_stud;

    public Student(String imie, String Nazwisko, String data_ur, String plec, int nr_id, String typ_stud, String kierunek, int rok_stud ) {
        super(imie, Nazwisko, data_ur, plec);
        this.nr_id = nr_id;
        this.typ_stud = typ_stud;
        this.kierunek = kierunek;
        this.rok_stud = rok_stud;
    }

    public int getNr_id() {
        return nr_id;
    }

    public String getTyp_stud() {
        return typ_stud;
    }

    public String getKierunek() {
        return kierunek;
    }

    public int getRok_stud() {
        return rok_stud;
    }

    public void setNr_id(int nr_id) {
        this.nr_id = nr_id;
    }

    public void setTyp_stud(String typ_stud) {
        this.typ_stud = typ_stud;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void setRok_stud(int rok_stud) {
        this.rok_stud = rok_stud;
    }

    @Override
    public String toString() {
        return "Student:"+ super.toString() + "nr_id: " + nr_id + ", typ_stud: " + typ_stud + ", kierunek: " + kierunek + ", rok_stud: " + rok_stud ;
    }

   

    

    
    

    
    
}
