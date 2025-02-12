package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
