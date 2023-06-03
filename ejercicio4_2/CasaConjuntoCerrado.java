/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class CasaConjuntoCerrado extends Casaurbana{
    protected static double valorArea=2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificarInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int numeroPisos) {
        super(identificarInmobiliario, Area, direccion, numerohabitaciones, numerobaños, numeroPisos);
    }


    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion ="+valorAdministracion);
        System.out.println("Tiene piscina? ="+tienePiscina);
        System.out.println("Tiene campos deportivos? ="+tieneCamposDeportivos);
        System.out.println();
    }
}