
/*
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "abstractOrder")
public class Order implements Serializable {
    private static final long serialVersionUID = -4288995611694656494L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateInstance;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "order")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "deliveryAddress_id")
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
