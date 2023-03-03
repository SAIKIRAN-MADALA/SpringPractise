package com.product.ProjectInfoGraphics.controller;

import com.product.ProjectInfoGraphics.model.ProjectRequest;
import com.product.ProjectInfoGraphics.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping
    public ResponseEntity<Long> createProject(@RequestBody ProjectRequest projectRequest){
        long projectId = projectService.addProject(projectRequest);
        return new ResponseEntity<>(projectId, HttpStatus.OK);
    }

}
