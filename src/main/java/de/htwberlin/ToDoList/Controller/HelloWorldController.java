package de.htwberlin.ToDoList.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World!";
    }

}
