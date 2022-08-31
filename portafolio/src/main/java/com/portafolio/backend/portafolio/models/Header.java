package com.portafolio.backend.portafolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String country;
    private String position;
    private String banner;
    private String pp;


    public Header() {
    }

    public Header(int id, String name, String country, String position, String banner, String pp) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.position = position;
        this.banner = banner;
        this.pp = pp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }
}
