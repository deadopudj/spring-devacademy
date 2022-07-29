package dev.springframework.springwebapp.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table (name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "RESERVATION_ID")
    private Long id;
    @Column
    private Integer personCount;
    @Column
    private double price;
    @Column
    private Boolean freeCancellation = true;

    @ManyToOne
    @JoinColumn(name = "apartment_id")
    Apartment apartments;

    private Set <Apartment> apartment = new HashSet<>();
    public Reservation(){

    }

    public Reservation(Integer personCount, double price, Boolean freeCancellation){
        this.personCount = personCount;
        this.price = price;
        this.freeCancellation = freeCancellation;
    }
    public Set<Apartment> getApartments() {
        return apartment;
    }

    public void setApartments(Set<Apartment> apartments) {
        this.apartment = apartment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public Boolean getFreeCancellation() {
        return freeCancellation;
    }

    public void setFreeCancellation(Boolean freeCancellation) {
        this.freeCancellation = freeCancellation;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", personCount=" + personCount +
                ", price=" + price +
                ", freeCancellation=" + freeCancellation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
