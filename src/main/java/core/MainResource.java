package core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
