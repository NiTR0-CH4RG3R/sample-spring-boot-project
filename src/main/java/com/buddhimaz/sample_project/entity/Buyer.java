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
public class Buyer {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "buyer")
    private List<BuyerItemReview> reviews;
}
