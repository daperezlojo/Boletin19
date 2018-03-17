/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class Libreria {
     
     public void engadirLibros(ArrayList<Libros> exemplar) {

        String titulo = JOptionPane.showInputDialog("Engade titulo");
        String ISBN = JOptionPane.showInputDialog("Engade ISBN");
        int prezo = Integer.parseInt(JOptionPane.showInputDialog("¿Canto costa?"));
        int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cantos exemplares hay?"));
        
        Libros l = new Libros(titulo, ISBN, prezo, numUnidades);
        exemplar.add(l);
    }

    // borrar libros
    public void venderLibros(ArrayList<Libros> exemplar) {

        boolean existe = false;
        String vender = JOptionPane.showInputDialog("¿Que libro se vai vender?Introduce ISBN");
        for (Libros elemento : exemplar) {
            if (elemento.getISBN().equals(vender)) {
                if (elemento.getNumUnidades() > 0) {
                    elemento.setNumUnidades(elemento.getNumUnidades() - 1);
                    existe = true;

                } else {
                    System.out.println("Non quedan exemplares");
                }
            }
        }
    }

    //amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
    public void amosarLibros(ArrayList<Libros> exemplar) {

        Collections.sort(exemplar);
        for (Libros elemento : exemplar) {
            System.out.println(elemento);
        }
    }

    //dar de baixa os libros con numero de unidades =0
    public void darDeBaixa(ArrayList<Libros> exemplar) {
        boolean aceptado = false;
        for (int i = 0; i < exemplar.size(); i++) {
            if (exemplar.get(i).getNumUnidades() == 0) {
                exemplar.remove(i);
                aceptado = true;
            }
        }
        if (aceptado == false) {
            System.out.println("Non hai libros sen unidades");
        }
    }

    //consultar un libro determinado
    public void libroDeterminado(ArrayList<Libros> exemplar) {

        String libro = JOptionPane.showInputDialog("¿Que libro desexas consultar?");

        boolean existe = false;
        for (Libros elemento : exemplar) {
            if (elemento.getTitulo().equals(libro)) {
                System.out.println(elemento.toString());
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("Ese libro non existe");
        }
    }
}