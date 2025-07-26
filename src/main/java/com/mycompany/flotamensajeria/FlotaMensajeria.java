/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flotamensajeria;

import java.util.ArrayList;


/**
 *
 * @author herbert
 */
public class FlotaMensajeria {

    public static void main(String[] args) {
      ArrayList<Vehiculo> flota = new ArrayList<>();
     
      flota.add(new Motocicleta());
      flota.add(new Camion());
      flota.add(new Bicicleta());
      flota.add(new BicicletaElectrica());
    
      for (Vehiculo vehiculo : flota) {
            vehiculo.moverse();
            vehiculo.detenerse();

            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarBateria();
            }

            System.out.println("------------------------");
        }
    }
}