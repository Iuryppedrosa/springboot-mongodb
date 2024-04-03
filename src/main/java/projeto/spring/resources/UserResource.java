package projeto.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import projeto.spring.domain.User;
import projeto.spring.dto.UserDTO;
import projeto.spring.services.UserServices;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices userServices;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> user = userServices.findAll();
        List<UserDTO> userDTO = user.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable String id){
        User user = userServices.findById(id);
        return ResponseEntity.ok().body(new UserDTO(user));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody UserDTO userDTO) {
        User user = userServices.fromDTO(userDTO);
        userServices.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}
