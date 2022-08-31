package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Header;
import com.portafolio.backend.portafolio.repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderServiceImplementation implements HeaderService {
    @Autowired
    private HeaderRepository headerRepo;


    @Override
    public Header getHeader() {
        return headerRepo.findById(1).orElse(null);
    }

    @Override
    public Header updateHeader(Header updatedHeader) {
        Header header = this.getHeader();
        header.setBanner(updatedHeader.getBanner());
        header.setPp(updatedHeader.getPp());
        header.setCountry(updatedHeader.getCountry());
        header.setName(updatedHeader.getName());
        header.setPosition(updatedHeader.getPosition());
        return headerRepo.save(header);
    }
}
