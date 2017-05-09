/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ittconsegne;

import Delivery.Children.FailedDelivery;
import Delivery.Children.SucceededDelivery;
import Delivery.Delivery;
import Recipient.Recipient;
import Shipment.Shipment;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class ITTConsegne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recipient r = new Recipient("Marco","Castelnovo di Sotto", "G.Pascoli", 42024);
        System.out.println(r.toString());
        //Delivery Creation 4 ArrayList
      
        FailedDelivery f = new FailedDelivery(LocalDate.now(),"Consegna Fallita!" );
        FailedDelivery l = new FailedDelivery(LocalDate.now(),"Consegna Fallita!" );
        //ArrayList Creation Test Classes
        ArrayList<Delivery> consegne = new ArrayList<Delivery> ();
        consegne.add(f);
        consegne.add(l);
        
        
       
    }
    
}
