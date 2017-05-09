/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recipient;

/**
 *
 * @author Marco
 */
public class Recipient {
    
    private String name;
    private String city;
    private String street;
    private int cap;

    public Recipient(String name, String city, String street, int cap) {
        this.setName(name);
        this.setCity(city);
        this.setStreet(street);
        this.setCap(cap);
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if ((name!=null) && (!name.isEmpty())){
            this.name = name;
            return true;
        }
        else return false;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if ((city!=null) && (!city.isEmpty())){
            this.city = city;
            return true;
        }
        else return false;
    }

    public String getStreet() {
        return street;
    }

    public boolean setStreet(String street) {
        if ((street!=null) && (!street.isEmpty())){
            this.street = street;
            return true;
        }
        else return false;    
    }

    public int getCap() {
        return cap;
    }

    public boolean setCap(int cap) {
        if ((cap<50000)&&(cap>=10000)){
            this.cap=cap;
            return true;
        }
        else return false;
      }

    @Override
    public String toString() {
        return "\t" + "\t" + "Recipient" +"\n" + "\t" + "Name: " + name + "\n" + "\t" + "City: " + city + "\n" + "\t" + "Street: " + street + "\n" + "\t" + "Cap: " + cap;
    }
    
    
    
}
