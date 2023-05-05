package hu.nye.progkor.clothes.controller;

import hu.nye.progkor.clothes.model.Clothing;
import hu.nye.progkor.clothes.service.ClothingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/clothing")
public class ClothingController {

    private final ClothingService clothingService;

    @PostMapping
    public ResponseEntity createClothing(@RequestBody Clothing clothing) {
        Clothing savedClothing = clothingService.createClothing(clothing);
        return ResponseEntity.ok(savedClothing);
    }

    @GetMapping
    public ResponseEntity getAllClothing() {
        return ResponseEntity.ok(clothingService.getAllClothing());
    }

    @GetMapping("/{id}")
    public ResponseEntity getClothingById(@PathVariable Long id) {
        return ResponseEntity.ok(clothingService.getClothingById(id));
    }

    @PutMapping
    public ResponseEntity updateClothing(@RequestBody Clothing clothing) {
        return ResponseEntity.ok(clothingService.updateClothing(clothing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteClothing(@PathVariable Long id) {
        clothingService.deleteClothing(id);
        return ResponseEntity.ok().build();
    }
}
