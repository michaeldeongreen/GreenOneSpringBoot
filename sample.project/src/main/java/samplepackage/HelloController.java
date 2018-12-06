package samplepackage;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        String debug = "debug";
        return "Greetings from Spring Boot";
    }

}
