/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author jorgefanianos
 */
public class CreadorChasis extends Empleado {
    public CreadorChasis() {
        super(10, 25);
    }

    @Override
    public void trabajar() {
        cantidadAlmacen += 0.5; // genera 1 chasis cada 2 días
    }
}