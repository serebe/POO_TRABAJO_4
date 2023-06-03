/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Apartamento extends Inmueblevivienda{

    public Apartamento(int identificadorInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños) {
        super(identificadorInmobiliario, Area, direccion, numerohabitaciones, numerobaños);
        }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
