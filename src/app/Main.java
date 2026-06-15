package app;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours();

        System.out.println("TODOS LOS TOURS");
        System.out.println("----------------");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\nTOURS MAYORES A 18000");
        System.out.println("---------------------");

        for (Tour tour : tours) {

            if (tour.getPrecio() > 18000) {
                System.out.println(tour);
            }
        }
    }
}