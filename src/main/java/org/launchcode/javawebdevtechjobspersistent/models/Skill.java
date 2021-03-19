package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity //To map to a table
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @Size(message = "Less than 1000 characters.", max = 1000)
    private String description;

    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}