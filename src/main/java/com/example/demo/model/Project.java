package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Project {

    private String name;
    private Date startDate;
    private int team;

    Project(String name, Date startDate, int team) {
        this.name = name;
        this.startDate = startDate;
        this.team = team;
    }

    public static ProjectBuilder builder() {
        return new ProjectBuilder();
    }


    public static class ProjectBuilder {
        private String name;
        private Date startDate;
        private int team;

        ProjectBuilder() {
        }

        public ProjectBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProjectBuilder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public ProjectBuilder team(int team) {
            this.team = team;
            return this;
        }

        public Project build() {
            return new Project(name, startDate, team);
        }

        public String toString() {
            return "Project.ProjectBuilder(name=" + this.name + ", startDate=" + this.startDate + ", team=" + this.team + ")";
        }
    }
}
