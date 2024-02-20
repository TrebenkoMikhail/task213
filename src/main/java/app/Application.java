package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

    private final AnimalsCage animalsCage;

    private final Timer timer;
    @Autowired
    public Application(AnimalsCage animalsCage, Timer timer) {
        this.animalsCage = animalsCage;
        this.timer = timer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            animalsCage.whatAnimalSay();
        }
        timer.printTime();
    }
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
        Timer timer = applicationContext.getBean(Timer.class);
        timer.printTime();
        Application application = applicationContext.getBean(Application.class);
        application.run();
    }

}
