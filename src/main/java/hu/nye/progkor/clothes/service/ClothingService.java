package hu.nye.progkor.clothes.service;

import hu.nye.progkor.clothes.model.Clothing;

import java.util.List;

public interface ClothingService {

    Clothing createClothing(Clothing clothing);
    Clothing getClothingById(Long id);
    List<Clothing> getAllClothing();
    Clothing updateClothing(Clothing clothing);
    void deleteClothing(Long id);
}
