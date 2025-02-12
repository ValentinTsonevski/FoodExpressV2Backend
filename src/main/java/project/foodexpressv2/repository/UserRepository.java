package project.foodexpressv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.foodexpressv2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}