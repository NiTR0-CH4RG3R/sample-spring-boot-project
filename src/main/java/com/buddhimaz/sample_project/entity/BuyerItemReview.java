package com.buddhimaz.sample_project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
class BuyerItemReviewKey implements Serializable {
    private Long buyerId;
    private Long itemId;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( this.getClass() != o.getClass() ) return false;
        BuyerItemReviewKey other = (BuyerItemReviewKey)o;
        return Objects.equals(this.buyerId, other.buyerId) && Objects.equals(this.itemId, other.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash( this.buyerId, this.itemId );
    }
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyerItemReview {
    @EmbeddedId
    private BuyerItemReviewKey id;

    @ManyToOne
    @MapsId("buyerId")
    @JoinColumn
    private Buyer buyer;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn
    private Item item;

    private Integer rating;
}
