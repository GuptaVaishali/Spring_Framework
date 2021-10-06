package com.ttn.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//---Tight Coupling------
		//	BookTicketImp bookTicketImp = new BookTicketImp();

		//Loose Coupling
		BookTicketImp bookTicketImp = new BookTicketImp(new AirTicket());
		String source_dest = bookTicketImp.bookTicket("Delhi","Goa");
		System.out.println(source_dest);

		SpringApplication.run(DemoApplication.class, args);
	}

}
