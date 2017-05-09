/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

import Delivery.Children.FailedDelivery;
import Delivery.Children.SucceededDelivery;
import Delivery.Delivery;
import Recipient.Recipient;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Shipment {
    
    private String tracking;
    private Recipient recipient;
    private float weight;
    private ArrayList<Delivery> delivery;

    public Shipment(String tracking, Recipient recipient, float weight,ArrayList<Delivery> delivery) {
        this.setTracking(tracking);
        this.setRecipient(recipient);
        this.setWeight(weight);
        this.setDelivery(delivery);
    }

    public String getTracking() {
        return tracking;
    }

    public boolean setTracking(String tracking) {
        if ((tracking != null) && (!tracking.isEmpty())){
            this.tracking = tracking;
            return true;
        }
        else return false;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public boolean setRecipient(Recipient recipient) {
        if (recipient!=null){
            this.recipient = recipient;
            return true;
        }
        else return false;
    }

    public float getWeight() {
        return weight;
    }

    public boolean setWeight(float weight) {
        if (weight>=0){
            this.weight = weight;
            return true;
        }
        else return false;
    }

    public boolean setDelivery(ArrayList<Delivery> delivery) {
        if (delivery!=null){
            this.delivery = delivery;
            return true;
        }
        else return false;
    }
    
    
    
    public String toString(){
            return "\n" + "\t" +"\t" + "SHIPMENT" + "\n" + "\t" + "Tracking: " + this.getTracking()  +  "\n" + "\t" + "Weight: " + this.getWeight() + "\n" + this.recipient.toString();   
    }
    
    public ArrayList<Delivery> getDeliveries (){
        return delivery;
    }
    
    public boolean isDelivery(){
        if (delivery.get(delivery.size()-1) instanceof SucceededDelivery){
            return true;
        }
        else return false;
    }
    
    public Delivery createSucceededDelivery(SucceededDelivery s){
        if (s!=null){
            delivery.add(s);
            return delivery.get(delivery.size());
        }
        else return null;
    }
    
    public Delivery createFailedDelivery(FailedDelivery s){
        if (s!=null){
            delivery.add(s);
            return delivery.get(delivery.size());
        }
        else return null;
    }
    
    
            
}
