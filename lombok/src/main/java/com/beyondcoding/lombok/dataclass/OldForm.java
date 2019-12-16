package com.beyondcoding.lombok.dataclass;

import com.beyondcoding.lombok.Nationality;

import java.time.LocalDateTime;
import java.util.Objects;

public class OldForm {

    private String id;
    private String firstName;
    private String lastName;
    private Nationality nationality;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldForm form = (OldForm) o;
        return Objects.equals(id, form.id) &&
                Objects.equals(firstName, form.firstName) &&
                Objects.equals(lastName, form.lastName) &&
                nationality == form.nationality &&
                Objects.equals(arrivalDate, form.arrivalDate) &&
                Objects.equals(departureDate, form.departureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, nationality, arrivalDate, departureDate);
    }

    @Override
    public String toString() {
        return "Form{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality=" + nationality +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                '}';
    }
}
