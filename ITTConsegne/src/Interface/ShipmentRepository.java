/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Delivery.Children.FailedDelivery;
import Delivery.Children.SucceededDelivery;
import Shipment.Shipment;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public interface ShipmentRepository {
    
    public ArrayList <Shipment> getAll();
    public ArrayList <SucceededDelivery> getDeliveried();
    public ArrayList <FailedDelivery> getNonDeliveried();
    public Shipment getByTracking();
    public boolean update(Shipment shipment);
    public boolean add (Shipment shipment);
    
}
