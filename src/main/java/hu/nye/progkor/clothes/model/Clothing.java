package hu.nye.progkor.clothes.model;

import hu.nye.progkor.clothes.model.enums.ClothingCategory;
import hu.nye.progkor.clothes.model.enums.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Clothing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Size size;
    private String material;
    private ClothingCategory category;
}
