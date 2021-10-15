/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekknia.mavenproject5;

/**
 *
 * @author Alejandro Restrepo - Vladimir Ortega
 * Universidad de Antioquia - Técnicas de programación2021
 */
public class Main {
    public static void main(String[] args){//método void main para probar
        Berserker vlad = new Berserker (0, "Vlad", "Vlad El Destructor", 100f, new Arma (2, "Lanzacohetes", 110f, 100f));
        Berserker alej = new Berserker (0, "Alej", "Alej The Great", 110f, new Arma (2, "Ballesta", 100f, 100f));
        Batallon batallonBerserkers = new Batallon(2);
        batallonBerserkers.agregar(vlad);
        batallonBerserkers.agregar(alej);
        System.out.println(batallonBerserkers.soldados[0]);
        System.out.println(batallonBerserkers.soldados[1]);
        //batallonBersekers.eliminar(0);
        //System.out.println(batallonBerserkers.soldados.length);
        //for(int i = 0; i<batallonBerserkers.soldados.length;i++){
            //System.out.println(batallonBerserkers.obtener(i).toString());
        //}
    }
    
}
