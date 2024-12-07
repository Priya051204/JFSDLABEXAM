package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Vehicle 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(name = "vname", length = 50)
private String name;

@Column(name = "vtype", length = 20)
private String type;

@Column(name = "max_speed")
private int maxSpeed;

@Column(name = "vcolor", length = 30)
private String color;

// Getters and Setters
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

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public int getMaxSpeed() {
    return maxSpeed;
}

public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}
}