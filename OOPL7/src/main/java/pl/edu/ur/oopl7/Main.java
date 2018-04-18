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
public class Main {
    public static void main(String[] args) {
        Student stduent1= new Student ("Andrzej", "Kowalski", "20-01-1996", "M",12345,"dzienne","inf",1);
        Wykladowca wykladowca1= new Wykladowca ("Andrzej", "Kowalski", "20-01-1996", "M","Mgr",3000,"B1-234","PO","10");
        System.out.println(stduent1.toString());
        System.out.println(wykladowca1.toString());
    }
}
