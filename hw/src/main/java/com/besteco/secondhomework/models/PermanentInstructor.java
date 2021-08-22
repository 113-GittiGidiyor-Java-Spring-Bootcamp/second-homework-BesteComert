package com.besteco.secondhomework.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "permenant_instructor")
public class PermanentInstructor extends Instructor{

    private Double fixedSalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentInstructor that = (PermanentInstructor) o;
        return Objects.equals(fixedSalary, that.fixedSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fixedSalary);
    }
}