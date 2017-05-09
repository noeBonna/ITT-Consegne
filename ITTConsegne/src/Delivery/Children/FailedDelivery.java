/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery.Children;

import Delivery.Delivery;
import java.time.LocalDate;



/**
 *
 * @author Marco
 */
public class FailedDelivery extends Delivery {

    public FailedDelivery(LocalDate date, String note) {
        super(date, note);
    }
    
    
    
    @Override
    public String toString() {
        return "\t" + "\t" + "FAILED DELIVERY" + "\n" + "\t" + super.getNote() + "\n" + "\t" + "Date:" + super.getLocalDate();
    }

    
    
    
}
