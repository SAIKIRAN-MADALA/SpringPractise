package com.product.ProjectInfoGraphics.controller;

import com.product.ProjectInfoGraphics.model.ProjectRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @RequestMapping("/home")
    public ProjectRequest sendRequest(){
        return ProjectRequest.builder()
                .ownerEmailId("saikiranmadala10@gmail.com")
                .projectOwner("saikiran")
                .projectDescription("Demo Project")
                .projectDescription("Demo Project")
                .build();
    }

}
