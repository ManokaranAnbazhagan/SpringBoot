package Tarento.com.Flightserviceexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PAYMENT_INFO")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator =  "uuid2")
    @GenericGenerator(name="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;
    private String accountNo;
    private String amount;
    private String cardType;
    private String passengerId;

    public static void validateCreditLimit(String accountNo, double fare) {
    }

    public void setPaymentId(Long pId) {
    }

    public String getAccountNo(double fare) {
        return null;
    }
}
