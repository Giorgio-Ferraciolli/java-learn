package com.exemplo.medtracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String characteristics; // ex: Comprimido, Xarope, 500mg
    private String timeToTake; // Horário, ex: "08:00"

    // Construtores
    public Medication() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getCharacteristics() { return characteristics; }
    public void setCharacteristics(String characteristics) { this.characteristics = characteristics; }
    
    public String getTimeToTake() { return timeToTake; }
    public void setTimeToTake(String timeToTake) { this.timeToTake = timeToTake; }
}
