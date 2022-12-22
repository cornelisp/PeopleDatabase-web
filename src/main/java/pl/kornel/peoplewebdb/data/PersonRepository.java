package pl.kornel.peoplewebdb.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kornel.peoplewebdb.biz.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
