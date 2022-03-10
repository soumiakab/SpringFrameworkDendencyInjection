package app;

import constructExample.GeometryExample1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setterExample.GeometryExample2;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
        geometryBean1.drawShape();

        GeometryExample2 geometryBean2 = context.getBean("geometryExample2", GeometryExample2.class);
        geometryBean2.drawShape();

    }
}
