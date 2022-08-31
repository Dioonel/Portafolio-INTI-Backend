package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.models.About;
import com.portafolio.backend.portafolio.services.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/about")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    @GetMapping
    public About getAbout(){
        return aboutService.getAbout();
    }

    @PutMapping
    public About updateAbout(@RequestBody About updateAbout){
        return aboutService.updateAbout(updateAbout);
    }
}
