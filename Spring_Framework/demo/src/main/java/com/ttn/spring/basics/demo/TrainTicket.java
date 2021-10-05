package com.ttn.spring.basics.demo;

public class TrainTicket {
    public String travelTicket(String from,String to){
        System.out.println("Train Ticket Booked");
        return "Train booked from " + from + " to " + to;
    }
}
