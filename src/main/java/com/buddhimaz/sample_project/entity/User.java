package com.buddhimaz.sample_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn
    private Address address;
}
