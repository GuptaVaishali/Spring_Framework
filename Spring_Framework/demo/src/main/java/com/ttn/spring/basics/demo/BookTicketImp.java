package com.ttn.spring.basics.demo;

public class BookTicketImp {

    //Tight Coupling
    public String bookTicket(String from,String to){
        AirTicket airTicket = new AirTicket();
        String ticket = airTicket.travelTicket(from,to);
        return ticket;
    }

}
