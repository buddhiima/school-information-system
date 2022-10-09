package springfield.academy.schoolinformationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfield.academy.schoolinformationsystem.modal.Student;
import springfield.academy.schoolinformationsystem.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // constructor
    @Autowired
    public StudentService(StudentRepository studentRepository) {this.studentRepository = studentRepository;}

    // get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // delete a student record
    public void deleteStudent(int indexNo) { studentRepository.deleteById(indexNo); }
}

