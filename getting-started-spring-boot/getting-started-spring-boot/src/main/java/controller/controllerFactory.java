package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerFactory {

    @GetMapping("/hello")
    public String helloWorking(){
        return "I am from Controller-Factory";
    }
}
