/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;

/**
 *
 * @author ANDRE
 */
public interface IParkingCost {
    
    public long calculateCost(LocalDateTime tiempoLlegada, LocalDateTime tiempoSalida);
    public long calcularRedondeo(long valor);
}