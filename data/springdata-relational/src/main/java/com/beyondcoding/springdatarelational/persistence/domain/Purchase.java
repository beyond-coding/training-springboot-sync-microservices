package com.beyondcoding.springdatarelational.persistence.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Purchase {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Item> items = new HashSet<>();

    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private LocalDateTime timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Double.compare(purchase.price, price) == 0 &&
                id.equals(purchase.id) &&
                items.equals(purchase.items) &&
                currency == purchase.currency &&
                timestamp.equals(purchase.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, items, price, currency, timestamp);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", items=" + items +
                ", price=" + price +
                ", currency=" + currency +
                ", timestamp=" + timestamp +
                '}';
    }
}
