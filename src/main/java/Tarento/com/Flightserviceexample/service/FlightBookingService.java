package Tarento.com.Flightserviceexample.service;

import Tarento.com.Flightserviceexample.Dto.FlightBookingRequest;
import Tarento.com.Flightserviceexample.Dto.FlightBookingAcknowledgement;
import Tarento.com.Flightserviceexample.entity.PassengerInfo;
import Tarento.com.Flightserviceexample.entity.PaymentInfo;
import Tarento.com.Flightserviceexample.repository.PaymentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfo passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Transactional //(readOnly = false,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED).......
    public FlightBookingAcknowledgement BookFlightTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);
        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPaymentId(passengerInfo.getPId());
        paymentInfo.getAccountNo(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCES",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }

}
