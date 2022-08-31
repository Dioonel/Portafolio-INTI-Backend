package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.About;
import com.portafolio.backend.portafolio.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImplementation implements AboutService {
    @Autowired
    private AboutRepository aboutRepo;


    @Override
    public About getAbout() {
        return aboutRepo.findById(1).orElse(null);
    }

    @Override
    public About updateAbout(About updatedAbout) {
        About about = this.getAbout();
        about.setSpanish(updatedAbout.getSpanish());
        about.setEnglish(updatedAbout.getEnglish());
        return aboutRepo.save(about);
    }
}
