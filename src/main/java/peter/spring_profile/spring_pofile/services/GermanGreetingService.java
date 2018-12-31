package peter.spring_profile.spring_pofile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
public class GermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Grüße";
    }
}
