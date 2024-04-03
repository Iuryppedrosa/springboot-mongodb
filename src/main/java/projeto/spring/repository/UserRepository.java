package projeto.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import projeto.spring.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
