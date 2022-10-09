package springfield.academy.schoolinformationsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfield.academy.schoolinformationsystem.modal.Student;
import springfield.academy.schoolinformationsystem.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    // constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // get all the students
    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // delete a student record
    @DeleteMapping(("/delete/{indexNo}"))
    public void deleteStudent(@PathVariable int indexNo) {
        studentService.deleteStudent(indexNo);
    }
}
