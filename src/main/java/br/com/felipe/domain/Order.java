
/*
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Order implements Serializable {
    private static final long serialVersionUID = -4288995611694656494L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateInstance;
    private Payment payment;
    private Customer customer;
    private Address deliveryAddress;
    private String orderCode;

    public Order() {
    }

    public Order(Date dateInstance, Payment payment, Customer customer, Address deliveryAddress, String orderCode) {
        super();
        this.dateInstance = dateInstance;
        this.payment = payment;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.orderCode = orderCode;

    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDateInstance(Date dateInstance) {
        this.dateInstance = dateInstance;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getDateInstance() {
        return dateInstance;
    }

    public Payment getPayment() {
        return payment;
    }
}
