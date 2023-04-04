package hu.szanto.forbiddenwords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("example")
public class ARestController {
    private final BService service;

    @Autowired
    // Konstruktoron az @Autowired elhagyható...
    public ARestController(BService service) {
        this.service = service;
    }

    @GetMapping
    public void get() {
        System.out.println("Get.");
        service.printService();
    }

    @PostMapping
    public void post() {
        System.out.println("Post.");
        service.printService();
    }

    @DeleteMapping
    public void delete() {
        System.out.println("Delete.");
        service.printService();
    }
}
