package grupojc.Manager.controller;

import grupojc.Manager.model.Career;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CareerController extends CrudRepository<Career, Long>{
}