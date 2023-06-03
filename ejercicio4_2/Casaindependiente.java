/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Casaindependiente extends Casaurbana {
    protected static double valorArea=3000000;

    public Casaindependiente(int identificarInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int numeroPisos) {
        super(identificarInmobiliario, Area, direccion, numerohabitaciones, numerobaños, numeroPisos);
    }


    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
