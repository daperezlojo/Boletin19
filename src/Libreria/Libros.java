/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author Damian
 */
public class Libros implements Comparable{
       private String titulo;
    private String ISBN;
    private int prezo;
    private int numUnidades;

    public Libros() {
    }

    public Libros(String titulo, String ISBN, int prezo, int numUnidades) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + " ISBN: " + ISBN + " prezo: " + prezo + " numUnidades: " + numUnidades + "\n";
    }

    @Override
    //criterio para ordenar por titulo
    public int compareTo(Object o) {
       Libros lib = (Libros) o;
       if(titulo.compareToIgnoreCase(lib.getTitulo())>0)
           return 1;
       else if(titulo.compareToIgnoreCase(lib.getTitulo())==0)
               return 0;
       else
               return -1;
    }
   
}