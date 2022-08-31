package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.models.Header;
import com.portafolio.backend.portafolio.services.HeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
public class HeaderController {
    @Autowired
    private HeaderService headerService;

    @GetMapping
    public Header getHeader(){
        return headerService.getHeader();
    }

    @PutMapping
    public Header updateHeader(@RequestBody Header updatedHeader){
        return headerService.updateHeader(updatedHeader);
    }
}
