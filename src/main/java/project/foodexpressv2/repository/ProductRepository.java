package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
