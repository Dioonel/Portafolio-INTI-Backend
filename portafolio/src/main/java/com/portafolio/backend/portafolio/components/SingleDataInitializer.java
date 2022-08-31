package com.portafolio.backend.portafolio.components;

import com.portafolio.backend.portafolio.models.About;
import com.portafolio.backend.portafolio.models.Header;
import com.portafolio.backend.portafolio.repository.AboutRepository;
import com.portafolio.backend.portafolio.repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SingleDataInitializer implements ApplicationRunner {
    @Autowired
    private HeaderRepository headerRepo;

    @Autowired
    private AboutRepository aboutRepo;


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
    }
}
