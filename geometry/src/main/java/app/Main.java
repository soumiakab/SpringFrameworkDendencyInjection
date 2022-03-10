package app;

import constructExample.GeometryExample1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setterExample.GeometryExample2;

public class Main {

    public static void main(String[] args) {

        //définit les fonctionnalités de base de conteneur.
        // quelques fonctionnalités supplémentaires comme une gestion d'événements et de ressources
        //ClassPathXmlApplicationContext charge la définition du contexte à partir d'un fichier XML contenu dans le classpath.
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
        // La méthode getBean() qui attend en paramètre l'identifiant de l'objet permet d'obtenir une instance de cet objet selon la configuration fournie au conteneur.
        geometryBean1.drawShape();
/*
        GeometryExample2 geometryBean2 = context.getBean("geometryExample2", GeometryExample2.class);
        geometryBean2.drawShape();
*/
    }
}
