package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.About;


public interface AboutService {
    public About getAbout();
    public About updateAbout(About updatedAbout);

}
