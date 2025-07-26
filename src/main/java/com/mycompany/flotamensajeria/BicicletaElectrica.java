/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flotamensajeria;

/**
 *
 * @author herbert
 */
public class BicicletaElectrica extends Vehiculo implements Electrico {
    
    
    @Override
    public void moverse(){
        System.out.println("Bicicleta electrica andando");
    }
    
    @Override
    public void cargarBateria(){
        System.out.println("Cargando bateria de la bicicleta electrica ---");
    }
    
}
