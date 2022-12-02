package Tarento.com.Flightserviceexample.utils;

//import jdk.internal.access.JavaSecurityAccess;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String,Double> paymenMap=new HashMap<>();
  static   {
        paymenMap.put("acc1",12000.0);
        paymenMap.put("acc2",10000.0);
        paymenMap.put("acc3",5000.0);
        paymenMap.put("acc4",8000.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount) throws IllegalAccessException {//..

        if(paidAmount > paymenMap.get(accNo)){
            throw new IllegalAccessException("insufficient fund..!");
        }else{
            return true;
        }
    }
}
