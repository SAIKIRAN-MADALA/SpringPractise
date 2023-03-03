package com.product.ProjectInfoGraphics.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectRequest {
    private String projectName;
    private String projectDescription;
    private String projectOwner;
    private String ownerEmailId;
}
