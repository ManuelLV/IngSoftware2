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
public class TruckParkingCost implements IParkingCost {
   
	@Override
    public  long calculateCost(LocalDateTime tiempoLlegada, LocalDateTime tiempoSalida){
        long precioFijo, precioTotal, precioPorHora;
        long horas;
        precioFijo	= 15000;
        horas = (tiempoSalida.getHour() - tiempoLlegada.getHour()) + (tiempoSalida.getMinute() - tiempoLlegada.getMinute())/60
        		
        		;
        precioPorHora = 1;
        precioTotal = precioFijo + (precioPorHora * horas);
    	
        return calcularRedondeo(precioTotal);
    }

	@Override
	public long calcularRedondeo(long valor) {
		// TODO Auto-generated method stub
		return valor;
	}
	
}
