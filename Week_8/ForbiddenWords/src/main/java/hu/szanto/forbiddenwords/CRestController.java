package hu.szanto.forbiddenwords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("examplev2")
public class CRestController {
    private final BService service;

    @Autowired
    // Konstruktoron az @Autowired elhagyható...
    public CRestController(BService service1) {
        this.service = service1;
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
