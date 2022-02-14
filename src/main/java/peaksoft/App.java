package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld =  applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorld.getMessage());
        System.out.println(helloWorld==bean);
        System.out.println(bean.equals(helloWorld));

        Cat one = applicationContext.getBean("cat", Cat.class);
        System.out.println(one);
        Cat two = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println(two);
        System.out.println(one==two);
        System.out.println(two.equals(one));

    }
}
