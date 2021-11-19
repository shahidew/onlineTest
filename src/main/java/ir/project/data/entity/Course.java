package ir.project.data.entity;

import ir.project.data.enums.Classification;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String Title;
    private String id;
    private Classification classification;
    private List<Professor> professors;
    private List<Student> students;
    private List<Test> tests = new ArrayList<>();
    public Course() {
    }

    public String getTitle() {
        return Title;
    }

    public Course setTitle(String title) {
        Title = title;
        return this;
    }

    public String getId() {
        return id;
    }

    public Course setId(String id) {
        this.id = id;
        return this;
    }

    public Classification getClassification() {
        return classification;
    }

    public Course setClassification(Classification classification) {
        this.classification = classification;
        return this;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public Course setProfessors(List<Professor> professors) {
        this.professors = professors;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    public List<Test> getTests() {
        return tests;
    }

    public Course setTests(List<Test> tests) {
        this.tests = tests;
        return this;
    }
}
