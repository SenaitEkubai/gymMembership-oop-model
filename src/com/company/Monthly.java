package com.company;

import java.math.BigDecimal;

/*This class is responsible for keeping track of first payment amount
 * and monthly payment amount*/
public class Monthly extends Payment {
    BigDecimal monthlyPayment;


    public BigDecimal calculateMonthlyPayment() {
        this.monthlyPayment = getAmount().divide(BigDecimal.valueOf(12));
        return monthlyPayment;
    }

    @Override
    public void setPaymentMethod(String paymentType) {
        super.setPaymentMethod("monthly");
    }


}
