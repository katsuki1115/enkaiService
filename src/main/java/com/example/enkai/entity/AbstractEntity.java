package com.example.enkai.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@Data
@MappedSuperclass
public class AbstractEntity {
    @Column
    private Date modifiedAt;

    @Column(updatable = false)
    private Date createdAt;

    @PrePersist
    public void onPrePersist() {
        setModifiedAt(new Date());
        setCreatedAt(new Date());
    }

    @PreUpdate
    public void onPreUpdate() {
        setModifiedAt(new Date());
    }
}