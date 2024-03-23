package com.tobeto.java4aPair4.entities;
import jakarta.persistence.*;


@Table(name="orders")
@Entity

public class Order {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="total")
    private double total;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
