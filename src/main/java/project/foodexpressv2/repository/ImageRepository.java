package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
