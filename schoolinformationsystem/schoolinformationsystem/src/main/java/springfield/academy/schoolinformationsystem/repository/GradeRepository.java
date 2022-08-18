package springfield.academy.schoolinformationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springfield.academy.schoolinformationsystem.modal.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {

}
