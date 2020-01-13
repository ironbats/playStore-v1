/*
 * *
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.domain;

import br.com.felipe.enums.PaymentStatus;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class BoletoPayment extends Payment implements Serializable {

    private static final long serialVersionUID = -7463602459853992L;
    private Date dateInvoice;
    private Date datePayment;


    public BoletoPayment() {

    }

    public BoletoPayment(Integer id, PaymentStatus paymentStatus, Order order, Date dateInvoice, Date datePayment) {
        super(id, paymentStatus, order);
        this.dateInvoice = dateInvoice;
        this.datePayment = datePayment;
    }


    public void setDateInvoice(Date dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }


    public Date getDateInvoice() {
        return dateInvoice;
    }

    public Date getDatePayment() {
        return datePayment;
    }
}
