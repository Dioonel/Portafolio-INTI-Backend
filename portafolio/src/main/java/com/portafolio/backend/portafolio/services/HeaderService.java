package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Header;

public interface HeaderService {
    public Header getHeader();
    public Header updateHeader(Header updatedHeader);
}
