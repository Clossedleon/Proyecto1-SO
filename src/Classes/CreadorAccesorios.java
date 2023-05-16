/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author jorgefanianos
 */
public class CreadorAccesorios extends Empleado {
    public CreadorAccesorios() {
        super(17, 10);
    }

    @Override
    public void trabajar() {
        cantidadAlmacen += 1.0/3.0; // genera 1 set de accesorios cada 3 días
    }
}