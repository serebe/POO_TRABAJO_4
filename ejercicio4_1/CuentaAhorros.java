/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.pkg1;

public class CuentaAhorros extends Cuenta {
private boolean activa;

public CuentaAhorros(float saldo, float tasa) {
super(saldo, tasa);
if (saldo < 10000) /* Si el saldo es menor a 10000, la cuenta no 
se activa */
activa = false;
else
activa = true;
}

public void retirar(float cantidad) {
if (activa) // Si la cuenta está activa, se puede retirar dinero
super.retirar(cantidad); /* Invoca al método retirar de la clase 
padre */
}

public void consignar(float cantidad) {
if (activa) // Si la cuenta está activa, se puede consignar dinero
super.consignar(cantidad); /* Invoca al método consignar de 
la clase padre */
}

public void extractoMensual() {

if (númeroRetiros > 4) {
comisiónMensual += (númeroRetiros - 4) * 1000;
}
super.extractoMensual(); 

if ( saldo < 10000 )
activa = false;
}

public void imprimir() {
System.out.println("Saldo = $ " + saldo);
System.out.println("Comisión mensual = $ " + 
comisiónMensual);
System.out.println("Número de transacciones ="  + 
(númeroConsignaciones + númeroRetiros));
System.out.println();
}
}
