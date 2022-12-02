package Tarento.com.Flightserviceexample.repository;

import Tarento.com.Flightserviceexample.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
