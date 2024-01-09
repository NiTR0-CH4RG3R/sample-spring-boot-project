package com.buddhimaz.sample_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Degree {
    @Id
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable
    private List<Course> courses;
}
