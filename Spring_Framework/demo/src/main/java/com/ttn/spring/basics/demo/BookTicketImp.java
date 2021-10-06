package com.ttn.spring.basics.demo;

public class BookTicketImp {
    TravelMedium travelMedium;

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
