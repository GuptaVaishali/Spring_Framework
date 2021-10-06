package com.ttn.spring.basics.demo;

public class TrainTicket implements TravelMedium{
    public String travelTicket(String from,String to){
        System.out.println("Train Ticket Booked");
        return "Train booked from " + from + " to " + to;
    }
}


/*
------------ Tight Coupling ------------------
public class TrainTicket {
    public String travelTicket(String from,String to){
        System.out.println("Train Ticket Booked");
        return "Train booked from " + from + " to " + to;
    }
}

 */
