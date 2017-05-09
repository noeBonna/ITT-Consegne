/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import java.time.LocalDate;

/**
 *
 * @author Marco
 */
public abstract class Delivery {
    
    protected LocalDate date;
    protected String note;
    
    protected Delivery(LocalDate date, String note) {
        this.setLocalDate(date);
        this.setNote(note);
    }
    
    @Override
    public abstract String toString();
    
    public LocalDate getLocalDate(){
        return this.date;
    }
    
    public String getNote(){
        return this.note;
    }
    
    public boolean setNote(String note){
        if (note!=null){
            this.note = note;
            return true;
        }
        else return false;
    }
    
    public boolean setLocalDate(LocalDate date){
        if (date!=null){
            this.date = date;
            return true;
        }
        else return false;
    }
    
}
