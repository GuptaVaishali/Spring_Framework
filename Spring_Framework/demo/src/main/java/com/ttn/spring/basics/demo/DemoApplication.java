package com.ttn.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//--- Tight Coupling ------
		//	BookTicketImp bookTicketImp = new BookTicketImp();

		//------- Loose Coupling --------
		//BookTicketImp bookTicketImp = new BookTicketImp(new AirTicket());

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BookTicketImp bookTicketImp = applicationContext.getBean(BookTicketImp.class);
		String source_dest = bookTicketImp.bookTicket("Delhi","Goa");
		System.out.println(source_dest);
	}

}
