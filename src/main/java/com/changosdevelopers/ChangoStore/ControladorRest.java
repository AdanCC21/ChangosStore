package com.changosdevelopers.ChangoStore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/hola")
    public String Hola(){
        return "Hola Mundo";
    }

}
