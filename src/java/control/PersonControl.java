package control;

import entity.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonControl {
    
    public Person getPerson() {
        return new Person("Danny", 22);
    }
    
    public List<Person> getPersons() {        
        List<Person> list = new ArrayList<Person>();
        
        list.add(new Person("Emil", 22));
        list.add(new Person("Morten", 24));
        list.add(new Person("Ulrik", 29));
        list.add(new Person("Jens", 23));
        
        return list;
    }
    
    public void addPerson(Person person) {
        System.out.println(person.getAge() + "yo, " + "name: " + person.getName());
    }
    
}
