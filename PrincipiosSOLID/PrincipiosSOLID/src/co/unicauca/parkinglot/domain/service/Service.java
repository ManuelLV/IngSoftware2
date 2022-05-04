/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain.service;
import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.domain.Vehicle;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRE
 */
public class Service {

    public Service(IVehicleRepository repo) {
     
    }

    public long calculateParkingCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        return 0;
       
    }

    public void saveVehicle(Vehicle veh) {
       
    }

    public List<Vehicle> listVehicles() {
       List Vehicles = new ArrayList<Vehicle>();       
        return Vehicles;
    }
    
}
