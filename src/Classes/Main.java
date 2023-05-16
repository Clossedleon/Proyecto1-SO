/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Windows
 */
public class Main {

    /**
     * @param args the command line arguments
     */public static void main(String[] args) {
        CreadorChasis creadorChasis = new CreadorChasis();
        CreadorCarroceria creadorCarroceria = new CreadorCarroceria();
        CreadorMotor creadorMotor = new CreadorMotor();
        CreadorRuedas creadorRuedas = new CreadorRuedas();
        CreadorAccesorios creadorAccesorios = new CreadorAccesorios();

        int diasTrabajados = 2;

        for (int i = 0; i < diasTrabajados; i++) {
            creadorChasis.trabajar();
            creadorCarroceria.trabajar();
            creadorMotor.trabajar();
            creadorRuedas.trabajar();
            creadorAccesorios.trabajar();
        }

        System.out.println("Resumen de producción:");
        System.out.println("Chasis: " + creadorChasis.getCantidadAlmacen());
        System.out.println("Carrocerías: " + creadorCarroceria.getCantidadAlmacen());
        System.out.println("Motores: " + creadorMotor.getCantidadAlmacen());
        System.out.println("Ruedas: " + creadorRuedas.getCantidadAlmacen());
        System.out.println("Sets de accesorios: " + creadorAccesorios.getCantidadAlmacen());
    }
    
}
