package com.portafolio.backend.portafolio.components;

import com.portafolio.backend.portafolio.models.About;
import com.portafolio.backend.portafolio.models.Header;
import com.portafolio.backend.portafolio.models.User;
import com.portafolio.backend.portafolio.repository.AboutRepository;
import com.portafolio.backend.portafolio.repository.HeaderRepository;
import com.portafolio.backend.portafolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SingleDataInitializer implements ApplicationRunner {
    @Autowired
    private HeaderRepository headerRepo;

    @Autowired
    private AboutRepository aboutRepo;

    @Autowired
    private UserRepository userRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Header header = headerRepo.findById(1).orElse(null);
        if(header == null || (header.getName() == null && header.getPosition() == null && header.getCountry() == null && header.getBanner() == null && header.getPp() == null)) {
            Header initHeader = new Header(1, "Placeholder name", "Unknown", "Unknown", "", "");
            headerRepo.save(initHeader);
        }

        About about = aboutRepo.findById(1).orElse(null);
        if(about == null || (about.getSpanish() == null && about.getEnglish() == null)) {
            About initAbout = new About(1, "Test spanish", "Test english");
            aboutRepo.save(initAbout);
        }

        User user = userRepo.findById(1).orElse(null);
        if(user == null){
            BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passEncoder.encode("admin123");
            User userInit = new User(1, "dionel", encodedPassword);
            userRepo.save(userInit);
        }
    }
}
