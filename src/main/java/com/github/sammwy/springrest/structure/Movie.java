package com.github.sammwy.springrest.structure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String category;
    private int release;
    private double rate;

    public Movie() {
    }

    public Movie(String name, String description, String category, int release, double rate) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.release = release;
        this.rate = rate;
    }

    public Long getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public int getRelease() {
        return this.release;
    }

    public double getRate() {
        return this.rate;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
