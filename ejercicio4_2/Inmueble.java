/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Inmueble {
        protected int identificadorInmobiliario;
        protected int Area;
        protected String direccion;
        protected Double precioventa;
        Inmueble(int identificadorInmobiliario, int Area, String direccion){
            this.identificadorInmobiliario= identificadorInmobiliario;
            this.Area=Area;
            this.direccion = direccion;
        }
        double calcularprecioventa(double valorArea){
            precioventa = Area * valorArea;
            return precioventa;
        }
        void imprimir(){
            System.out.println("Identificar inmobiliario = "+ identificadorInmobiliario);
            System.out.println("Area="+Area);
            System.out.println("Direccion ="+direccion);
            System.out.println("Precio de venta=$"+precioventa);
        }
}
