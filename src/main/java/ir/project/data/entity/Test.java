package ir.project.data.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Test {
    private String title;
    private String description;
    private int minute;
    //@Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    private Date endTime;
    private List<Course> courses;
    private Set<Question> questions;

    public Test() {
    }

    public String getTitle() {
        return title;
    }

    public Test setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Test setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getMinute() {
        return minute;
    }

    public Test setMinute(int minute) {
        this.minute = minute;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Test setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Test setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Test setCourses(List<Course> courses) {
        this.courses = courses;
        return this;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public Test setQuestions(Set<Question> questions) {
        this.questions = questions;
        return this;
    }
}
