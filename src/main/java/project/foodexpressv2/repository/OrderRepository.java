package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
