package com.fiap._ecb;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sensorId;

    private Double sensorValue;

    private LocalDateTime timestamp;

    public Reading() {}

    public Reading(String sensorId, Double sensorValue) {
        this.sensorId = sensorId;
        this.sensorValue = sensorValue;
    }

    @PrePersist
    public void prePersist() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
    }

    public Long getId() {
        return id;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public Double getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(Double sensorValue) {
        this.sensorValue = sensorValue;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
