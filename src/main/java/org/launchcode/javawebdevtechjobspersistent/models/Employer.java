package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //To map to a table
public class Employer extends AbstractEntity {

    public Employer() {} //No-arg constructor required by Hibernate to create object

    @NotBlank(message = "Location is required.")
    @Size(message = "Less than 40 characters.", max = 40)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
