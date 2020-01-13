package br.com.felipe.domain;

import br.com.felipe.enums.CustomerType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 5802634023620223688L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String cpfOrCnpj;
    private Integer customerType;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name = "phones")
    private Set<String> phones = new HashSet<>();


    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name, String email, String cpfOrCnpj, CustomerType customerType) {
        super();
        this.name = name;
        this.email = email;
        this.cpfOrCnpj = cpfOrCnpj;
        this.customerType = customerType.getCod();

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType.getCod();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerType getCustomerType() {
        return CustomerType.toEnum(customerType);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
