package com.oocl.web.sampleWebApp.jpaSample.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class RelatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length =64,nullable = false)
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private SingleEntity singleEntity;

    public RelatedEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SingleEntity getSingleEntity() {
        return singleEntity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSingleEntity(SingleEntity singleEntity) {
        this.singleEntity = singleEntity;
    }
}
