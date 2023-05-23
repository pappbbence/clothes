package hu.nye.progkor.clothes.service.impl;

import hu.nye.progkor.clothes.exception.ClothingNotExistsException;
import hu.nye.progkor.clothes.model.Clothing;
import hu.nye.progkor.clothes.repository.ClothingRepository;
import hu.nye.progkor.clothes.service.ClothingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultClothingService implements ClothingService {

    private final ClothingRepository clothingRepository;
    @Override
    public Clothing createClothing(Clothing clothing) {
        return clothingRepository.save(clothing);
    }

    @Override
    public Clothing getClothingById(Long id) {
        return clothingRepository.findById(id).orElseThrow(
                () -> new ClothingNotExistsException("Clothing does not exists with id: " + id)
        );
    }

    @Override
    public List<Clothing> getAllClothing() {
        return clothingRepository.findAll();
    }

    @Override
    public Clothing updateClothing(Clothing clothing) {
        Clothing clothingToModify = clothingRepository.findById(clothing.getId()).orElseThrow(
                () -> new ClothingNotExistsException("Clothing does not exists with id: " + clothing.getId())
        );
        clothingToModify.setCategory(clothing.getCategory());
        clothingToModify.setSize(clothing.getSize());
        clothingToModify.setMaterial(clothing.getMaterial());
        return clothingRepository.save(clothingToModify);
    }

    @Override
    public void deleteClothing(Long id) {
        clothingRepository.deleteById(id);
    }
}
