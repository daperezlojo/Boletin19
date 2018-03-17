/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import Libreria.Libreria;
import Libreria.Libros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Libreria obx1 = new Libreria();
        
        ArrayList<Libros> exemplar = new ArrayList();
        
        exemplar.add(new Libros("Laguna","1111",20,7));
        exemplar.add(new Libros("La puerta roja","2222",15,3));
        exemplar.add(new Libros("Tsunami","3333",9,1));
        exemplar.add(new Libros("El vecino","4444",14,6));
        exemplar.add(new Libros("La bruja","5555",18,0));
        exemplar.add(new Libros("Anomalía","6666",20,1));

        System.out.println("******MENU******\n"
                + "1)Engadir libro\n"
                + "2)Vender libro\n"
                + "3)Amosar os libros ordenados por titulo\n"
                + "4)Dar de baixa os libros con 0 unidades\n"
                + "5)Consultar un libro determinado\n"
                + "6)Salir\n");

        int op = Integer.parseInt(JOptionPane.showInputDialog("Introduce unha opcion"));

        while (op != 6) {

            switch (op) {
                case 1:
                    obx1.engadirLibros(exemplar);
                    break;
                case 2:
                    obx1.venderLibros(exemplar);
                    break;
                case 3:
                    obx1.amosarLibros(exemplar);
                    break;
                case 4:
                    obx1.darDeBaixa(exemplar);
                    break;
                case 5:
                    obx1.libroDeterminado(exemplar);
                    break;
                case 6:
                    break;

            }
            System.out.println("******MENU******\n"
                    + "1)Engadir libro\n"
                    + "2)Vender libro\n"
                    + "3)Amosar os libros ordenados por titulo\n"
                    + "4)Dar de baixa os libros con 0 unidades\n"
                    + "5)Consultar un libro determinado\n"
                    + "6)Salir\n");

            op = Integer.parseInt(JOptionPane.showInputDialog("Introduce unha opcion"));

        }
    }

 
}
