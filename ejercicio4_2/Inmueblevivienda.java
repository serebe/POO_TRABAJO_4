/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Inmueblevivienda extends Inmueble {

        protected int numerobaños;
        protected int numerohabitaciones;
        public Inmueblevivienda(int identificadorInmobiliario, int Area,String direccion, int numerohabitaciones, int numerobaños){
            super(identificadorInmobiliario,Area,direccion);
            this.numerohabitaciones = numerohabitaciones;
            this.numerobaños = numerobaños;
        }

        @Override
        void imprimir() {
            super.imprimir();
            System.out.println("Numero de habitaciones="+numerohabitaciones);
            System.out.println("Numero de baños="+numerobaños);
        }
    }
