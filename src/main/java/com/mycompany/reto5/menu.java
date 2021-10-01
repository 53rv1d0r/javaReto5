/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

/**
 *
 * @author Vladimir
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author hp
 */
public class menu {
public static Scanner sc = new Scanner(System.in);
 public static Lista miLista = new Lista();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op = 0;
 System.out.println("1.identificador");
 System.out.println("2.apodo");
 System.out.println("3.nombre");
 System.out.println("4.puntaje");

do {

System.out.println("[1] Ingresar soldado ");
System.out.println("[2] Mostrar listar la informacion");
System.out.println("[3] Ingrese Elemento en la fila al final ");
System.out.println("[4] Borrar numero del soldado");
System.out.println("[5] menos disponibilidad");
System.out.println("[6] soldado de primeras");
System.out.println("[7] Promedio de unidades");
System.out.println("[8] datos ");
System.out.println("[9] Eliminar por posicion(productos del material)");
System.out.println("[10] buscar ");
System.out.println("[11] Salir");
System.out.println("Ingrese opcion[1-10]");
op = sc.nextInt();
switch (op) {

case 1:

int x = 0,s=0;
System.out.println("numero de elementos de la lista");
int n = sc.nextInt();
for (int j = 0; j < n; j++) {
System.out.println("Ingrese nombre:" + j);
x =sc.nextInt();
miLista.insertarAlinicio(x);
}
break;

case 2:
System.out.println("Los soldados ingresados son:");
miLista.mostrar();
break;
case 3:
double e;
System.out.println("numero del sodlado la lista");
int r = sc.nextInt();
for (int i = 0; i < r; i++) {
System.out.println("Ingrese numero:" + i);
e = sc.nextDouble();
miLista.insertarAlFinal(e);
}
break;
case 4:
System.out.println("Borrando producto del inicio");
miLista.borrarPrimero();
break;
case 5:

miLista.mayor();
break;
case 6:
miLista.menor();break;

case 7:
System.out.println("Promedio de los materiales ");
miLista.promedio();
break;
case 8:
 String con;
 String mes;
 int tel;
System.out.println("desea llevar un producto a domicilio ? /(s/n)");
con=sc.next();
if("s".equals(con))
{
    
    System.out.println("Ingrese mes: ");
    mes=sc.next();
    System.out.println("Ingrese telefono: ");
    tel=sc.nextInt();
    System.out.println("==> almacenado");
} else 
{
    System.out.println("para servirle");
    }
break;

case 9:
System.out.println("Ingrese producto a eliminar");
double numero=sc.nextDouble();

if(miLista.buscarPosicion(numero)!=-1){
int p=miLista.buscarPosicion(numero);
miLista.borrar(p);
System.out.println("producto eliminado");
}else{
System.out.println("producto no encontrado ");
}
break;
case 10:
    System.out.println("ingrese numero a buscar: ");
    numero=sc.nextDouble();
    if(miLista.buscarPosicion(numero)!=-1){
    int p=miLista.buscarPosicion(numero);
    System.out.print("\nsoldado no encontrado");
    }else
    {
        System.out.println("numero no encontrado");
    }
    break;

default:
System.out.println("Saliendo del programa ");
System.out.println("para servirle que vuelva");
}
} while (op != 11);
        
        
        
    }
    
}