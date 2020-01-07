/*
 * *
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;


public class PaymentTwoCardsPayment extends Payment {

    private Integer installment;


    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Integer getInstallment() {
        return installment;
    }
}
