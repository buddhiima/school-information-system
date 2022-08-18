package springfield.academy.schoolinformationsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfield.academy.schoolinformationsystem.modal.Grade;
import springfield.academy.schoolinformationsystem.service.GradeService;

import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class GradeController {

    private final GradeService gradeService;

    // constructor
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("")
    public ResponseEntity<List<Grade>> getAllGrades() {
        List<Grade> grades = gradeService.getAllGrades();
        return new ResponseEntity<>(grades, HttpStatus.OK);
    }
}
