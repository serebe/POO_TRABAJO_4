/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Casa extends  Inmueblevivienda{
        protected  int numeroPisos;
        public Casa(int identificarInmobiliario,int Area,String direccion,int numerohabitaciones, int numerobaños, int numeroPisos){
            super(identificarInmobiliario,Area,direccion,numerohabitaciones,numerobaños);
            this.numeroPisos= numeroPisos;
        }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos="+numeroPisos);
    }
}
