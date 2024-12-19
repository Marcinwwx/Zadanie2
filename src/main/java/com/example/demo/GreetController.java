import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@PostMapping("/greet")
public String greet(@RequestBody String name) {
    return "Hello, " + name + "!";
}
