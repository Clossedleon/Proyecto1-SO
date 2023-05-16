/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author jorgefanianos
 */
public class CreadorCarroceria extends Empleado {
    public CreadorCarroceria() {
        super(13, 20);
    }

    @Override
    public void trabajar() {
        cantidadAlmacen += 0.5; // genera 1 carrocería cada 2 días
    }
}