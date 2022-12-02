package Tarento.com.Flightserviceexample;

import Tarento.com.Flightserviceexample.Dto.FlightBookingRequest;
import Tarento.com.Flightserviceexample.Dto.FlightBookingAcknowledgement;
import Tarento.com.Flightserviceexample.Dto.FlightBookingRequest;
import Tarento.com.Flightserviceexample.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {
	@Autowired
	private FlightBookingService service;
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookingAcknowledgement(@RequestBody FlightBookingRequest request){
		return service.BookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
