package com.product.ProjectInfoGraphics.service;

import com.product.ProjectInfoGraphics.entity.Project;
import com.product.ProjectInfoGraphics.model.ProjectRequest;
import com.product.ProjectInfoGraphics.repository.ProjectRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public long addProduct(ProjectRequest projectRequest) {
        log.info("Adding Project ...{}");
        Project project
                = Project.builder()
                .projectName(projectRequest.getProjectName())
                .projectEmailId(projectRequest.getOwnerEmailId())
                .projectDescription(projectRequest.getProjectDescription())
                .projectOwner(projectRequest.getProjectOwner())
                .build();
        project= projectRepository.save(project);

        return project.getProjectId();
    }
}
