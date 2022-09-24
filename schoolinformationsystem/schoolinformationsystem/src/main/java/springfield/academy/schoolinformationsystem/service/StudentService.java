package springfield.academy.schoolinformationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfield.academy.schoolinformationsystem.modal.Student;
import springfield.academy.schoolinformationsystem.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // constructor
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    public void updateStudent(Student student) {
//        student = studentRepository.findById(student.getIndexNo())
//              .orElseThrow(() -> new IllegalStateException("Student with index dose not exist"));
//                if(student.getName() != null && student.getName().length() > 0 && !Objects.equals(student.getName(),student.getName())){
//                    student.setName(student.getName());
//                }
//                if(student.getGrade() != null && student.getGrade().length() > 0 && !Objects.equals(student.getGrade(),student.getGrade())){
//                    student.setGrade(student.getGrade());
//                }
//                if(student.getAddress() != null && student.getAddress().length() > 0 && !Objects.equals(student.getAddress(),student.getAddress())){
//                    student.setGrade(student.getAddress());
//                }
//                if(student.getContact() != null && student.getContact().length() > 0 && !Objects.equals(student.getContact(),student.getContact())){
//                    student.setGrade(student.getContact());
//                }
try{
          studentRepository.save(student);

    }catch(Exception e){

  }

}
}

