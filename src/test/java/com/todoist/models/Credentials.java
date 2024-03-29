package com.todoist.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credentials {

    private String name;
    private String content;
    @JsonProperty("project_id")
    private String projectId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProject_id(String projectId) {
        this.projectId = projectId;
    }
}
