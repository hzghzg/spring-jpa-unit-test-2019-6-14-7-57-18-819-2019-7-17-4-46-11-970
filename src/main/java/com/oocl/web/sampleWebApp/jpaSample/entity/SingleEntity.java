package com.oocl.web.sampleWebApp.jpaSample.entity;

import javax.persistence.*;
import java.lang.reflect.GenericArrayType;

@Entity
public class SingleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 64)
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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
