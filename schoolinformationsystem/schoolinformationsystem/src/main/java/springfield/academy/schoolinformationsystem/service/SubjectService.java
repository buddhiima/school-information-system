package springfield.academy.schoolinformationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfield.academy.schoolinformationsystem.modal.Subject;
import springfield.academy.schoolinformationsystem.repository.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    // constructor
    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    // get subject by grade
    public List<Subject> getSubjectsByGrade(int grade) {
        return subjectRepository.findSubjectsByGrade(grade);
    }
}
