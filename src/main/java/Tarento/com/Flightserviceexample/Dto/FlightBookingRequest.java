package Tarento.com.Flightserviceexample.Dto;

import Tarento.com.Flightserviceexample.entity.PassengerInfo;
import Tarento.com.Flightserviceexample.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
