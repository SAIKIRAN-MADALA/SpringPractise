package com.product.ProjectInfoGraphics.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    @Column(name = "PROJECT_NAME")
    private String projectName;
    @Column(name = "PROJECT_DESCRIPTION")
    private String projectDescription;
    @Column(name = "PROJECT_OWNER")
    private String projectOwner;
    @Column(name = "PROJECT_EmailId")
    private String projectEmailId;
}
