/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author jorgefanianos
 */
public abstract class Empleado {
    protected int salarioHora;
    protected int horasTrabajadas;
    protected int almacenMaximo;
    protected double cantidadAlmacen;

    public Empleado(int salarioHora, int almacenMaximo) {
        this.salarioHora = salarioHora;
        this.horasTrabajadas = 0;
        this.almacenMaximo = almacenMaximo;
        this.cantidadAlmacen = 0;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getCantidadAlmacen() {
        return cantidadAlmacen;
    }

    public abstract void trabajar();
}

