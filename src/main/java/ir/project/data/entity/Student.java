package ir.project.data.entity;

import ir.project.data.enums.Role;
import ir.project.data.enums.Status;

import java.util.List;


public class Student extends User{
    private List<Course> courses;

    public Student() {
        super();
        setRole(Role.STUDENT);
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public User setFirstname(String firstname) {
        return super.setFirstname(firstname);
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public User setLastname(String lastname) {
        return super.setLastname(lastname);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public User setEmailAddress(String emailAddress) {
        return super.setEmailAddress(emailAddress);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public User setPassword(String password) {
        return super.setPassword(password);
    }

    @Override
    public Role getRole() {
        return super.getRole();
    }

    @Override
    public User setRole(Role role) {
        return super.setRole(role);
    }

    @Override
    public Status getStatus() {
        return super.getStatus();
    }

    @Override
    public User setStatus(Status status) {
        return super.setStatus(status);
    }
}
