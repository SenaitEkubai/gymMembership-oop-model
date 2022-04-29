package com.company;

import java.math.BigDecimal;
/*
this class is responsible for keeping track of payment amount
*/

public class Payment {
    private static BigDecimal amount = BigDecimal.valueOf(300);
    private static String paymentMethod = "annual";


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        Payment.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        Payment.amount = amount;
    }


}
