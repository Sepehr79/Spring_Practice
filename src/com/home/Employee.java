/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

/**
 *
 * @author NP-soft
 */
public class Employee {
    
    private int id;
    private String name;
    private Address address;
    
    public Employee(){}
    
    public Employee(String name, int id, Address address){
        super();
        this.name = name;
        this.id = id;
        this.address = address;
    }
    
    public void show(){  
        System.out.println(id+" "+name+" "+address);  
    }  
}
