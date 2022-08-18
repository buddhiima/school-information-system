package springfield.academy.schoolinformationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfield.academy.schoolinformationsystem.modal.Grade;
import springfield.academy.schoolinformationsystem.repository.GradeRepository;

import java.util.List;

@Service
public class GradeService {

    private final GradeRepository gradeRepository;

    // constructor
    @Autowired
    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    // get all grades
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }
}
