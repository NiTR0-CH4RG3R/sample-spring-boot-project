package com.buddhimaz.sample_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {
    @Id
    private Long id;

    private String name;

    @OneToMany( mappedBy = "university" )
    private List<Department> departments;
}
