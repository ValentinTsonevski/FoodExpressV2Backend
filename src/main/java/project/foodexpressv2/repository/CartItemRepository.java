package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
