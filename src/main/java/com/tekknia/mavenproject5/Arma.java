/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekknia.mavenproject5;

import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Arma {
    private int id;
    private String nombre;
    private float puntajeAtaque;
    private float puntajeDefensa;
    
    //constructor de la clase Arma
    public Arma(int id, String nombre, float puntajeAtaque, float puntajeDefensa){
        this.id = id;
        this.nombre = nombre;
        this.puntajeAtaque = puntajeAtaque;
        this.puntajeDefensa = puntajeDefensa;
    }
    
    //geters y seters id
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    //getters y setters nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //getters y setters puntajeAtaque
    public float getPuntajeAtaque(){
        return this.puntajeAtaque;
    }
    public void setPuntajeAtaque(float puntajeAtaque){
        this.puntajeAtaque = puntajeAtaque;
    }
    //getters y setters puntajeDefensa
    public float getPuntajeDefensa(){
        return this.puntajeDefensa;
    }
    public void setPuntajeDefensa(float puntajeAtaque){
        this.puntajeAtaque = puntajeDefensa;
    }
    @Override
    public String toString(){
        return "{" +
               " id='" + getId() + "'" +
               ", nombre='" + getNombre() + "'" +
               ", puntajeAtaque='" + getPuntajeAtaque() + "'" +
               ", puntajeDefensa='" + getPuntajeDefensa() + "'" + 
               "}";
        }
}
