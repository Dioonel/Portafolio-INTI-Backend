package com.portafolio.backend.portafolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String spanish;
    private String english;


    public About() {
    }

    public About(int id, String spanish, String english) {
        this.id = id;
        this.spanish = spanish;
        this.english = english;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}

