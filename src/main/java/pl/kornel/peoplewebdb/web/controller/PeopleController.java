package pl.kornel.peoplewebdb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kornel.peoplewebdb.biz.model.Person;
import pl.kornel.peoplewebdb.data.PersonRepository;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private PersonRepository personRepository;

    public PeopleController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @ModelAttribute("people")
    public Iterable<Person> getPeople() {
        return personRepository.findAll();
    }

    @GetMapping
    public String showPeoplePage() {
        return "people";
    }

    @ModelAttribute
    public Person getPerson() {
        return new Person();
    }

    @PostMapping
    public String savePerson(Person person) {
        System.out.println(person);
        personRepository.save(person);
        return "redirect:people";
    }

}
