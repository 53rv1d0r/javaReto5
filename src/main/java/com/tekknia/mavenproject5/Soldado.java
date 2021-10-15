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
abstract class Soldado { //clase abstracta Soldado, no se instancia directamente, sólo sus hijos
    abstract float atacar();//Método abstracto no se define nunca en una clase abstracta, se define en una clase hijo
    public float defender(){//Método defender, no se definen en las clases hijo (Ya está definida)
        float puntosDefensa = 100;
        return 100;
    }
}
