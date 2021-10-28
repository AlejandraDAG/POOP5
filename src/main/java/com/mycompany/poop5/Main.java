/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *Main que contiene la realizacion de los ejemplos de getter y setters
 * @author Alejandra Avila
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("******--Getters Setters--*********");
        
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir ="+cir.getRadio());
        cir.setRadio((float)7.2);//casteamos forma 1
        cir.setRadio(8.9f);//casteo forma 2
        
        float var = 5;
        cir.setRadio(var);
        
        cir.setRadio(-7);
        System.out.println("cir");
        
        System.out.println("******--Composición1--*********");
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setNombre("Alejandra");
        persona1.setApellido("Avila");
        Fecha fNac = new Fecha(14, 10, 2021);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        System.out.println("******--Composición2--*********");
        Fecha fNac2 = new Fecha(22, 01, 2021);
        Carro posicion = new Carro("pasajero2");
        Persona persona2 = new Persona("Alejandra", "Avila", fNac2, posicion);
        System.out.println(persona2);
        
        System.out.println("******--Composición3--*********");
        Persona persona3 = new Persona("Alejandra", "Avila",22,04,1998);
        System.out.println(persona3);
        
        System.out.println("******--PosicionesEnCarro--*********");
        Fecha F1 = new Fecha(22,01,2002);
        Carro posicion1 = new Carro("Copiloto");
        Persona p1 = new Persona("Alejandra","Avila",F1,posicion1);
        Fecha F2 = new Fecha(23,01,2002);
        Carro posicion2 = new Carro("Chofer");
        Persona p2 = new Persona("Diego","Barragan",F2,posicion2);
        Fecha F3 = new Fecha(24,01,2002);
        Carro posicion3 = new Carro("Pasajero1");
        Persona p3 = new Persona("Jhusteene","Salgado",F3,posicion3);
        Fecha F4 = new Fecha(25,01,2002);
        Carro posicion4 = new Carro("Pasajero2");
        Persona p4 = new Persona("Tania","Gomez",F4,posicion4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
    
}
