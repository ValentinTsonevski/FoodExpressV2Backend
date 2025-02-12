package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
