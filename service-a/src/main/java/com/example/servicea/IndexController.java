package com.example.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * gateway-test
 * test index
 * </p>
 *
 * @author beiluo1994@gmail.com
 * @since 2020-11-30 21:27
 **/
@RestController
public class IndexController {

    @GetMapping("serviceb")
    public String serviceA(){
        return "this is service A";
    }
}
