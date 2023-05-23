package hu.nye.progkor.clothes.repository;

import hu.nye.progkor.clothes.model.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingRepository extends JpaRepository<Clothing, Long> {
}
