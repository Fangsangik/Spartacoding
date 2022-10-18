package NewProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {

        @GetMapping
        public Person getPerson();
        Person person = new Person() {
    person.setName("황상익");
    person.setAddress("동탄");
    person.setAge("28");
    person.setJob("연구원");
    return person;
        }

    }
}
