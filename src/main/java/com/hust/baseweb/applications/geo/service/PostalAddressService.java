package com.hust.baseweb.applications.geo.service;

import com.hust.baseweb.applications.geo.entity.PostalAddress;
import org.springframework.stereotype.Service;

@Service
public interface PostalAddressService {
    public PostalAddress save(String address, String latitude, String longitude);
}
