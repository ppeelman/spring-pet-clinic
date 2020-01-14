package com.philippe.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; // use a box type so it can be null, recommendation of Hibernate!

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
