package com.ohai.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/build")
public class BuildInfoController {
    @GetMapping("/info")
    String getBuildInfo() {
        // http://localhost:8080/build/info
        return "<h1 style='text-align: center'>Running... UP!</h1>";
    }
}
