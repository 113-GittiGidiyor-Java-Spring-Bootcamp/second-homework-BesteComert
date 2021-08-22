package com.besteco.secondhomework.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "guest_instructor")
public class GuestInstructor extends Instructor {

    private Double hourlySalary;

    public GuestInstructor() {
    }

    public GuestInstructor(Double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public GuestInstructor(String name, String phoneNumber, String email, Double hourlySalary) {
        super(name, phoneNumber, email);
        this.hourlySalary = hourlySalary;
    }

    public Double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(Double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "GuestInstructor{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GuestInstructor that = (GuestInstructor) o;
        return Objects.equals(hourlySalary, that.hourlySalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlySalary);
    }
}