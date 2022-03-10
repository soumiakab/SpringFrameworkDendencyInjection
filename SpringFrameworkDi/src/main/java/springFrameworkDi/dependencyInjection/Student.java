package springFrameworkDi.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFrameworkDi.Person;

public class Student {

    private Person person;
    private String specialty;
    private String formationYear;
    //competence

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

    public Student(String specialty, String formationYear) {
        this.person=applicationContext.getBean(Person.class);
        this.specialty = specialty;
        this.formationYear = formationYear;
        person.created();
        System.out.println("student instance");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getFormationYear() {
        return formationYear;
    }

    public void setFormationYear(String formationYear) {
        this.formationYear = formationYear;
    }
}
