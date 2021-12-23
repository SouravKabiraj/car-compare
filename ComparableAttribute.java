package com.craft.carcompare.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "tblBodyType")
@Entity
@Getter
@Setter
@ToString
public class ComparableAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    ComparableAttributeName attributeName;
    String carModelId;
    String value;

    public ComparableAttribute() {
    }

    public ComparableAttribute(ComparableAttributeName attributeName, String carModelId, String value) {
        this.attributeName = attributeName;
        this.carModelId = carModelId;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparableAttribute that = (ComparableAttribute) o;
        return attributeName == that.attributeName && Objects.equals(carModelId, that.carModelId) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeName, carModelId, value);
    }
}
