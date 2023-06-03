/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean delGobierno;
    Oficina(int identificadorInmobiliario, int Area, String direccion, tipo tipoLocal, boolean delGobierno) {
        super(identificadorInmobiliario, Area, direccion, tipoLocal);
        this.delGobierno=delGobierno;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina Gubernamental="+delGobierno);
        System.out.println();
    }
}
