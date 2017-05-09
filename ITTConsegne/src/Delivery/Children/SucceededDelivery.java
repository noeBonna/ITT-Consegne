/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery.Children;

import Delivery.Delivery;
import Recipient.Recipient;
import java.time.LocalDate;

/**
 *
 * @author Marco
 */
public class SucceededDelivery extends Delivery {


    private String sign;
    
    public SucceededDelivery(LocalDate date, String note, String sign){
        super(date,note);
        this.setSign(sign);
    }
    
    public boolean setSign(String sign){
        if ((sign!=null)&& (!sign.isEmpty())){
            this.sign = sign;
            return true;
        }
        else return false;
    }
    
    public String getSign(){
        return this.sign;
    }
    
    @Override
    public String toString() {
        return   "\t" + "\t"+ "SUCCEEDED DELIVERY" + "\n" + "\t" + "Sign: " + sign + "\n" + "\t" + "Date: " + super.getLocalDate() + "\n" + "\t" + "Note: "  + super.getNote();
    }
    
}
