/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Lista {
    protected Nodo primero;
private int tamaño = 0;

public int getTamaño() {
return tamaño;
}

public void setTamaño(int tamaño) {
this.tamaño = tamaño;
}

public Lista() {
primero = null;
}

public Nodo getPrimero() {
return primero;
}

public void setPrimero(Nodo primero) {
this.primero = primero;
}

public boolean esVacio() {
return primero == null;
}

public void insertarAlinicio(int x) {
Nodo nuevo = new Nodo(x);
nuevo.setInfo(x);
if (esVacio()) {

primero = nuevo;
} else {
nuevo.setSiguiente(primero);
primero = nuevo;

}
tamaño++;

}
public void insertarnumt(int x) {
Nodo nuevo = new Nodo(x);
nuevo.setInfo(x);
if (esVacio()) {

primero = nuevo;
} else {
nuevo.setSiguiente(primero);
primero = nuevo;
}
tamaño++;

}
public void insertarAlFinal(double x) {
Nodo nuevo = new Nodo(x);
nuevo.setInfo(x);
if (esVacio()) {
primero = nuevo;
} else {
Nodo aux = primero;
while (aux.getSiguiente() != null) {
aux = aux.getSiguiente();
}
aux.setSiguiente(nuevo);
}
tamaño++;
}

public void mostrar() {
Nodo p = primero;
 
     while (p != null)
     {
         System.out.println("[" + p.getInfo()+ "]");
         if(p.getInfo()==(1)){
         System.out.println("javier");
         } 
          if(p.getInfo()==(2)){
         System.out.println("ardila");
         }
           if(p.getInfo()==(3)){
         System.out.println("soldado 3");
         }
          if(p.getInfo()==(4)){
         System.out.println("soldado 4");
         } 
           if(p.getInfo()==(5)){
         System.out.println("soldado 5");
         } 
           if(p.getInfo()==(6)){
         System.out.println("soldado 6");
         }
         
         p = p.getSiguiente();
     }       


}

public void borrarPrimero() {

primero = primero.getSiguiente();

}

public void mayor() {
Nodo a = primero;
double mayor = primero.getInfo();
while (a != null) {

if (a.getInfo() > mayor) {
mayor = a.getInfo();

}
a = a.getSiguiente();

}
System.out.println("El soldado menos disponible es " + mayor);
}

public void menor() {
Nodo a = primero;
double menor = primero.getInfo();
while (a != null) {

if (a.getInfo() < menor) {
menor = a.getInfo();

}
a = a.getSiguiente();

}
System.out.println("El mayor gasto " + menor);
}

public void promedio() {
Nodo a = primero;
double suma = 0;
int con = 0;
while (a != null) {
suma += a.getInfo();
con++;
a = a.getSiguiente();
}
double promedio = suma / con;
System.out.println("el promedio de la municion es: " + promedio);
}

public int buscarPosicion(double x) {
Nodo a = primero;
int posi = -1;
int con = 0;
while (a != null) {
con++;
if (a.getInfo() == x) {
posi = con;
if(a.getInfo()==(1))
{
     System.out.print("javier: ");
    
}
if(a.getInfo()==(2))
{
     System.out.print("ardila");
  
}
if(a.getInfo()==(3))
{
     System.out.print("soldado 3");
 
}
if(a.getInfo()==(4))
{
     System.out.print("soldado 4");

}
if(a.getInfo()==(5))
{
     System.out.print("soldado 5");
  
}
if(a.getInfo()==(6))
{
     System.out.print("soldado 6");
    
}

}
a = a.getSiguiente();
}
return posi;
}

public void borrar(int pos) {
if (pos >= 0 && pos < getTamaño()) {
if (pos == 0) {
primero = primero.getSiguiente();
} else {
Nodo aux = primero.getSiguiente();
for (int i = 0; i < getTamaño(); i++) {
aux = aux.getSiguiente();
}
Nodo siguiente = aux.getSiguiente();
aux.setSiguiente(siguiente.getSiguiente());
}
  tamaño++;

}

}

}
