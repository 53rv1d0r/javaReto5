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
public class Berserker extends Soldado{
    int id;
    String apodoBatalla;
    String nombreCompleto;
    float puntajeFuerza;
    //Arma[] armas ;//variable armas (nombre de la clase en plural) Arma arreglo inicia en mayúscula
    //Inicializamos el array acá para no inicializarlo en el Main () se puede fuera del constructor o en el constructor)
    Arma[] armas = new Arma[3]; //arreglo con 3 posiciones
    //Inicializando constructor
    //public Berserker(int id, String apodoBatalla, String nombreCompleto, float puntajeFuerza, Arma[] armas){
    public Berserker(int id, String apodoBatalla, String nombreCompleto, float puntajeFuerza, Arma armaCreada){
        this.id = id;
        this.apodoBatalla = apodoBatalla;
        this.nombreCompleto = nombreCompleto;
        this.puntajeFuerza = puntajeFuerza;
        //this.armas = armas;
        //De las 3 armas 2 ya construidas por defecto
        //Arma espada = new Arma (id, nombre, puntajeAtaque, puntajeDefensa);
        Arma espada = new Arma (0, "Espada", 130f, 0f);//Hay que asignarlo a la lista para que el berserker lo tenga, acá sólo está creado el objeto arma espada
        Arma armadura = new Arma(1, "Armadura", 0f, 100f);
        armas[0] = espada;
        armas[1] = armadura;
        armas[2] = armaCreada;
    }
    //Método atacar implementación
    public float atacar(){
        float valor = 0f;
        float sumArmas = 0f;
        for(int i=0; i< armas.length; i++){
            sumArmas += armas[i].getPuntajeAtaque();
        }
        valor = this.puntajeFuerza * sumArmas;
        return valor;
    }
    // Getters y setters  id 
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    //getters y setters apodoBatalla
    public String getApodoBatalla(){
        return this.apodoBatalla;
    }
    public void setApodoBatalla(String apodoBatalla){
        this.apodoBatalla = apodoBatalla;
    }
    //getters y setters nombreCompleto
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    //getters y setters puntajeFuerza
    public float getPuntajeFuerza(){
        return this.puntajeFuerza;
    }
    public void setPuntajeFuerza(float puntajeFuerza){
        this.puntajeFuerza = puntajeFuerza;
    }
    //getters y setters armas
    public Arma[] getArmas(){
        return this.armas;
    }
    public void setArmas(Arma[] armas){
        this.armas = armas;
    }
    @Override
    public String toString(){
        return "{" +
               " id='" + getId() + "'" +
               ", apodoBatalla='" + getApodoBatalla() + "'" +
               ", nombreCompleto='" + getNombreCompleto() + "'" +
               ", puntajeFuerza='" + getPuntajeFuerza() + "'" +
               ", armas='" + getArmas() + "'" +
               "}";
        }
}
