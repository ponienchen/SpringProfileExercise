package peter.spring_profile.spring_pofile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//This sets the default profile to use ONLY when "spring.profiles.active" is not specified
//in the application.properties
@Profile({"en", "default"})
//@Profile("en")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - greetings";
    }
}
