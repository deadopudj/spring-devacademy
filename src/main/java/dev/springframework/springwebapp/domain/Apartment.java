package dev.springframework.springwebapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table (name = "APARTMENT")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "APARTMENT_ID")
    private Long id;
    @Column
    private String title;
    @Column
    private String subtitle;
    @Column
    private String description;
    @Column
    private String type;
    @Column
    private Integer categoraization;

    @OneToMany
    @JoinColumn(name = "apartment_id");
    private Set <Reservation> reservations = new HashSet<>();

    public Apartment() {

    }

    public Apartment(String title, String subtitle, String description, String type, Integer categorization) {
        this.title = title;
        this.subtitle = subtitle;
        this.type = type;
        this.categoraization = categorization;
        this.description = description;


    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCategoraization() {
        return categoraization;
    }

    public void setCategoraization(Integer categoraization) {
        this.categoraization = categoraization;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", categoraization=" + categoraization +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Objects.equals(id, apartment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
