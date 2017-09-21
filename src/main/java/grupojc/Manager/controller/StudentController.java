package grupojc.Manager.controller;

import grupojc.Manager.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentController extends CrudRepository<Student, Long>{
}