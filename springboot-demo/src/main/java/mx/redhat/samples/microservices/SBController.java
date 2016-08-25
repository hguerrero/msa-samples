package mx.redhat.samples.microservices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SBController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
