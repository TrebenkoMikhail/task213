import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorld1.getMessage());
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Are cat1 and cat2 the same object? " + (cat1 == cat2));
        HelloWorld helloWorld2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("Are helloWorld1 and helloWorld2 the same object? " + (helloWorld1 == helloWorld2));
    }
}