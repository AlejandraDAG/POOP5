/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author Alejandra Avila
 */
public class Circulo {
    private float radio;//atributo
    
    public Circulo(){//contructor
    }
    
    public float perimetro(){
        return 2* (float) Math.PI * radio;
    }
    
    public float area(){ 
        return (float) Math.PI*radio*radio; //*Math.pow(radio, 2.0)
    }
    
    public float getRadio(){
    return radio;
    }
    
    public void setRadio(float radio){ //es void 
        if (radio<0) {
            this.radio =Math.abs(radio);
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }
    
    @Override
    public String toString(){
        return "Circulo[radio="+radio+"]";
    }
    
}
