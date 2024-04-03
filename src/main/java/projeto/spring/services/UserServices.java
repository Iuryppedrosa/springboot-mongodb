package projeto.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.spring.domain.User;
import projeto.spring.dto.UserDTO;
import projeto.spring.repository.UserRepository;
import projeto.spring.services.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id) {

        Optional<User> user = userRepository.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public User fromDTO(UserDTO userDTos){
        return new User(userDTos.getId(), userDTos.getName(), userDTos.getEmail());
    }
}
