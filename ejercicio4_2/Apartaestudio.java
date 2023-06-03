/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Apartaestudio extends Apartamento {
    protected  static double valorArea=1500000;
    public Apartaestudio(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños) {
        super(identificadorInmobiliario, Area, direccion, 1, 1);

    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
