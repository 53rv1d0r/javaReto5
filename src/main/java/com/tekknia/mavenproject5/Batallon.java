/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekknia.mavenproject5;

/**
 *
 * @author LENOVO
 */
public class Batallon {
    //Atributo que contiene un array
    Soldado[] soldados;
    //No se inicializa en la clase para que cada que se cree un batallón tega diferente cantidad de soldados
    //creo el constructor batallón con un parámetro i
    public Batallon (int i){
        //método que accede al atributo Soldado
        this.soldados = new Soldado[i];
    }
    //implementando métodos
    public void agregar(Berserker o){
        for(int i = 0; i < soldados.length; i++){
            if(soldados[i] == null){
                soldados[i]= o;
            return;
            }
        }
    }
    public Soldado obtener(int i){
        return this.soldados[i];
    }
    public void eliminar(int i){
       Soldado[] copiaSoldados = new Soldado[this.soldados.length -1];
       int a = 0;
       for(int x = 0; x < soldados.length; x++){
           if(x == i){
               continue;
           }else{
               copiaSoldados[a++] = soldados[x];
           }
       }
       this.soldados = copiaSoldados;
    }
    
}
