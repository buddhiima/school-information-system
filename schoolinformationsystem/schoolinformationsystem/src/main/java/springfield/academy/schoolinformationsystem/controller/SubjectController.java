package springfield.academy.schoolinformationsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfield.academy.schoolinformationsystem.modal.Subject;
import springfield.academy.schoolinformationsystem.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/{grade}")
    public ResponseEntity<List<Subject>> getSubjectsByGrade(@PathVariable("grade") int grade) {
        List<Subject> subjects = subjectService.getSubjectsByGrade(grade);
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }
}
