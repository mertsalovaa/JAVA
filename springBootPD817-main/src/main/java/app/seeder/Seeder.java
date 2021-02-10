package app.seeder;

import app.entities.Role;
import app.entities.User;
import app.repositories.RoleRepository;
import app.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

public class Seeder {

    public static void fillUsers(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        Role role = new Role();
        role.setName("user");
        User user1 = new User();
        user1.setEmail("iryna@gmail.com");
        user1.setName("Iryna");
        roleRepository.save(role);
        user1.setRoles(roleRepository.findAll());
        user1.setPassword(passwordEncoder.encode("1234567890"));

        userRepository.save(user1);

        User user2 = new User();
        user2.setEmail("kate@gmail.com");
        user2.setName("Kate");
        user2.setPassword(passwordEncoder.encode("0987654321"));
        user2.setRoles(roleRepository.findAll());
        userRepository.save(user2);
    }
}
