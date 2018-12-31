package peter.spring_profile.spring_pofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import peter.spring_profile.spring_pofile.controllers.GreetingController;

@SpringBootApplication
public class SpringPofileApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringPofileApplication.class, args);

        GreetingController controller = ctx.getBean(GreetingController.class);
        controller.sayHello();
    }
}

