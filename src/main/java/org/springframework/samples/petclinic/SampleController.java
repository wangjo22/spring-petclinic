package org.springframework.samples.petclinic;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    String keesun;

    @GetMapping("/context")
    @LogExecutionTime
    public String context() {
        return "HELLO " + keesun;
    }

}
