package springFrameworkDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFrameworkDi.dependencyInjection.Student;

public class Main {
    public static  void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Student student=new Student("java","2");
    }
}
