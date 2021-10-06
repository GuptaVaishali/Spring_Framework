package com.ttn.spring.basics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookTicketImp {
    TravelMedium travelMedium;

    @Value("Have a safe journey")
    String trip;

    @Autowired
    //Constructor injection
    BookTicketImp(TravelMedium travelMedium){
        this.travelMedium = travelMedium;
    }
    public String bookTicket(String from,String to){
        String ticket = travelMedium.travelTicket(from,to);
        return ticket;
    }

    /*
    //Tight Coupling
    public String bookTicket(String from,String to){
        AirTicket airTicket = new AirTicket();
        String ticket = airTicket.travelTicket(from,to);
        return ticket;
    }
     */

}
