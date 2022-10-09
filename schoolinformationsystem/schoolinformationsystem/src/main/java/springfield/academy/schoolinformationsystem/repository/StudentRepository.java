package springfield.academy.schoolinformationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springfield.academy.schoolinformationsystem.modal.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
