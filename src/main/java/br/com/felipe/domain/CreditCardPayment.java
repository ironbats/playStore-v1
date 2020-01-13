/*
 * *
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;

import br.com.felipe.enums.PaymentStatus;

import javax.persistence.Entity;

@Entity
public class CreditCardPayment extends Payment {

    private Integer installment;

    public CreditCardPayment() {
    }

    public CreditCardPayment(Integer id, PaymentStatus paymentStatus, Order order, Integer installment) {
        super(id, paymentStatus, order);
        this.installment = installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Integer getInstallment() {
        return installment;
    }
}
