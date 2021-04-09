package com.ait.wine.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wines")
public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long wineId;
    @Column
    private String name;
    @Column
    private String grapes;
    @Column
    private String country;
    @Column
    private String region;
    @Column
    private String year;
    @Column
    private String picture;
    @Column
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "supplierWines")
    private List<Supplier> wineSuppliers = new ArrayList<>();

    public void wineSuppliers(Supplier supplier){
        wineSuppliers.add(supplier);
    }


    public Wine() {
    }

    public Wine(String name, String grapes, String country, String region, String year, String picture, String description) {
        this.name = name;
        this.grapes = grapes;
        this.country = country;
        this.region = region;
        this.year = year;
        this.picture = picture;
        this.description = description;
    }

    public long getId() {
        return wineId;
    }

    public void setId(long wineId) {
        this.wineId = wineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrapes() {
        return grapes;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
