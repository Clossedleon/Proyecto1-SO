/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author jorgefanianos
 */
public class CreadorMotor extends Empleado {
    public CreadorMotor() {
        super(20, 55);
    }

    @Override
    public void trabajar() {
        cantidadAlmacen += 3; // genera 3 motores cada día
    }
}
