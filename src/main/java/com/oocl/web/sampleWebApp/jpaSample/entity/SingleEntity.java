package com.oocl.web.sampleWebApp.jpaSample.entity;

import javax.persistence.Entity;

@Entity
public class SingleEntity {
    private Long id;
    private String name;
    public SingleEntity() {
    }

    public SingleEntity(String name) {
        this.name = name;
    }

    public SingleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
