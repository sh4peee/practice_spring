package kalashnikov.v.s.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/v1/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }
}
