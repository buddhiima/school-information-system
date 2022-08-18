package springfield.academy.schoolinformationsystem.modal;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int subject_id;
    private String subject_name;
    private int grade;
    private String teacher_name;

    // constructor
    public Subject() {
    }

    // getters and setters
    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
