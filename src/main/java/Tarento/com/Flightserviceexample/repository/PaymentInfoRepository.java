package Tarento.com.Flightserviceexample.repository;

import Tarento.com.Flightserviceexample.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
