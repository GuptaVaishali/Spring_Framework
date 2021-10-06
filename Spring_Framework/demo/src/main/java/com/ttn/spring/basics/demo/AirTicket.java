package com.ttn.spring.basics.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AirTicket implements TravelMedium{
    public String travelTicket(String from,String to){
        System.out.println("Air Ticket Booked");
        return "Flight Ticket booked from " + from + " to " + to;
    }
}


/*
---------- Tight Coupling ------------------
public class AirTicket {
    public String travelTicket(String from,String to){
        System.out.println("Air Ticket Booked");
        return "Flight Ticket booked from " + from + " to " + to;
    }
} */
