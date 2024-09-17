package com.dockerimg.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/uri")
    public String getMessage() {

        return "Running Docker and upgrades successfully";
    }
}
