/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ClassManager;

import Delivery.Children.FailedDelivery;
import Delivery.Children.SucceededDelivery;
import Interface.DeliveriesWriter;
import Interface.ShipmentRepository;
import Shipment.Shipment;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class MyShipmentRepository implements ShipmentRepository{

    private DeliveriesWriter dw;
    private ShipmentRepository sr;
    
    
    public class MyShipmentRepository(DeliveriesWriter DeliveryWriter, ShipmentRepository sr){
       
    }
    
    @Override
    public ArrayList<Shipment> getAll() {
        
    }

    @Override
    public ArrayList<SucceededDelivery> getDeliveried() {
    }

    @Override
    public ArrayList<FailedDelivery> getNonDeliveried() {
    }

    @Override
    public Shipment getByTracking() {
    }

    @Override
    public boolean update(Shipment shipment) {
    }

    @Override
    public boolean add(Shipment shipment) {
    }
    
}
