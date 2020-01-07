/*
 * *
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;

import br.com.felipe.enums.PaymentStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {
    private static final long serialVersionUID = 3809093607421598932L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer paymentStatus;
    private Order order;

    public Payment() {
    }

    public Payment(Integer id , PaymentStatus paymentStatus, Order order) {
        this.id=id;
        this.paymentStatus = paymentStatus.getCode();
        this.order = order;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public Order getOrder() {
        return order;
    }
}
